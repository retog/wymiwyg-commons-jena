/* CVS $Id: $ */
package org.wymiwyg.commons.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from /home/reto/workspace/wymiwyg-commons-jena/src/org/wymiwyg/commons/vocabulary/document.rdf
 *
 * @author Auto-generated by schemagen on 31 Mai 2007 01:33
 * @version $Id: $Id
 */
public class DOCUMENT {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://wymiwyg.org/ontologies/document#";
    
/**
 * <p>The namespace of the vocabulary as a string</p>
 *
 *  @see #NS
 * @return a {@link java.lang.String} object.
 */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property content = m_model.createProperty( "http://wymiwyg.org/ontologies/document#content" );
/** Constant <code>content</code> */
    
    public static final Property contentLength = m_model.createProperty( "http://wymiwyg.org/ontologies/document#contentLength" );
/** Constant <code>contentLength</code> */
    
    public static final Property contentType = m_model.createProperty( "http://wymiwyg.org/ontologies/document#contentType" );
/** Constant <code>contentType</code> */
    
    public static final Property variant = m_model.createProperty( "http://wymiwyg.org/ontologies/document#variant" );
/** Constant <code>variant</code> */
    
    /** <p>A variant of the document characterized by language and content-encoding. 
     *  the language is specified with a dc:language attribute</p>
     */
    public static final Resource DocumentVariant = m_model.createResource( "http://wymiwyg.org/ontologies/document#DocumentVariant" );
    
    /** <p>A Document, the thing represented by a HTTP-URL</p> */
    public static final Resource Document = m_model.createResource( "http://wymiwyg.org/ontologies/document#Document" );
    
}
