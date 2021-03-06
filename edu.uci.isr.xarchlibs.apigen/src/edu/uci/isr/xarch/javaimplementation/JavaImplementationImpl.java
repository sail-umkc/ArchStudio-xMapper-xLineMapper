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
package edu.uci.isr.xarch.javaimplementation;

import org.w3c.dom.*;

import edu.uci.isr.xarch.*;

import java.util.*;

/**
 * DOM-Based implementation of the IJavaImplementation interface.
 *
 * @author Automatically generated by xArch apigen.
 */
public class JavaImplementationImpl extends edu.uci.isr.xarch.implementation.ImplementationImpl implements
IJavaImplementation, edu.uci.isr.xarch.implementation.IImplementation, DOMBased{
	
	public static final String XSD_TYPE_NSURI = JavaimplementationConstants.NS_URI;
	public static final String XSD_TYPE_NAME = "JavaImplementation";

	/** Tag name for mainClasss in this object. */
	public static final String MAIN_CLASS_ELT_NAME = "mainClass";
	/** Tag name for auxClasss in this object. */
	public static final String AUX_CLASS_ELT_NAME = "auxClass";

	
	private static SequenceOrder seqOrderAppend = new SequenceOrder(
		new QName[]{
			new QName(JavaimplementationConstants.NS_URI, MAIN_CLASS_ELT_NAME),
			new QName(JavaimplementationConstants.NS_URI, AUX_CLASS_ELT_NAME)
		}
	);
	
	public JavaImplementationImpl(Element elt){
		super(elt);
	}
	
	protected static SequenceOrder getSequenceOrder(){
		return new SequenceOrder(edu.uci.isr.xarch.implementation.ImplementationImpl.getSequenceOrder(), seqOrderAppend);
	}

	public IXArchElement cloneElement(int depth){
		synchronized(DOMUtils.getDOMLock(elt)){
			Document doc = elt.getOwnerDocument();
			if(depth == 0){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				JavaImplementationImpl cloneImpl = new JavaImplementationImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
			else if(depth == 1){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				JavaImplementationImpl cloneImpl = new JavaImplementationImpl(cloneElt);
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
				JavaImplementationImpl cloneImpl = new JavaImplementationImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
		}
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
				if(!DOMUtils.hasXSIType(elt, "http://www.ics.uci.edu/pub/arch/xArch/javaimplementation.xsd", baseTypeName)){
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
		return IJavaImplementation.TYPE_METADATA;
	}

	public XArchInstanceMetadata getInstanceMetadata(){
		return new XArchInstanceMetadata(XArchUtils.getPackageTitle(elt.getNamespaceURI()));
	}

	public void setMainClass(IJavaClassFile value){
		if(!(value instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		{
			IJavaClassFile oldElt = getMainClass();
			DOMUtils.removeChildren(elt, JavaimplementationConstants.NS_URI, MAIN_CLASS_ELT_NAME);
			
			IXArch context = getXArch();
			if(context != null){
				context.fireXArchEvent(
					new XArchEvent(this, 
					XArchEvent.CLEAR_EVENT,
					XArchEvent.ELEMENT_CHANGED,
					"mainClass", oldElt,
					XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this), true)
				);
			}
		}
		Element newChildElt = (Element)(((DOMBased)value).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, JavaimplementationConstants.NS_URI, MAIN_CLASS_ELT_NAME);
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
				"mainClass", value,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
	
	public void clearMainClass(){
		IJavaClassFile oldElt = getMainClass();
		DOMUtils.removeChildren(elt, JavaimplementationConstants.NS_URI, MAIN_CLASS_ELT_NAME);
		
		IXArch context = getXArch();
		if(context != null){
			context.fireXArchEvent(
				new XArchEvent(this, 
				XArchEvent.CLEAR_EVENT,
				XArchEvent.ELEMENT_CHANGED,
				"mainClass", oldElt,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
	
	public IJavaClassFile getMainClass(){
		NodeList nl = DOMUtils.getChildren(elt, JavaimplementationConstants.NS_URI, MAIN_CLASS_ELT_NAME);
		if(nl.getLength() == 0){
			return null;
		}
		else{
			Element el = (Element)nl.item(0);
			IXArch de = getXArch();
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					return (IJavaClassFile)cachedXArchElt;
				}
			}
			
			Object o = makeDerivedWrapper(el, "JavaClassFile");
			if(o != null){
				try{
					((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
					if(de != null){
						de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
					}
					return (IJavaClassFile)o;
				}
				catch(Exception e){}
			}
			JavaClassFileImpl eltImpl = new JavaClassFileImpl(el);
			eltImpl.setXArch(getXArch());
			if(de != null){
				de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
			}
			return eltImpl;
		}
	}
	
	public boolean hasMainClass(IJavaClassFile value){
		IJavaClassFile thisValue = getMainClass();
		IJavaClassFile thatValue = value;
		
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

	public void addAuxClass(IJavaClassFile newAuxClass){
		if(!(newAuxClass instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newAuxClass).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, JavaimplementationConstants.NS_URI, AUX_CLASS_ELT_NAME);
		((DOMBased)newAuxClass).setDOMNode(newChildElt);

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
				"auxClass", newAuxClass,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addAuxClasss(Collection auxClasss){
		for(Iterator en = auxClasss.iterator(); en.hasNext(); ){
			IJavaClassFile elt = (IJavaClassFile)en.next();
			addAuxClass(elt);
		}
	}		
		
	public void clearAuxClasss(){
		//DOMUtils.removeChildren(elt, JavaimplementationConstants.NS_URI, AUX_CLASS_ELT_NAME);
		Collection coll = getAllAuxClasss();
		removeAuxClasss(coll);
	}
	
	public void removeAuxClass(IJavaClassFile auxClassToRemove){
		if(!(auxClassToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, JavaimplementationConstants.NS_URI, AUX_CLASS_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)auxClassToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"auxClass", auxClassToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeAuxClasss(Collection auxClasss){
		for(Iterator en = auxClasss.iterator(); en.hasNext(); ){
			IJavaClassFile elt = (IJavaClassFile)en.next();
			removeAuxClass(elt);
		}
	}
	
	public Collection getAllAuxClasss(){
		NodeList nl = DOMUtils.getChildren(elt, JavaimplementationConstants.NS_URI, AUX_CLASS_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((IJavaClassFile)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "JavaClassFile");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((IJavaClassFile)o);
					}
					catch(Exception e){
						JavaClassFileImpl eltImpl = new JavaClassFileImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					JavaClassFileImpl eltImpl = new JavaClassFileImpl((Element)nl.item(i));
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

	public boolean hasAuxClass(IJavaClassFile auxClassToCheck){
		Collection c = getAllAuxClasss();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			IJavaClassFile elt = (IJavaClassFile)en.next();
			if(elt.isEquivalent(auxClassToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasAuxClasss(Collection auxClasssToCheck){
		Vector v = new Vector();
		for(Iterator en = auxClasssToCheck.iterator(); en.hasNext(); ){
			IJavaClassFile elt = (IJavaClassFile)en.next();
			v.addElement(new Boolean(hasAuxClass(elt)));
		}
		return v;
	}
		
	public boolean hasAllAuxClasss(Collection auxClasssToCheck){
		for(Iterator en = auxClasssToCheck.iterator(); en.hasNext(); ){
			IJavaClassFile elt = (IJavaClassFile)en.next();
			if(!hasAuxClass(elt)){
				return false;
			}
		}
		return true;
	}
	public boolean isEquivalent(IJavaImplementation c){
		return
			super.isEquivalent(c) &&
			hasMainClass(c.getMainClass()) &&
			hasAllAuxClasss(c.getAllAuxClasss()) &&
			c.hasAllAuxClasss(getAllAuxClasss()) ;
	}

}
