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
package edu.uci.isr.xarch.uml212superstructure;

import org.w3c.dom.*;

import edu.uci.isr.xarch.*;

import java.util.*;

/**
 * DOM-Based implementation of the IAction interface.
 *
 * @author Automatically generated by xArch apigen.
 */
public class ActionImpl implements IAction, DOMBased{
	
	public static final String XSD_TYPE_NSURI = Uml212superstructureConstants.NS_URI;
	public static final String XSD_TYPE_NAME = "Action";
	
	protected IXArch xArch;
	
	/** Tag name for ids in this object. */
	public static final String ID_ATTR_NAME = "id";
	/** Tag name for descriptions in this object. */
	public static final String DESCRIPTION_ELT_NAME = "description";
	/** Tag name for localPreconditions in this object. */
	public static final String LOCAL_PRECONDITION_ELT_NAME = "localPrecondition";
	/** Tag name for localPostconditions in this object. */
	public static final String LOCAL_POSTCONDITION_ELT_NAME = "localPostcondition";

	
	protected Element elt;
	
	private static SequenceOrder seqOrd = new SequenceOrder(
		new QName[]{
			new QName(Uml212superstructureConstants.NS_URI, DESCRIPTION_ELT_NAME),
			new QName(Uml212superstructureConstants.NS_URI, LOCAL_PRECONDITION_ELT_NAME),
			new QName(Uml212superstructureConstants.NS_URI, LOCAL_POSTCONDITION_ELT_NAME)
		}
	);
	
	public ActionImpl(Element elt){
		if(elt == null){
			throw new IllegalArgumentException("Element cannot be null.");
		}
		this.elt = elt;
	}

	public Node getDOMNode(){
		return elt;
	}
	
	public void setDOMNode(Node node){
		if(node.getNodeType() != Node.ELEMENT_NODE){
			throw new IllegalArgumentException("Base DOM node of this type must be an Element.");
		}
		elt = (Element)node;
	}
	
	protected static SequenceOrder getSequenceOrder(){
		return seqOrd;
	}
	
	public void setXArch(IXArch xArch){
		this.xArch = xArch;
	}
	
	public IXArch getXArch(){
		return this.xArch;
	}

	public IXArchElement cloneElement(int depth){
		synchronized(DOMUtils.getDOMLock(elt)){
			Document doc = elt.getOwnerDocument();
			if(depth == 0){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				ActionImpl cloneImpl = new ActionImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
			else if(depth == 1){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				ActionImpl cloneImpl = new ActionImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				
				NodeList nl = elt.getChildNodes();
				int size = nl.getLength();
				for(int i = 0; i < size; i++){
					Node n = nl.item(i);
					Node cloneNode = (Node)n.cloneNode(false);
					cloneNode = doc.importNode(cloneNode, true);
					cloneElt.appendChild(cloneNode);
				}
				return cloneImpl;
			}
			else /* depth = infinity */{
				Element cloneElt = (Element)elt.cloneNode(true);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				ActionImpl cloneImpl = new ActionImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
		}
	}

	//Override 'equals' to be DOM-based...	
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(!(o instanceof DOMBased)){
			return super.equals(o);
		}
		DOMBased db = (DOMBased)o;
		Node dbNode = db.getDOMNode();
		return dbNode.equals(getDOMNode());
	}

	//Override 'hashCode' to be based on the underlying node
	public int hashCode(){
		return getDOMNode().hashCode();
	}

	/**
	 * For internal use only.
	 */
	private static Object makeDerivedWrapper(Element elt, String baseTypeName){
		synchronized(DOMUtils.getDOMLock(elt)){
			QName typeName = XArchUtils.getXSIType(elt);
			if(typeName == null){
				return null;
			}
			else{
				if(!DOMUtils.hasXSIType(elt, "http://www.ics.uci.edu/pub/arch/xArch/uml212superstructure.xsd", baseTypeName)){
					try{
						String packageTitle = XArchUtils.getPackageTitle(typeName.getNamespaceURI());
						String packageName = XArchUtils.getPackageName(packageTitle);
						String implName = XArchUtils.getImplName(packageName, typeName.getName());
						Class c = Class.forName(implName);
						java.lang.reflect.Constructor con = c.getConstructor(new Class[]{Element.class});
						Object o = con.newInstance(new Object[]{elt});
						return o;
					}
					catch(Exception e){
						//Lots of bad things could happen, but this
						//is OK, because this is best-effort anyway.
					}
				}
				return null;
			}
		}
	}

	public XArchTypeMetadata getTypeMetadata(){
		return IAction.TYPE_METADATA;
	}

	public XArchInstanceMetadata getInstanceMetadata(){
		return new XArchInstanceMetadata(XArchUtils.getPackageTitle(elt.getNamespaceURI()));
	}
	/**
	 * Set the id attribute on this object.
	 * @param id attribute value.
	 */
	public void setId(String id){
		{
			String oldValue = getId();
			if(oldValue == null ? id == null : oldValue.equals(id))
				return;
			DOMUtils.removeAttribute(elt, Uml212superstructureConstants.NS_URI, ID_ATTR_NAME);
			IXArch _x = getXArch();
			if(_x != null){
				_x.fireXArchEvent(
					new XArchEvent(this, 
					XArchEvent.CLEAR_EVENT,
					XArchEvent.ATTRIBUTE_CHANGED,
					"id", oldValue,
					XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this), true)
				);
			}
		}
		DOMUtils.setAttribute(elt, Uml212superstructureConstants.NS_URI, ID_ATTR_NAME, id);
		IXArch _x = getXArch();
		if(_x != null){
			_x.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.SET_EVENT,
				XArchEvent.ATTRIBUTE_CHANGED,
				"id", id,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	/**
	 * Removes the id attribute from this object.
	 */
	public void clearId(){
		String oldValue = getId();
		if(oldValue == null)
			return;
		DOMUtils.removeAttribute(elt, Uml212superstructureConstants.NS_URI, ID_ATTR_NAME);
		IXArch _x = getXArch();
		if(_x != null){
			_x.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.CLEAR_EVENT,
				XArchEvent.ATTRIBUTE_CHANGED,
				"id", oldValue,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
	
	/**
	 * Gets the value of the id attribute on this object.
	 * @return id attribute's value or <code>null</code> if that
	 * attribute is not set.
	 */
	public String getId(){
		return DOMUtils.getAttributeValue(elt, Uml212superstructureConstants.NS_URI, ID_ATTR_NAME);
	}
	
	/**
	 * Determines if this object's id attribute has the
	 * given value.
	 * @param id value to test.
	 * @return <code>true</code> if the values match, <code>false</code> otherwise.
	 * Matching is done by string-matching.
	 */
	public boolean hasId(String id){
		return DOMUtils.objNullEq(getId(), id);
	}


	public void setDescription(edu.uci.isr.xarch.instance.IDescription value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		{
			edu.uci.isr.xarch.instance.IDescription oldElt = getDescription();
			DOMUtils.removeChildren(elt, Uml212superstructureConstants.NS_URI, DESCRIPTION_ELT_NAME);
			
			IXArch context = getXArch();
			if(context != null){
				context.fireXArchEvent(
					new XArchEvent(this, 
					XArchEvent.CLEAR_EVENT,
					XArchEvent.ELEMENT_CHANGED,
					"description", oldElt,
					XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this), true)
				);
			}
		}
		Element newChildElt = (Element)(((DOMBased)value).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, Uml212superstructureConstants.NS_URI, DESCRIPTION_ELT_NAME);
		((DOMBased)value).setDOMNode(newChildElt);
		
		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}
		
		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.SET_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"description", value,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
	
	public void clearDescription(){
		edu.uci.isr.xarch.instance.IDescription oldElt = getDescription();
		DOMUtils.removeChildren(elt, Uml212superstructureConstants.NS_URI, DESCRIPTION_ELT_NAME);
		
		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.CLEAR_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"description", oldElt,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
	
	public edu.uci.isr.xarch.instance.IDescription getDescription(){
		NodeList nl = DOMUtils.getChildren(elt, Uml212superstructureConstants.NS_URI, DESCRIPTION_ELT_NAME);
		if(nl.getLength() == 0){
			return null;
		}
		else{
			Element el = (Element)nl.item(0);
			IXArch de = getXArch();
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					return (edu.uci.isr.xarch.instance.IDescription)cachedXArchElt;
				}
			}
			
			Object o = makeDerivedWrapper(el, "Description");
			if(o != null){
				try{
					((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
					}
					return (edu.uci.isr.xarch.instance.IDescription)o;
				}
				catch(Exception e){}
			}
			edu.uci.isr.xarch.instance.DescriptionImpl eltImpl = new edu.uci.isr.xarch.instance.DescriptionImpl(el);
			eltImpl.setXArch(getXArch());
			if(de != null){
				de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
			}
			return eltImpl;
		}
	}
	
	public boolean hasDescription(edu.uci.isr.xarch.instance.IDescription value){
		edu.uci.isr.xarch.instance.IDescription thisValue = getDescription();
		edu.uci.isr.xarch.instance.IDescription thatValue = value;
		
		if((thisValue == null) && (thatValue == null)){
			return true;
		}
		else if((thisValue == null) && (thatValue != null)){
			return false;
		}
		else if((thisValue != null) && (thatValue == null)){
			return false;
		}
		return thisValue.isEquivalent(thatValue);
	}

	public void addLocalPrecondition(ILocalPrecondition newLocalPrecondition){
		if(!(newLocalPrecondition instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newLocalPrecondition).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, Uml212superstructureConstants.NS_URI, LOCAL_PRECONDITION_ELT_NAME);
		((DOMBased)newLocalPrecondition).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"localPrecondition", newLocalPrecondition,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addLocalPreconditions(Collection localPreconditions){
		for(Iterator en = localPreconditions.iterator(); en.hasNext(); ){
			ILocalPrecondition elt = (ILocalPrecondition)en.next();
			addLocalPrecondition(elt);
		}
	}		
		
	public void clearLocalPreconditions(){
		//DOMUtils.removeChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_PRECONDITION_ELT_NAME);
		Collection coll = getAllLocalPreconditions();
		removeLocalPreconditions(coll);
	}
	
	public void removeLocalPrecondition(ILocalPrecondition localPreconditionToRemove){
		if(!(localPreconditionToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_PRECONDITION_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)localPreconditionToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"localPrecondition", localPreconditionToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeLocalPreconditions(Collection localPreconditions){
		for(Iterator en = localPreconditions.iterator(); en.hasNext(); ){
			ILocalPrecondition elt = (ILocalPrecondition)en.next();
			removeLocalPrecondition(elt);
		}
	}
	
	public Collection getAllLocalPreconditions(){
		NodeList nl = DOMUtils.getChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_PRECONDITION_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((ILocalPrecondition)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "LocalPrecondition");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((ILocalPrecondition)o);
					}
					catch(Exception e){
						LocalPreconditionImpl eltImpl = new LocalPreconditionImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					LocalPreconditionImpl eltImpl = new LocalPreconditionImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasLocalPrecondition(ILocalPrecondition localPreconditionToCheck){
		Collection c = getAllLocalPreconditions();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			ILocalPrecondition elt = (ILocalPrecondition)en.next();
			if(elt.isEquivalent(localPreconditionToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasLocalPreconditions(Collection localPreconditionsToCheck){
		Vector v = new Vector();
		for(Iterator en = localPreconditionsToCheck.iterator(); en.hasNext(); ){
			ILocalPrecondition elt = (ILocalPrecondition)en.next();
			v.addElement(new Boolean(hasLocalPrecondition(elt)));
		}
		return v;
	}
		
	public boolean hasAllLocalPreconditions(Collection localPreconditionsToCheck){
		for(Iterator en = localPreconditionsToCheck.iterator(); en.hasNext(); ){
			ILocalPrecondition elt = (ILocalPrecondition)en.next();
			if(!hasLocalPrecondition(elt)){
				return false;
			}
		}
		return true;
	}
	public ILocalPrecondition getLocalPrecondition(String id){
		NodeList nl = DOMUtils.getChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_PRECONDITION_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			
			ILocalPrecondition el = new LocalPreconditionImpl((Element)nl.item(i));
			if(DOMUtils.objNullEq(id, el.getId())){
				Element domElt = (Element)nl.item(i);
				Object o = makeDerivedWrapper(domElt, "LocalPrecondition");
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						return (ILocalPrecondition)o;
					}
					catch(Exception e){}
				}
				el.setXArch(getXArch());
				return el;
			}
		}
		return null;
	}
	
	public Collection getLocalPreconditions(Collection ids){
		//If there is an ID that does not exist, it is simply ignored.
		//You can tell if this happened if ids.size() != returned collection.size().
		Vector v = new Vector();
		for(Iterator en = ids.iterator(); en.hasNext(); ){
			String elt = (String)en.next();
			ILocalPrecondition retElt = getLocalPrecondition(elt);
			if(retElt != null){
				v.addElement(retElt);
			}
		}
		return v;
	}	
	
	public void addLocalPostcondition(ILocalPostcondition newLocalPostcondition){
		if(!(newLocalPostcondition instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newLocalPostcondition).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, Uml212superstructureConstants.NS_URI, LOCAL_POSTCONDITION_ELT_NAME);
		((DOMBased)newLocalPostcondition).setDOMNode(newChildElt);

		synchronized(DOMUtils.getDOMLock(elt)){
			elt.appendChild(newChildElt);
			DOMUtils.order(elt, getSequenceOrder());
		}

		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.ADD_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"localPostcondition", newLocalPostcondition,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addLocalPostconditions(Collection localPostconditions){
		for(Iterator en = localPostconditions.iterator(); en.hasNext(); ){
			ILocalPostcondition elt = (ILocalPostcondition)en.next();
			addLocalPostcondition(elt);
		}
	}		
		
	public void clearLocalPostconditions(){
		//DOMUtils.removeChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_POSTCONDITION_ELT_NAME);
		Collection coll = getAllLocalPostconditions();
		removeLocalPostconditions(coll);
	}
	
	public void removeLocalPostcondition(ILocalPostcondition localPostconditionToRemove){
		if(!(localPostconditionToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_POSTCONDITION_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)localPostconditionToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"localPostcondition", localPostconditionToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeLocalPostconditions(Collection localPostconditions){
		for(Iterator en = localPostconditions.iterator(); en.hasNext(); ){
			ILocalPostcondition elt = (ILocalPostcondition)en.next();
			removeLocalPostcondition(elt);
		}
	}
	
	public Collection getAllLocalPostconditions(){
		NodeList nl = DOMUtils.getChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_POSTCONDITION_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((ILocalPostcondition)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "LocalPostcondition");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((ILocalPostcondition)o);
					}
					catch(Exception e){
						LocalPostconditionImpl eltImpl = new LocalPostconditionImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					LocalPostconditionImpl eltImpl = new LocalPostconditionImpl((Element)nl.item(i));
					eltImpl.setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
					}
					v.add(eltImpl);
				}
			}
		}
		return v;
	}

	public boolean hasLocalPostcondition(ILocalPostcondition localPostconditionToCheck){
		Collection c = getAllLocalPostconditions();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			ILocalPostcondition elt = (ILocalPostcondition)en.next();
			if(elt.isEquivalent(localPostconditionToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasLocalPostconditions(Collection localPostconditionsToCheck){
		Vector v = new Vector();
		for(Iterator en = localPostconditionsToCheck.iterator(); en.hasNext(); ){
			ILocalPostcondition elt = (ILocalPostcondition)en.next();
			v.addElement(new Boolean(hasLocalPostcondition(elt)));
		}
		return v;
	}
		
	public boolean hasAllLocalPostconditions(Collection localPostconditionsToCheck){
		for(Iterator en = localPostconditionsToCheck.iterator(); en.hasNext(); ){
			ILocalPostcondition elt = (ILocalPostcondition)en.next();
			if(!hasLocalPostcondition(elt)){
				return false;
			}
		}
		return true;
	}
	public ILocalPostcondition getLocalPostcondition(String id){
		NodeList nl = DOMUtils.getChildren(elt, Uml212superstructureConstants.NS_URI, LOCAL_POSTCONDITION_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			
			ILocalPostcondition el = new LocalPostconditionImpl((Element)nl.item(i));
			if(DOMUtils.objNullEq(id, el.getId())){
				Element domElt = (Element)nl.item(i);
				Object o = makeDerivedWrapper(domElt, "LocalPostcondition");
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						return (ILocalPostcondition)o;
					}
					catch(Exception e){}
				}
				el.setXArch(getXArch());
				return el;
			}
		}
		return null;
	}
	
	public Collection getLocalPostconditions(Collection ids){
		//If there is an ID that does not exist, it is simply ignored.
		//You can tell if this happened if ids.size() != returned collection.size().
		Vector v = new Vector();
		for(Iterator en = ids.iterator(); en.hasNext(); ){
			String elt = (String)en.next();
			ILocalPostcondition retElt = getLocalPostcondition(elt);
			if(retElt != null){
				v.addElement(retElt);
			}
		}
		return v;
	}	
	
	public boolean isEqual(IAction ActionToCheck){
		String thisId = getId();
		String thatId = ActionToCheck.getId();
		
		if((thisId == null) || (thatId == null)){
			throw new IllegalArgumentException("One of the arguments is missing an ID.");
		}
		return thisId.equals(thatId);
	}
	
	public boolean isEquivalent(IAction c){
		return (getClass().equals(c.getClass())) &&
			hasDescription(c.getDescription()) &&
			hasAllLocalPreconditions(c.getAllLocalPreconditions()) &&
			c.hasAllLocalPreconditions(getAllLocalPreconditions()) &&
			hasAllLocalPostconditions(c.getAllLocalPostconditions()) &&
			c.hasAllLocalPostconditions(getAllLocalPostconditions()) ;
	}

}