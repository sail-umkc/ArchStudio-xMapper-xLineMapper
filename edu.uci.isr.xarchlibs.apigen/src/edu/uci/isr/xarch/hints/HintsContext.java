/*
 * Copyright (c) 2000-2005 Regents of the University of California.
 * All rights reserved.
 *
 * This software was developed at the University of California, Irvine.
 *
 * Redistribution and use in source and binary forms are permitted
 * provided that the above copyright notice and this paragraph are
 * duplicated in all such forms and that any documentation,
 * advertising materials, and other materials related to such
 * distribution and use acknowledge that the software was developed
 * by the University of California, Irvine.  The name of the
 * University may not be used to endorse or promote products derived
 * from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED
 * WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */
package edu.uci.isr.xarch.hints;

import java.util.*;

import edu.uci.isr.xarch.*;

import org.w3c.dom.*;

import edu.uci.isr.xarch.IXArch;
import edu.uci.isr.xarch.IXArchContext;

/**
 * The context object for the hints package.
 * This object is used to create objects that are used
 * in the hints namespace.
 *
 * @author Automatically Generated by xArch apigen
 */
public class HintsContext implements IHintsContext {

	protected static final String DEFAULT_ELT_NAME = "anonymousInstanceTag";
	protected Document doc;
	protected IXArch xArch;

	/**
	 * Create a new HintsContext for the given
	 * IXArch object.
	 * @param xArch XArch object to contextualize in this namespace.
	 */
	public HintsContext(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Node docRootNode = ((DOMBased)xArch).getDOMNode();
		synchronized(DOMUtils.getDOMLock(docRootNode)){
			this.doc = docRootNode.getOwnerDocument();
			xArch.addSchemaLocation("http://www.ics.uci.edu/pub/arch/xArch/hints.xsd", "http://www.isr.uci.edu/projects/xarchuci/ext/hints.xsd");
			this.xArch = xArch;
		}
	}

	public IXArch getXArch(){
		return xArch;
	}
	
	protected Element createElement(String name){
		synchronized(DOMUtils.getDOMLock(doc)){
			return doc.createElementNS(HintsConstants.NS_URI, name);
		}
	}

	public XArchTypeMetadata getTypeMetadata(){
		return IHintsContext.TYPE_METADATA;
	}
	/**
	 * Create an IVersionID object in this namespace.
	 * @return New IVersionID object.
	 */
	public IVersionID createVersionID(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, VersionIDImpl.XSD_TYPE_NSURI, VersionIDImpl.XSD_TYPE_NAME);
		VersionIDImpl newElt = new VersionIDImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IVersionID object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IVersionID recontextualizeVersionID(IVersionID value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, HintsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, HintsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IPropertyHint object in this namespace.
	 * @return New IPropertyHint object.
	 */
	public IPropertyHint createPropertyHint(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, PropertyHintImpl.XSD_TYPE_NSURI, PropertyHintImpl.XSD_TYPE_NAME);
		PropertyHintImpl newElt = new PropertyHintImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IPropertyHint object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IPropertyHint recontextualizePropertyHint(IPropertyHint value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, HintsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, HintsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IHints object in this namespace.
	 * @return New IHints object.
	 */
	public IHints createHints(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, HintsImpl.XSD_TYPE_NSURI, HintsImpl.XSD_TYPE_NAME);
		HintsImpl newElt = new HintsImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IHints object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IHints recontextualizeHints(IHints value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, HintsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, HintsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an edu.uci.isr.xarch.instance.IXMLLink object in this namespace.
	 * @return New edu.uci.isr.xarch.instance.IXMLLink object.
	 */
	public edu.uci.isr.xarch.instance.IXMLLink createXMLLink(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, edu.uci.isr.xarch.instance.XMLLinkImpl.XSD_TYPE_NSURI, edu.uci.isr.xarch.instance.XMLLinkImpl.XSD_TYPE_NAME);
		edu.uci.isr.xarch.instance.XMLLinkImpl newElt = new edu.uci.isr.xarch.instance.XMLLinkImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an edu.uci.isr.xarch.instance.IXMLLink object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.instance.IXMLLink recontextualizeXMLLink(edu.uci.isr.xarch.instance.IXMLLink value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, HintsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, HintsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IRenderingHints object in this namespace.
	 * @return New IRenderingHints object.
	 */
	public IRenderingHints createRenderingHints(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, RenderingHintsImpl.XSD_TYPE_NSURI, RenderingHintsImpl.XSD_TYPE_NAME);
		RenderingHintsImpl newElt = new RenderingHintsImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IRenderingHints object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IRenderingHints recontextualizeRenderingHints(IRenderingHints value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, HintsConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, HintsConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create a top-level element of type <code>IRenderingHints</code>.
	 * This function should be used in lieu of <code>createRenderingHints</code>
	 * if the element is to be added as a sub-object of <code>IXArch</code>.
	 * @return new IRenderingHints suitable for adding
	 * as a child of xArch.
	 */
	public IRenderingHints createRenderingHintsElement(){
		Element elt = createElement("renderingHints");
		DOMUtils.addXSIType(elt, RenderingHintsImpl.XSD_TYPE_NSURI, 
			RenderingHintsImpl.XSD_TYPE_NAME);
		RenderingHintsImpl newElt = new RenderingHintsImpl(elt);

		IXArch de = getXArch();
		newElt.setXArch(de);
		return newElt;
	}

	/**
	 * Gets the IRenderingHints child from the given <code>IXArch</code>
	 * element.  If there are multiple matching children, this returns the first one.
	 * @param xArch <code>IXArch</code> object from which to get the child.
	 * @return <code>IRenderingHints</code> that is the child
	 * of <code>xArch</code> or <code>null</code> if no such object exists.
	 */
	public IRenderingHints getRenderingHints(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Collection elementCollection = xArch.getAllObjects();
		for(Iterator en = elementCollection.iterator(); en.hasNext(); ){
			Object o = en.next();
			if(o instanceof IRenderingHints){
				return (IRenderingHints)o;
			}
			else if(o instanceof Element){
				Element elt = (Element)o;
				synchronized(DOMUtils.getDOMLock(elt)){
					String nsURI = elt.getNamespaceURI();
					String localName = elt.getLocalName();
					if((nsURI != null) && (nsURI.equals(HintsConstants.NS_URI))){
						if((localName != null) && (localName.equals("renderingHints"))){
							RenderingHintsImpl newElt = new RenderingHintsImpl(elt);
							newElt.setXArch(this.getXArch());
							return newElt;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Gets all the IRenderingHints children from the given 
	 * <code>IXArch</code> element.
	 * @param xArch <code>IXArch</code> object from which to get the children.
	 * @return Collection of <code>IRenderingHints</code> that are 	
	 * the children of <code>xArch</code> or an empty collection if no such object exists.
	 */
	public Collection getAllRenderingHintss(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Collection elementCollection = xArch.getAllObjects();
		Vector v = new Vector();

		for(Iterator en = elementCollection.iterator(); en.hasNext(); ){
			Object o = en.next();
			if(o instanceof IRenderingHints){
				v.addElement(o);
			}
			else if(o instanceof Element){
				Element elt = (Element)o;
				synchronized(DOMUtils.getDOMLock(elt)){
					String nsURI = elt.getNamespaceURI();
					String localName = elt.getLocalName();
					if((nsURI != null) && (nsURI.equals(HintsConstants.NS_URI))){
						if((localName != null) && (localName.equals("renderingHints"))){
							RenderingHintsImpl newElt = new RenderingHintsImpl(elt);
							newElt.setXArch(this.getXArch());
							v.addElement(newElt);
						}
					}
				}
			}
		}
		return v;
	}

}

