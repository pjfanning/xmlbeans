package org.apache.poi.xmlbeans.impl.xpathgen;

import org.apache.poi.xmlbeans.XmlException;

/**
 * An exception thrown if the XPath generation process can't complete
 */
public class XPathGenerationException extends XmlException
{
    public XPathGenerationException(String m)
    {
        super(m);
    }
}
