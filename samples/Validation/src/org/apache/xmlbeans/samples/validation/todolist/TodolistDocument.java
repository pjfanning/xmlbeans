/*
 * An XML document type.
 * Localname: todolist
 * Namespace: http://xmlbeans.apache.org/samples/validation/todolist
 * Java type: org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.poi.xmlbeans.samples.validation.todolist;


/**
 * A document containing one todolist(@http://xmlbeans.apache.org/samples/validation/todolist) element.
 *
 * This is a complex type.
 */
public interface TodolistDocument extends org.apache.poi.xmlbeans.XmlObject
{
    public static final org.apache.poi.xmlbeans.SchemaType type = (org.apache.poi.xmlbeans.SchemaType)schema.system.s59A663BF38731BA9F8026B121E40FDD3.TypeSystemHolder.typeSystem.resolveHandle("todolist637cdoctype");
    
    /**
     * Gets the "todolist" element
     */
    org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument.Todolist getTodolist();
    
    /**
     * Sets the "todolist" element
     */
    void setTodolist(org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument.Todolist todolist);
    
    /**
     * Appends and returns a new empty "todolist" element
     */
    org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument.Todolist addNewTodolist();
    
    /**
     * An XML todolist(@http://xmlbeans.apache.org/samples/validation/todolist).
     *
     * This is a complex type.
     */
    public interface Todolist extends org.apache.poi.xmlbeans.XmlObject
    {
        public static final org.apache.poi.xmlbeans.SchemaType type = (org.apache.poi.xmlbeans.SchemaType)schema.system.s59A663BF38731BA9F8026B121E40FDD3.TypeSystemHolder.typeSystem.resolveHandle("todolist39fcelemtype");
        
        /**
         * Gets array of all "item" elements
         */
        org.apache.poi.xmlbeans.samples.validation.todolist.ItemType[] getItemArray();
        
        /**
         * Gets ith "item" element
         */
        org.apache.poi.xmlbeans.samples.validation.todolist.ItemType getItemArray(int i);
        
        /**
         * Returns number of "item" element
         */
        int sizeOfItemArray();
        
        /**
         * Sets array of all "item" element
         */
        void setItemArray(org.apache.poi.xmlbeans.samples.validation.todolist.ItemType[] itemArray);
        
        /**
         * Sets ith "item" element
         */
        void setItemArray(int i, org.apache.poi.xmlbeans.samples.validation.todolist.ItemType item);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "item" element
         */
        org.apache.poi.xmlbeans.samples.validation.todolist.ItemType insertNewItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "item" element
         */
        org.apache.poi.xmlbeans.samples.validation.todolist.ItemType addNewItem();
        
        /**
         * Removes the ith "item" element
         */
        void removeItem(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument.Todolist newInstance() {
              return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument.Todolist) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument.Todolist newInstance(org.apache.poi.xmlbeans.XmlOptions options) {
              return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument.Todolist) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument newInstance() {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument newInstance(org.apache.poi.xmlbeans.XmlOptions options) {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.lang.String xmlAsString) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.lang.String xmlAsString, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.io.File file) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.io.File file, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.net.URL u) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.net.URL u, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.io.InputStream is) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.io.InputStream is, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.io.Reader r) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(java.io.Reader r, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(org.w3c.dom.Node node) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(org.w3c.dom.Node node, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument parse(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.poi.xmlbeans.samples.validation.todolist.TodolistDocument) org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.poi.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.poi.xmlbeans.xml.stream.XMLInputStream xis, org.apache.poi.xmlbeans.XmlOptions options) throws org.apache.poi.xmlbeans.XmlException, org.apache.poi.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.poi.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
