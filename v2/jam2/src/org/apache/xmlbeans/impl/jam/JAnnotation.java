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

package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.annotation.ValueMap;

/**
 * <p>Represents a metadata that is associated with a particular
 * JElement.  Note that JAnnoations are JElements, which means
 * that they themselves can have annotations, and can be treated as
 * nodes in a JAM hierarchy.</p>
 *
 * <p>Annotations can be simple or complex.  Values of simple
 * annotations can be retrieved via the various get...Value() methods.
 * Complex attributes can be navigated via the getAnnotations() method
 * which exposes nested attributes (which may in turn be either simple
 * or complex.</p>
 *
 * @author Patrick Calahan &lt;email: pcal-at-bea-dot-com&gt;
 */
public interface JAnnotation extends JElement {

  // ========================================================================
  // Public methods

  /**
   * <p>If a typed annotation proxy has been registered for the annotation
   * represented by this JAnnotation, returns this object.  Note that
   * it's usually easier to access proxies by simply calling
   * JAnnotatedElement.getAnnotationProxy(proxyClass).</p>
   *
   * <p>The value returned is guaranteed to be either a user-defined
   * subclass of TypedAnnotationProxyBase or null.</p>
   */
  public Object getProxy();

  /**
   * <p>Returns a structure which provides untyped, "by-name" access
   * to this annotation's data members.</p>
   */
  public ValueMap getValues();

  // we're going to expose these with getArtifact() instead.

  /**
   * <p>Use of this method is *strongly* discouraged.</p>
   *
   * <p>If this JAnnotation represents a javadoc tag, returns the raw,
   * untrimmed contents of the tag.  Otherwise, returns null.  You
   * shouldn't use this method without a really good reason - you normally
   * should call one of the getMember() methods to get at the tag contents.
   * You can call getMember(SINGLE_MEMBER_NAME) to get a JAnnotationMember
   * representing the contents of a simple javadoc tag (e.g. @mytag myvalue).
   * </p>
   */
  //public String getJavadocTagText();

  /**
   * <p>Use of this method is *strongly* discouraged.</p>
   *
   * <p>If this JAnnotation corresponds to metadata that is stored in
   * an instance of java.lang.annotation.Annotation, that object is returned.
   * This is done on a strictly best-effort basis.  Null is returned if
   * no such annotation exists or if the JAM implementation is unable
   * to support the request.</p>
   */
  //public Object getAnnotationInstance();


}