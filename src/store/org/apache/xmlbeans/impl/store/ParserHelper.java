/*   Copyright 2017 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans.impl.store;

import java.lang.reflect.Method;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

final class ParserHelper {

    private static final XBLogger logger = XBLogFactory.getLogger(ParserHelper.class);

    private static final SAXParserFactory factory = SAXParserFactory.newInstance();
    static {
        factory.setNamespaceAware(true);
        factory.setValidating(false);
        trySetSAXFeature(factory, XMLConstants.FEATURE_SECURE_PROCESSING, true);
    }

    private static void trySetSAXFeature(SAXParserFactory factory, String feature, boolean enabled) {
        try {
            factory.setFeature(feature, enabled);
        } catch (Exception e) {
            logger.log(XBLogger.WARN, "SAX Feature unsupported", feature, e);
        } catch (AbstractMethodError ame) {
            logger.log(XBLogger.WARN, "Cannot set SAX feature because outdated XML parser in classpath", feature, ame);
        }
    }
    
    private static void trySetXercesSecurityManager(SAXParser parser) {
        // Try built-in JVM one first, standalone if not
        for (String securityManagerClassName : new String[] {
                "com.sun.org.apache.xerces.internal.util.SecurityManager",
                "org.apache.xerces.util.SecurityManager"
        }) {
            try {
                Object mgr = Class.forName(securityManagerClassName).newInstance();
                Method setLimit = mgr.getClass().getMethod("setEntityExpansionLimit", Integer.TYPE);
                setLimit.invoke(mgr, 4096);
                parser.setProperty("http://apache.org/xml/properties/security-manager", mgr);
                // Stop once one can be setup without error
                return;
            } catch (Throwable e) {     // NOSONAR - also catch things like NoClassDefError here
                logger.log(XBLogger.WARN, "SAX Security Manager could not be setup", e);
            }
        }
    }
    
    static XMLReader newXMLReader() throws ParserConfigurationException, SAXException {
        SAXParser parser = factory.newSAXParser();
        trySetXercesSecurityManager(parser);
        return parser.getXMLReader();
    }
}



