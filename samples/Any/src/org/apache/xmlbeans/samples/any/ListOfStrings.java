/*
 * XML Type:  ListOfStrings
 * Namespace: http://xmlbeans.apache.org/samples/any
 * Java type: org.apache.poi.xmlbeans.samples.any.ListOfStrings
 *
 * Automatically generated - do not modify.
 */
package org.apache.poi.xmlbeans.samples.any;


/**
 * An XML ListOfStrings(@http://xmlbeans.apache.org/samples/any).
 *
 * This is a complex type.
 */
public interface ListOfStrings extends org.apache.poi.xmlbeans.XmlObject
{
    public static final org.apache.poi.xmlbeans.SchemaType type = (org.apache.poi.xmlbeans.SchemaType)schema.system.s6EF7A0057B3F4CED74AE6E05BCAAB5DB.TypeSystemHolder.typeSystem.resolveHandle("listofstringse467type");
    
    /**
     * Gets array of all "stringelement" elements
     */
    java.lang.String[] getStringelementArray();
    
    /**
     * Gets ith "stringelement" element
     */
    java.lang.String getStringelementArray(int i);
    
    /**
     * Gets (as xml) array of all "stringelement" elements
     */
    org.apache.poi.xmlbeans.XmlString[] xgetStringelementArray();
    
    /**
     * Gets (as xml) ith "stringelement" element
     */
    org.apache.poi.xmlbeans.XmlString xgetStringelementArray(int i);
    
    /**
     * Returns number of "stringelement" element
     */
    int sizeOfStringelementArray();
    
    /**
     * Sets array of all "stringelement" element
     */
    void setStringelementArray(java.lang.String[] stringelementArray);
    
    /**
     * Sets ith "stringelement" element
     */
    void setStringelementArray(int i, java.lang.String stringelement);
    
    /**
     * Sets (as xml) array of all "stringelement" element
     */
    void xsetStringelementArray(org.apache.poi.xmlbeans.XmlString[] stringelementArray);
    
    /**
     * Sets (as xml) ith "stringelement" element
     */
    void xsetStringelementArray(int i, org.apache.poi.xmlbeans.XmlString stringelement);
    
    /**
     * Inserts the value as the ith "stringelement" element
     */
    void insertStringelement(int i, java.lang.String stringelement);
    
    /**
     * Appends the value as the last "stringelement" element
     */
    void addStringelement(java.lang.String stringelement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stringelement" element
     */
    org.apache.poi.xmlbeans.XmlString insertNewStringelement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stringelement" element
     */
    org.apache.poi.xmlbeans.XmlString addNewStringelement();
    
    /**
     * Removes the ith "stringelement" element
     */
    void removeStringelement(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.poi.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.poi.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings newInstance() {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings newInstance(org.apache.poi.xmlbeans.XmlOptions options) {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.lang.String xmlAsString) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.lang.String xmlAsString, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.io.File file) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.io.File file, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.net.URL u) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.net.URL u, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.io.InputStream is) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.io.InputStream is, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.io.Reader r) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(java.io.Reader r, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(javax.xml.stream.XMLStreamReader sr, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(org.w3c.dom.Node node) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(org.w3c.dom.Node node, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.samples.any.ListOfStrings parse(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.poi.xmlbeans.samples.any.ListOfStrings) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
