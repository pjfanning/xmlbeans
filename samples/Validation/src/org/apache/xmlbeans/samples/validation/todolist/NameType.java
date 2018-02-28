/*
 * XML Type:  nameType
 * Namespace: http://xmlbeans.apache.org/samples/validation/todolist
 * Java type: org.apache.poi.xmlbeans.samples.validation.todolist.NameType
 *
 * Automatically generated - do not modify.
 */
package org.apache.poi.xmlbeans.samples.validation.todolist;


/**
 * An XML nameType(@http://xmlbeans.apache.org/samples/validation/todolist).
 *
 * This is an atomic type that is a restriction of org.apache.poi.xmlbeans.XmlString.
 */
public interface NameType extends org.apache.poi.xmlbeans.XmlString
{
    public static final org.apache.poi.xmlbeans.SchemaType type = (org.apache.poi.xmlbeans.SchemaType)schema.system.s59A663BF38731BA9F8026B121E40FDD3.TypeSystemHolder.typeSystem.resolveHandle("nametypeabebtype");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType newValue(java.lang.Object obj) {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) type.newValue( obj ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType newInstance() {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType newInstance(org.apache.poi.xmlbeans.XmlOptions options) {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.lang.String xmlAsString) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.lang.String xmlAsString, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.io.File file) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.io.File file, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.net.URL u) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.net.URL u, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.io.InputStream is) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.io.InputStream is, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.io.Reader r) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(java.io.Reader r, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(org.w3c.dom.Node node) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(org.w3c.dom.Node node, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.NameType parse(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.NameType) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
