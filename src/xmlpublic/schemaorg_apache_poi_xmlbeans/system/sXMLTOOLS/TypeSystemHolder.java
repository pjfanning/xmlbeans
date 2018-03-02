/*   Copyright 2004-2018 The Apache Software Foundation
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
package schemaorg_apache_poi_xmlbeans.system.sXMLTOOLS;

import org.apache.poi.xmlbeans.SchemaTypeSystem;

public class TypeSystemHolder {
    public static final SchemaTypeSystem typeSystem = loadTypeSystem();

    private TypeSystemHolder() {
    }

    private static final SchemaTypeSystem loadTypeSystem() {
        try {
            return (SchemaTypeSystem)Class.forName("org.apache.poi.xmlbeans.impl.schema.SchemaTypeSystemImpl", true,
                    TypeSystemHolder.class.getClassLoader()).getConstructor(Class.class).newInstance(TypeSystemHolder.class);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot load org.apache.poi.xmlbeans.impl.SchemaTypeSystemImpl: make sure xbean.jar is on the classpath.", e);
        } catch (Exception e) {
            throw new RuntimeException("Could not instantiate SchemaTypeSystemImpl (" + e.toString() + "): is the version of xbean.jar correct?", e);
        }
    }
}