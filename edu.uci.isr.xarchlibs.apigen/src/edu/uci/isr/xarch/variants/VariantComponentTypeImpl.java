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
package edu.uci.isr.xarch.variants;

import org.w3c.dom.*;

import edu.uci.isr.xarch.*;

import java.util.*;

/**
 * DOM-Based implementation of the IVariantComponentType interface.
 *
 * @author Automatically generated by xArch apigen.
 */
public class VariantComponentTypeImpl extends edu.uci.isr.xarch.types.ComponentTypeImpl implements
IVariantComponentType, edu.uci.isr.xarch.types.IComponentType, DOMBased{
	
	public static final String XSD_TYPE_NSURI = VariantsConstants.NS_URI;
	public static final String XSD_TYPE_NAME = "VariantComponentType";

	/** Tag name for variants in this object. */
	public static final String VARIANT_ELT_NAME = "variant";

	
	private static SequenceOrder seqOrderAppend = new SequenceOrder(
		new QName[]{
			new QName(VariantsConstants.NS_URI, VARIANT_ELT_NAME)
		}
	);
	
	public VariantComponentTypeImpl(Element elt){
		super(elt);
	}
	
	protected static SequenceOrder getSequenceOrder(){
		return new SequenceOrder(edu.uci.isr.xarch.types.ComponentTypeImpl.getSequenceOrder(), seqOrderAppend);
	}

	public IXArchElement cloneElement(int depth){
		synchronized(DOMUtils.getDOMLock(elt)){
			Document doc = elt.getOwnerDocument();
			if(depth == 0){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				VariantComponentTypeImpl cloneImpl = new VariantComponentTypeImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
			else if(depth == 1){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				VariantComponentTypeImpl cloneImpl = new VariantComponentTypeImpl(cloneElt);
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
				VariantComponentTypeImpl cloneImpl = new VariantComponentTypeImpl(cloneElt);
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
				if(!DOMUtils.hasXSIType(elt, "http://www.ics.uci.edu/pub/arch/xArch/variants.xsd", baseTypeName)){
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
		return IVariantComponentType.TYPE_METADATA;
	}

	public XArchInstanceMetadata getInstanceMetadata(){
		return new XArchInstanceMetadata(XArchUtils.getPackageTitle(elt.getNamespaceURI()));
	}
	public void addVariant(IVariant newVariant){
		if(!(newVariant instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newVariant).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, VariantsConstants.NS_URI, VARIANT_ELT_NAME);
		((DOMBased)newVariant).setDOMNode(newChildElt);

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
				"variant", newVariant,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addVariants(Collection variants){
		for(Iterator en = variants.iterator(); en.hasNext(); ){
			IVariant elt = (IVariant)en.next();
			addVariant(elt);
		}
	}		
		
	public void clearVariants(){
		//DOMUtils.removeChildren(elt, VariantsConstants.NS_URI, VARIANT_ELT_NAME);
		Collection coll = getAllVariants();
		removeVariants(coll);
	}
	
	public void removeVariant(IVariant variantToRemove){
		if(!(variantToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, VariantsConstants.NS_URI, VARIANT_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)variantToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"variant", variantToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeVariants(Collection variants){
		for(Iterator en = variants.iterator(); en.hasNext(); ){
			IVariant elt = (IVariant)en.next();
			removeVariant(elt);
		}
	}
	
	public Collection getAllVariants(){
		NodeList nl = DOMUtils.getChildren(elt, VariantsConstants.NS_URI, VARIANT_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((IVariant)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "Variant");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((IVariant)o);
					}
					catch(Exception e){
						VariantImpl eltImpl = new VariantImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					VariantImpl eltImpl = new VariantImpl((Element)nl.item(i));
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

	public boolean hasVariant(IVariant variantToCheck){
		Collection c = getAllVariants();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			IVariant elt = (IVariant)en.next();
			if(elt.isEquivalent(variantToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasVariants(Collection variantsToCheck){
		Vector v = new Vector();
		for(Iterator en = variantsToCheck.iterator(); en.hasNext(); ){
			IVariant elt = (IVariant)en.next();
			v.addElement(new Boolean(hasVariant(elt)));
		}
		return v;
	}
		
	public boolean hasAllVariants(Collection variantsToCheck){
		for(Iterator en = variantsToCheck.iterator(); en.hasNext(); ){
			IVariant elt = (IVariant)en.next();
			if(!hasVariant(elt)){
				return false;
			}
		}
		return true;
	}
	public boolean isEquivalent(IVariantComponentType c){
		return
			super.isEquivalent(c) &&
			hasAllVariants(c.getAllVariants()) &&
			c.hasAllVariants(getAllVariants()) ;
	}

}
