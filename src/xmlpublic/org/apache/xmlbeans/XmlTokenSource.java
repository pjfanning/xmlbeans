/*
* The Apache Software License, Version 1.1
*
*
* Copyright (c) 2003 The Apache Software Foundation.  All rights 
* reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions
* are met:
*
* 1. Redistributions of source code must retain the above copyright
*    notice, this list of conditions and the following disclaimer. 
*
* 2. Redistributions in binary form must reproduce the above copyright
*    notice, this list of conditions and the following disclaimer in
*    the documentation and/or other materials provided with the
*    distribution.
*
* 3. The end-user documentation included with the redistribution,
*    if any, must include the following acknowledgment:  
*       "This product includes software developed by the
*        Apache Software Foundation (http://www.apache.org/)."
*    Alternately, this acknowledgment may appear in the software itself,
*    if and wherever such third-party acknowledgments normally appear.
*
* 4. The names "Apache" and "Apache Software Foundation" must 
*    not be used to endorse or promote products derived from this
*    software without prior written permission. For written 
*    permission, please contact apache@apache.org.
*
* 5. Products derived from this software may not be called "Apache 
*    XMLBeans", nor may "Apache" appear in their name, without prior 
*    written permission of the Apache Software Foundation.
*
* THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
* OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
* ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
* SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
* LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
* USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
* OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
* OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
* SUCH DAMAGE.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation and was
* originally based on software copyright (c) 2000-2003 BEA Systems 
* Inc., <http://www.bea.com/>. For more information on the Apache Software
* Foundation, please see <http://www.apache.org/>.
*/

package org.apache.xmlbeans;

import weblogic.xml.stream.XMLInputStream;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.File;
import java.io.IOException;

import org.w3c.dom.Node;

import org.xml.sax.ContentHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.SAXException;

/**
 * Represents a holder of XML that can return an {@link XmlCursor}
 * or copy itself to various media such as
 * {@link Writer Writers} or {@link File Files}.
 * Both {@link XmlObject}
 * (and thus all XML Beans) and {@link XmlCursor} are
 * XmlTokenSource implementations.
 * 
 * @see XmlObject
 * @see XmlCursor
 */ 
public interface XmlTokenSource
{
    /**
     * Returns the synchronization object for the document.  If concurrent
     * multithreaded access to a document is required, the access should should
     * be protected by synchronizing on this monitor() object.  There is one
     * monitor per XML document tree.
     */
    Object monitor();
    
    /**
     * Returns the XmlDocumentProperties object for the document this token
     * source is associated with.
     */
    XmlDocumentProperties documentProperties();

    /**
     * Returns a new XML cursor.
     *
     * A cursor provides random access to all the tokens in the XML
     * data, plus the ability to extract strongly-typed XmlObjects
     * for the data. If the data is not read-only, the XML cursor
     * also allows modifications to the data.
     *
     * Using a cursor for the first time typically forces the XML
     * document into memory.
     */
    XmlCursor newCursor();

    /**
     * Returns a new XmlInputStream.
     *
     * The stream starts at the current begin-tag or begin-document
     * position and ends at the matching end-tag or end-document.
     *
     * This is a fail-fast stream, so if the underlying data is changed
     * while the stream is being read, the stream throws a
     * ConcurrentModificationException.
     *
     * Throws an IllegalStateException if the XmlTokenSource is not
     * positioned at begin-tag or begin-document (e.g., if it is at
     * an attribute).
     * @deprecated Superceded by JSR 173
     */
    XMLInputStream newXMLInputStream();
    
    /**
     * Returns standard XML text.
     *
     * The text returned represents the document contents starting at
     * the current begin-tag or begin-document and ending at the matching
     * end-tag or end-document. This is same content as newReader, but
     * it is returned as a single string.
     *
     * Throws an IllegalStateException if the XmlTokenSource is not
     * positioned at begin-tag or begin-document (e.g., if it is at
     * an attribute).
     */
    String xmlText();

    /**
     * Returns a new stream containing standard XML text, encoded
     * according to the given encoding.
     *
     * The byte stream contains contents starting at the current
     * begin-tag or begin-document and ending at the matching
     * end-tag or end-document.  The specified encoding is used
     * and also emitted in a PI at the beginning of the stream.
     *
     * This is a fail-fast stream, so if the underlying data is changed
     * while the stream is being read, the stream throws a
     * ConcurrentModificationException.
     *
     * Throws an IllegalStateException if the XmlTokenSource is not
     * positioned at begin-tag or begin-document (e.g., if it is at
     * an attribute).
     */
    InputStream newInputStream();

    /**
     * Returns a new character reader containing XML text.
     *
     * The contents of the reader represents the document contents
     * starting at the current begin-tag or begin-document and ending at
     * the matching end-tag or end-document.  No encoding annotation
     * will be made in the text itself.
     *
     * This is a fail-fast reader, so if the underlying data is changed
     * while the reader is being read, the reader throws a
     * ConcurrentModificationException.
     *
     * Throws an IllegalStateException if the XmlTokenSource is not
     * positioned at begin-tag or begin-document (e.g., if it is at
     * an attribute).
     */
    Reader newReader();
    
    /**
     * Returns a W3C DOM Node containing the XML
     * represented by this source.  This is a copy of the XML, it is
     * not a live with the underlying store of this token source.
     * If this is the document node, then a Document is returned, else
     * a DocumentFragment is returned.
     */
    Node newDomNode();

//    /**
//     * Returns a W3C DOM Node containing the XML represented by this source.
//     * This is a live DOM node, not a copy.  Any changes made through this node
//     * are immediately reflected in the document associated with this token
//     * source.  Depending on the kind of token this XmlTokenSource represents,
//     * an appropriate node will be returned.
//     */
//    Node getDomNode();

    /**
     * Writes the XML represented by this source to the given SAX content and
     * lexical handlers.
     */
    void save ( ContentHandler ch, LexicalHandler lh ) throws SAXException;
    
    /**
     * Writes the XML represented by this source to the given File.
     */
    void save ( File file ) throws IOException;
    
    /**
     * Writes the XML represented by this source to the given output stream.
     */
    void save ( OutputStream os ) throws IOException;

    /**
     * Writes the XML represented by this source to the given writer.
     */
    void save ( Writer w ) throws IOException;

    /**
     * <p>Just like newXMLInputStream() but with any of a number of options. Use the 
     * <em>options</em> parameter to specify the following:</p>
     * 
     * <table>
     * <tr><th>To specify this</th><th>Use this method</th></tr>
     * <tr>
     *  <td>The character encoding to use when converting the character
     *  data in the XML to bytess.</td>
     *  <td>{@link XmlOptions#setCharacterEncoding}</td>
     * </tr>
     * <tr>
     *  <td>Prefix-to-namespace mappings that should be assumed
     *  when saving this XML. This is useful when the resulting
     *  XML will be part of a larger XML document, ensuring that this 
     *  inner document will take advantage of namespaces defined in 
     *  the outer document.</td>
     *  <td>{@link XmlOptions#setSaveImplicitNamespaces}</td>
     * </tr>
     * <tr>
     *  <td>Suggested namespace prefixes to use when saving. Used only
     *  when a namespace attribute needs to be synthesized.</td>
     *  <td>{@link XmlOptions#setSaveSuggestedPrefixes}</td>
     * </tr>
     * <tr>
     *  <td>That namespace attributes should occur first in elements when
     * the XML is saved. By default, they occur last.</td>
     *  <td>{@link XmlOptions#setSaveNamespacesFirst}</td>
     * </tr>
     * <tr>
     *  <td>The XML should be pretty printed when saved. Note that this 
     *  should only be used for debugging.</td>
     *  <td>{@link XmlOptions#setSavePrettyPrint}</td>
     * </tr>
     * <tr>
     *  <td>The number of spaces to use when indenting for pretty printing. 
     *  The default is 2.</td>
     *  <td>{@link XmlOptions#setSavePrettyPrintIndent}</td>
     * </tr>
     * <tr>
     *  <td>The additional number of spaces indented from the left
     *  for pretty printed XML.</td>
     *  <td>{@link XmlOptions#setSavePrettyPrintOffset}</td>
     * </tr>
     * <tr>
     *  <td>To minimize the number of namespace attributes generated for the 
     *  saved XML. Note that this can reduce performance significantly.</td>
     *  <td>{@link XmlOptions#setSaveAggresiveNamespaces}</td>
     * </tr>
     * <tr>
     *  <td>To reduce the size of the saved document
     *  by allowing the use of the default namespace. Note that this can 
     *  potentially change the semantic meaning of the XML if unprefixed QNames are 
     *  present as the value of an attribute or element.</td>
     *  <td>{@link XmlOptions#setUseDefaultNamespace}</td>
     * </tr>
     * <tr>
     *  <td>To filter out processing instructions with the specified target name.</td>
     *  <td>{@link XmlOptions#setSaveFilterProcinst}</td>
     * </tr>
     * <tr>
     *  <td>Change the QName of the synthesized root element when saving. This 
     *  replaces "xml-fragment" with "fragment" in the namespace 
     *  http://www.openuri.org/fragment</td>
     *  <td>{@link XmlOptions#setSaveUseOpenFrag}</td>
     * </tr>
     * <tr>
     *  <td>Saving should begin on the element's contents.</td>
     *  <td>{@link XmlOptions#setSaveInner}</td>
     * </tr>
     * <tr>
     *  <td>Saving should begin on the element, rather than its contents.</td>
     *  <td>{@link XmlOptions#setSaveOuter}</td>
     * </tr>
     * <tr>
     *  <td>To rename the document element, or to specify the document element
     *  for this XML.</td>
     *  <td>{@link XmlOptions#setSaveSyntheticDocumentElement}</td>
     * </tr>
     * </table>
     * 
     * @see XmlOptions
     * 
     * @param options Any of the described options.
     * @return A new validating XMLInputStream.
     * @deprecated Superceded by JSR 173
     */
    XMLInputStream newXMLInputStream(XmlOptions options);

    /**
     * Just like xmlText() but with options.
     * Options map may be null.
     * @see XmlOptions
     */
    String xmlText(XmlOptions options);
    
    /**
     *
     * Just like newInputStream(String encoding) but with options.
     * Options map may be null.
     * @see XmlOptions
     */
    InputStream newInputStream(XmlOptions options);
    
    /**
     * Just like newReader() but with options.
     * Options map may be null.
     * @see XmlOptions
     */
    Reader newReader(XmlOptions options);
    
    /**
     * Just like newDomNode() but with options.
     * Options map may be null.
     * @see XmlOptions
     */

    Node newDomNode(XmlOptions options);
    
    /**
     * Writes the XML represented by this source to the given SAX content and
     * lexical handlers.
     */
    void save ( ContentHandler ch, LexicalHandler lh, XmlOptions options ) throws SAXException;
    
    /**
     * Writes the XML represented by this source to the given File.
     */
    void save ( File file, XmlOptions options ) throws IOException;
    
    /**
     * Writes the XML represented by this source to the given output stream.
     */
    void save ( OutputStream os, XmlOptions options ) throws IOException;

    /**
     * Writes the XML represented by this source to the given writer.
     */
    void save ( Writer w, XmlOptions options ) throws IOException;
}
