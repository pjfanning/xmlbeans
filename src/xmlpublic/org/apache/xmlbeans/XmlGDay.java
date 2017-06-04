/*   Copyright 2004 The Apache Software Foundation
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

package org.apache.xmlbeans;

import javax.xml.stream.XMLStreamReader;


import java.util.Calendar;


/**
 * Corresponds to the XML Schema
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#gDay">xs:gDay</a> type.
 * A gDay specifies only a day-of-month.
 * <p>
 * Convertible to {@link Calendar}, {@link GDate}, or an int.
 * 
 * @see XmlCalendar
 * @see GDate
 */ 
public interface XmlGDay extends XmlAnySimpleType
{
    /** The constant {@link SchemaType} object representing this schema type. */
    public static final SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_gDay");
    
    /** Returns this value as a {@link Calendar} */
    Calendar getCalendarValue();
    /** Sets this value as a {@link Calendar} */
    void setCalendarValue(Calendar c);
    /** Returns this value as a {@link GDate} */
    GDate getGDateValue();
    /** Sets this value as a {@link GDateSpecification} */
    void setGDateValue(GDate gd);
    /** Returns this value as an int from 1-31 */
    int getIntValue();
    /** Sets this value as an int from 1-31 */
    void setIntValue(int v);

    /**
     * Returns this value as a {@link Calendar}
     * @deprecated replaced with {@link #getCalendarValue}
     **/
    Calendar calendarValue();
    /**
     * Sets this value as a {@link Calendar}
     * @deprecated replaced with {@link #setCalendarValue}
     **/
    void set(Calendar c);
    /**
     * Returns this value as a {@link GDate}
     * @deprecated replaced with {@link #getGDateValue}
     **/
    GDate gDateValue();
    /**
     * Sets this value as a {@link GDateSpecification}
     * @deprecated replaced with {@link #setGDateValue}
     **/
    void set(GDateSpecification gd);
    /**
     * Returns this value as an int from 1-31
     * @deprecated replaced with {@link #getIntValue}
     **/
    int intValue();
    /**
     * Sets this value as an int from 1-31
     * @deprecated replaced with {@link #setIntValue}
     **/
    void set(int v);
    
    /**
     * A class with methods for creating instances
     * of {@link XmlGDay}.
     */
    public static final class Factory
    {
        /** Creates an empty instance of {@link XmlGDay} */
        public static XmlGDay newInstance() {
          return (XmlGDay) XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** Creates an empty instance of {@link XmlGDay} */
        public static XmlGDay newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (XmlGDay) XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** Creates an immutable {@link XmlGDay} value */
        public static XmlGDay newValue(Object obj) {
          return (XmlGDay) type.newValue( obj ); }
        
        /** Parses a {@link XmlGDay} fragment from a String. For example: "<code>&lt;xml-fragment&gt;---14&lt;/xml-fragment&gt;</code>". */
        public static XmlGDay parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        /** Parses a {@link XmlGDay} fragment from a String. For example: "<code>&lt;xml-fragment&gt;---14&lt;/xml-fragment&gt;</code>". */
        public static XmlGDay parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        /** Parses a {@link XmlGDay} fragment from a File. */
        public static XmlGDay parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        /** Parses a {@link XmlGDay} fragment from a File. */
        public static XmlGDay parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        /** Parses a {@link XmlGDay} fragment from a URL. */
        public static XmlGDay parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        /** Parses a {@link XmlGDay} fragment from a URL. */
        public static XmlGDay parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        /** Parses a {@link XmlGDay} fragment from an InputStream. */
        public static XmlGDay parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        /** Parses a {@link XmlGDay} fragment from an InputStream. */
        public static XmlGDay parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        /** Parses a {@link XmlGDay} fragment from a Reader. */
        public static XmlGDay parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        /** Parses a {@link XmlGDay} fragment from a Reader. */
        public static XmlGDay parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        /** Parses a {@link XmlGDay} fragment from a DOM Node. */
        public static XmlGDay parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        /** Parses a {@link XmlGDay} fragment from a DOM Node. */
        public static XmlGDay parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** Parses a {@link XmlGDay} fragment from an XMLStreamReader. */
        public static XmlGDay parse(javax.xml.stream.XMLStreamReader xsr) throws org.apache.xmlbeans.XmlException {
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( xsr, type, null ); }
        
        /** Parses a {@link XmlGDay} fragment from an XMLStreamReader. */
        public static XmlGDay parse(javax.xml.stream.XMLStreamReader xsr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException{
          return (XmlGDay) XmlBeans.getContextTypeLoader().parse( xsr, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

