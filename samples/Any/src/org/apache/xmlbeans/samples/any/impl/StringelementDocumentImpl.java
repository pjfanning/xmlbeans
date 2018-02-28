/*
 * An XML document type.
 * Localname: stringelement
 * Namespace: http://xmlbeans.apache.org/samples/any
 * Java type: org.apache.poi.xmlbeans.samples.any.StringelementDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.poi.xmlbeans.samples.any.impl;
/**
 * A document containing one stringelement(@http://xmlbeans.apache.org/samples/any) element.
 *
 * This is a complex type.
 */
public class StringelementDocumentImpl extends org.apache.poi.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.poi.xmlbeans.samples.any.StringelementDocument
{
    
    public StringelementDocumentImpl(org.apache.poi.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGELEMENT$0 = 
        new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/any", "stringelement");
    
    
    /**
     * Gets the "stringelement" element
     */
    public java.lang.String getStringelement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.poi.xmlbeans.SimpleValue target = null;
            target = (org.apache.poi.xmlbeans.SimpleValue)get_store().find_element_user(STRINGELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringelement" element
     */
    public org.apache.poi.xmlbeans.XmlString xgetStringelement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.poi.xmlbeans.XmlString target = null;
            target = (org.apache.poi.xmlbeans.XmlString)get_store().find_element_user(STRINGELEMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stringelement" element
     */
    public void setStringelement(java.lang.String stringelement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.poi.xmlbeans.SimpleValue target = null;
            target = (org.apache.poi.xmlbeans.SimpleValue)get_store().find_element_user(STRINGELEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.poi.xmlbeans.SimpleValue)get_store().add_element_user(STRINGELEMENT$0);
            }
            target.setStringValue(stringelement);
        }
    }
    
    /**
     * Sets (as xml) the "stringelement" element
     */
    public void xsetStringelement(org.apache.poi.xmlbeans.XmlString stringelement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.poi.xmlbeans.XmlString target = null;
            target = (org.apache.poi.xmlbeans.XmlString)get_store().find_element_user(STRINGELEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.poi.xmlbeans.XmlString)get_store().add_element_user(STRINGELEMENT$0);
            }
            target.set(stringelement);
        }
    }
}
