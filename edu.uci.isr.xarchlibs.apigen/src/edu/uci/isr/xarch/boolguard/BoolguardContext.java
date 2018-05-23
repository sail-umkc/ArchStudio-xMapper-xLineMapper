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
package edu.uci.isr.xarch.boolguard;

import java.util.*;

import edu.uci.isr.xarch.*;

import org.w3c.dom.*;

import edu.uci.isr.xarch.IXArch;
import edu.uci.isr.xarch.IXArchContext;

/**
 * The context object for the boolguard package.
 * This object is used to create objects that are used
 * in the boolguard namespace.
 *
 * @author Automatically Generated by xArch apigen
 */
public class BoolguardContext implements IBoolguardContext {

	protected static final String DEFAULT_ELT_NAME = "anonymousInstanceTag";
	protected Document doc;
	protected IXArch xArch;

	/**
	 * Create a new BoolguardContext for the given
	 * IXArch object.
	 * @param xArch XArch object to contextualize in this namespace.
	 */
	public BoolguardContext(IXArch xArch){
		if(!(xArch instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Node docRootNode = ((DOMBased)xArch).getDOMNode();
		synchronized(DOMUtils.getDOMLock(docRootNode)){
			this.doc = docRootNode.getOwnerDocument();
			xArch.addSchemaLocation("http://www.ics.uci.edu/pub/arch/xArch/boolguard.xsd", "http://www.isr.uci.edu/projects/xarchuci/ext/boolguard.xsd");
			this.xArch = xArch;
		}
	}

	public IXArch getXArch(){
		return xArch;
	}
	
	protected Element createElement(String name){
		synchronized(DOMUtils.getDOMLock(doc)){
			return doc.createElementNS(BoolguardConstants.NS_URI, name);
		}
	}

	public XArchTypeMetadata getTypeMetadata(){
		return IBoolguardContext.TYPE_METADATA;
	}
	/**
	 * Create an ISymbol object in this namespace.
	 * @return New ISymbol object.
	 */
	public ISymbol createSymbol(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, SymbolImpl.XSD_TYPE_NSURI, SymbolImpl.XSD_TYPE_NAME);
		SymbolImpl newElt = new SymbolImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an ISymbol object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public ISymbol recontextualizeSymbol(ISymbol value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IValue object in this namespace.
	 * @return New IValue object.
	 */
	public IValue createValue(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, ValueImpl.XSD_TYPE_NSURI, ValueImpl.XSD_TYPE_NAME);
		ValueImpl newElt = new ValueImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IValue object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IValue recontextualizeValue(IValue value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IBooleanGuard object in this namespace.
	 * @return New IBooleanGuard object.
	 */
	public IBooleanGuard createBooleanGuard(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, BooleanGuardImpl.XSD_TYPE_NSURI, BooleanGuardImpl.XSD_TYPE_NAME);
		BooleanGuardImpl newElt = new BooleanGuardImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IBooleanGuard object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IBooleanGuard recontextualizeBooleanGuard(IBooleanGuard value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.options.IGuard</code>
	 * to one of type <code>IBooleanGuard</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.options.IGuard</code>
	 * object wraps a DOM element that is the base type, then the 
	 * <code>xsi:type</code> of the base element is promoted.  Otherwise, 
	 * it is left unchanged.
	 *
	 * This function also emits an <CODE>XArchEvent</CODE> with type
	 * PROMOTE_TYPE.  The source for this events is the pre-promoted
	 * IXArchElement object (should no longer be used), and the
	 * target is the post-promotion object.  The target name is
	 * the name of the interface class that was the target of the
	 * promotion.
	 * 
	 * @param value Object to promote.
	 * @return Promoted object.
	 */
	public IBooleanGuard promoteToBooleanGuard(
	edu.uci.isr.xarch.options.IGuard value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		if(DOMUtils.hasXSIType(elt, 
			edu.uci.isr.xarch.options.GuardImpl.XSD_TYPE_NSURI,
			edu.uci.isr.xarch.options.GuardImpl.XSD_TYPE_NAME)){

				DOMUtils.addXSIType(elt, BooleanGuardImpl.XSD_TYPE_NSURI, 
					BooleanGuardImpl.XSD_TYPE_NAME);
		}
		BooleanGuardImpl newElt = new BooleanGuardImpl(elt);
		newElt.setXArch(this.getXArch());

		xArch.fireXArchEvent(
			new XArchEvent(value, 
			XArchEvent.PROMOTE_EVENT,
			XArchEvent.ELEMENT_CHANGED,
			IBooleanGuard.class.getName(), newElt,
			XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, newElt))
		);

		return newElt;
	}

	/**
	 * Create an IBool object in this namespace.
	 * @return New IBool object.
	 */
	public IBool createBool(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, BoolImpl.XSD_TYPE_NSURI, BoolImpl.XSD_TYPE_NAME);
		BoolImpl newElt = new BoolImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IBool object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IBool recontextualizeBool(IBool value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IBooleanExp object in this namespace.
	 * @return New IBooleanExp object.
	 */
	public IBooleanExp createBooleanExp(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, BooleanExpImpl.XSD_TYPE_NSURI, BooleanExpImpl.XSD_TYPE_NAME);
		BooleanExpImpl newElt = new BooleanExpImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IBooleanExp object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IBooleanExp recontextualizeBooleanExp(IBooleanExp value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IParen object in this namespace.
	 * @return New IParen object.
	 */
	public IParen createParen(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, ParenImpl.XSD_TYPE_NSURI, ParenImpl.XSD_TYPE_NAME);
		ParenImpl newElt = new ParenImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IParen object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IParen recontextualizeParen(IParen value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IGreaterThan object in this namespace.
	 * @return New IGreaterThan object.
	 */
	public IGreaterThan createGreaterThan(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, GreaterThanImpl.XSD_TYPE_NSURI, GreaterThanImpl.XSD_TYPE_NAME);
		GreaterThanImpl newElt = new GreaterThanImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IGreaterThan object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IGreaterThan recontextualizeGreaterThan(IGreaterThan value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IGreaterThanOrEquals object in this namespace.
	 * @return New IGreaterThanOrEquals object.
	 */
	public IGreaterThanOrEquals createGreaterThanOrEquals(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, GreaterThanOrEqualsImpl.XSD_TYPE_NSURI, GreaterThanOrEqualsImpl.XSD_TYPE_NAME);
		GreaterThanOrEqualsImpl newElt = new GreaterThanOrEqualsImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IGreaterThanOrEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IGreaterThanOrEquals recontextualizeGreaterThanOrEquals(IGreaterThanOrEquals value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an ILessThan object in this namespace.
	 * @return New ILessThan object.
	 */
	public ILessThan createLessThan(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, LessThanImpl.XSD_TYPE_NSURI, LessThanImpl.XSD_TYPE_NAME);
		LessThanImpl newElt = new LessThanImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an ILessThan object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public ILessThan recontextualizeLessThan(ILessThan value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an ILessThanOrEquals object in this namespace.
	 * @return New ILessThanOrEquals object.
	 */
	public ILessThanOrEquals createLessThanOrEquals(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, LessThanOrEqualsImpl.XSD_TYPE_NSURI, LessThanOrEqualsImpl.XSD_TYPE_NAME);
		LessThanOrEqualsImpl newElt = new LessThanOrEqualsImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an ILessThanOrEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public ILessThanOrEquals recontextualizeLessThanOrEquals(ILessThanOrEquals value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IEquals object in this namespace.
	 * @return New IEquals object.
	 */
	public IEquals createEquals(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, EqualsImpl.XSD_TYPE_NSURI, EqualsImpl.XSD_TYPE_NAME);
		EqualsImpl newElt = new EqualsImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IEquals recontextualizeEquals(IEquals value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an INotEquals object in this namespace.
	 * @return New INotEquals object.
	 */
	public INotEquals createNotEquals(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, NotEqualsImpl.XSD_TYPE_NSURI, NotEqualsImpl.XSD_TYPE_NAME);
		NotEqualsImpl newElt = new NotEqualsImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an INotEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public INotEquals recontextualizeNotEquals(INotEquals value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IAnd object in this namespace.
	 * @return New IAnd object.
	 */
	public IAnd createAnd(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, AndImpl.XSD_TYPE_NSURI, AndImpl.XSD_TYPE_NAME);
		AndImpl newElt = new AndImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IAnd object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IAnd recontextualizeAnd(IAnd value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IOr object in this namespace.
	 * @return New IOr object.
	 */
	public IOr createOr(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, OrImpl.XSD_TYPE_NSURI, OrImpl.XSD_TYPE_NAME);
		OrImpl newElt = new OrImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IOr object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOr recontextualizeOr(IOr value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an INot object in this namespace.
	 * @return New INot object.
	 */
	public INot createNot(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, NotImpl.XSD_TYPE_NSURI, NotImpl.XSD_TYPE_NAME);
		NotImpl newElt = new NotImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an INot object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public INot recontextualizeNot(INot value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IInSet object in this namespace.
	 * @return New IInSet object.
	 */
	public IInSet createInSet(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, InSetImpl.XSD_TYPE_NSURI, InSetImpl.XSD_TYPE_NAME);
		InSetImpl newElt = new InSetImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IInSet object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IInSet recontextualizeInSet(IInSet value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}

	/**
	 * Create an IInRange object in this namespace.
	 * @return New IInRange object.
	 */
	public IInRange createInRange(){
		Element elt = createElement(DEFAULT_ELT_NAME);
		DOMUtils.addXSIType(elt, InRangeImpl.XSD_TYPE_NSURI, InRangeImpl.XSD_TYPE_NAME);
		InRangeImpl newElt = new InRangeImpl(elt);
		newElt.setXArch(this.getXArch());
		return newElt;
	}

	/**
	 * Brings an IInRange object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IInRange recontextualizeInRange(IInRange value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot process non-DOM based xArch entities.");
		}
		Element elt = (Element)((DOMBased)value).getDOMNode();

		elt = DOMUtils.cloneAndRename(elt, doc, BoolguardConstants.NS_URI, elt.getLocalName());
		//elt = DOMUtils.cloneAndRename(elt, BoolguardConstants.NS_URI, elt.getTagName());

		//Removed next line because it causes an illegal character DOM exception
		//elt.setPrefix(null);

		((DOMBased)value).setDOMNode(elt);
		((IXArchElement)value).setXArch(this.getXArch());
		return value;
	}


}

