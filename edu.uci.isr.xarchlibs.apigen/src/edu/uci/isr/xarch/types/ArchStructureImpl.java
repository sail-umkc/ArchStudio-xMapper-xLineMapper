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
package edu.uci.isr.xarch.types;

import org.w3c.dom.*;

import edu.uci.isr.xarch.*;

import java.util.*;

/**
 * DOM-Based implementation of the IArchStructure interface.
 *
 * @author Automatically generated by xArch apigen.
 */
public class ArchStructureImpl implements IArchStructure, DOMBased{
	
	public static final String XSD_TYPE_NSURI = TypesConstants.NS_URI;
	public static final String XSD_TYPE_NAME = "ArchStructure";
	
	protected IXArch xArch;
	
	/** Tag name for ids in this object. */
	public static final String ID_ATTR_NAME = "id";
	/** Tag name for descriptions in this object. */
	public static final String DESCRIPTION_ELT_NAME = "description";
	/** Tag name for components in this object. */
	public static final String COMPONENT_ELT_NAME = "component";
	/** Tag name for connectors in this object. */
	public static final String CONNECTOR_ELT_NAME = "connector";
	/** Tag name for links in this object. */
	public static final String LINK_ELT_NAME = "link";
	/** Tag name for groups in this object. */
	public static final String GROUP_ELT_NAME = "group";

	
	protected Element elt;
	
	private static SequenceOrder seqOrd = new SequenceOrder(
		new QName[]{
			new QName(TypesConstants.NS_URI, DESCRIPTION_ELT_NAME),
			new QName(TypesConstants.NS_URI, COMPONENT_ELT_NAME),
			new QName(TypesConstants.NS_URI, CONNECTOR_ELT_NAME),
			new QName(TypesConstants.NS_URI, LINK_ELT_NAME),
			new QName(TypesConstants.NS_URI, GROUP_ELT_NAME)
		}
	);
	
	public ArchStructureImpl(Element elt){
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
				ArchStructureImpl cloneImpl = new ArchStructureImpl(cloneElt);
				cloneImpl.setXArch(getXArch());
				return cloneImpl;
			}
			else if(depth == 1){
				Element cloneElt = (Element)elt.cloneNode(false);
				cloneElt = (Element)doc.importNode(cloneElt, true);
				ArchStructureImpl cloneImpl = new ArchStructureImpl(cloneElt);
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
				ArchStructureImpl cloneImpl = new ArchStructureImpl(cloneElt);
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
				if(!DOMUtils.hasXSIType(elt, "http://www.ics.uci.edu/pub/arch/xArch/types.xsd", baseTypeName)){
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
		return IArchStructure.TYPE_METADATA;
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
			DOMUtils.removeAttribute(elt, TypesConstants.NS_URI, ID_ATTR_NAME);
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
		DOMUtils.setAttribute(elt, TypesConstants.NS_URI, ID_ATTR_NAME, id);
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
		DOMUtils.removeAttribute(elt, TypesConstants.NS_URI, ID_ATTR_NAME);
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
		return DOMUtils.getAttributeValue(elt, TypesConstants.NS_URI, ID_ATTR_NAME);
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
			DOMUtils.removeChildren(elt, TypesConstants.NS_URI, DESCRIPTION_ELT_NAME);
			
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
		newChildElt = DOMUtils.cloneAndRename(newChildElt, TypesConstants.NS_URI, DESCRIPTION_ELT_NAME);
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
		DOMUtils.removeChildren(elt, TypesConstants.NS_URI, DESCRIPTION_ELT_NAME);
		
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
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, DESCRIPTION_ELT_NAME);
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

	public void addComponent(IComponent newComponent){
		if(!(newComponent instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newComponent).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, TypesConstants.NS_URI, COMPONENT_ELT_NAME);
		((DOMBased)newComponent).setDOMNode(newChildElt);

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
				"component", newComponent,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addComponents(Collection components){
		for(Iterator en = components.iterator(); en.hasNext(); ){
			IComponent elt = (IComponent)en.next();
			addComponent(elt);
		}
	}		
		
	public void clearComponents(){
		//DOMUtils.removeChildren(elt, TypesConstants.NS_URI, COMPONENT_ELT_NAME);
		Collection coll = getAllComponents();
		removeComponents(coll);
	}
	
	public void removeComponent(IComponent componentToRemove){
		if(!(componentToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, COMPONENT_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)componentToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"component", componentToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeComponents(Collection components){
		for(Iterator en = components.iterator(); en.hasNext(); ){
			IComponent elt = (IComponent)en.next();
			removeComponent(elt);
		}
	}
	
	public Collection getAllComponents(){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, COMPONENT_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((IComponent)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "Component");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((IComponent)o);
					}
					catch(Exception e){
						ComponentImpl eltImpl = new ComponentImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					ComponentImpl eltImpl = new ComponentImpl((Element)nl.item(i));
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

	public boolean hasComponent(IComponent componentToCheck){
		Collection c = getAllComponents();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			IComponent elt = (IComponent)en.next();
			if(elt.isEquivalent(componentToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasComponents(Collection componentsToCheck){
		Vector v = new Vector();
		for(Iterator en = componentsToCheck.iterator(); en.hasNext(); ){
			IComponent elt = (IComponent)en.next();
			v.addElement(new Boolean(hasComponent(elt)));
		}
		return v;
	}
		
	public boolean hasAllComponents(Collection componentsToCheck){
		for(Iterator en = componentsToCheck.iterator(); en.hasNext(); ){
			IComponent elt = (IComponent)en.next();
			if(!hasComponent(elt)){
				return false;
			}
		}
		return true;
	}
	public IComponent getComponent(String id){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, COMPONENT_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			
			IComponent el = new ComponentImpl((Element)nl.item(i));
			if(DOMUtils.objNullEq(id, el.getId())){
				Element domElt = (Element)nl.item(i);
				Object o = makeDerivedWrapper(domElt, "Component");
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						return (IComponent)o;
					}
					catch(Exception e){}
				}
				el.setXArch(getXArch());
				return el;
			}
		}
		return null;
	}
	
	public Collection getComponents(Collection ids){
		//If there is an ID that does not exist, it is simply ignored.
		//You can tell if this happened if ids.size() != returned collection.size().
		Vector v = new Vector();
		for(Iterator en = ids.iterator(); en.hasNext(); ){
			String elt = (String)en.next();
			IComponent retElt = getComponent(elt);
			if(retElt != null){
				v.addElement(retElt);
			}
		}
		return v;
	}	
	
	public void addConnector(IConnector newConnector){
		if(!(newConnector instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newConnector).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, TypesConstants.NS_URI, CONNECTOR_ELT_NAME);
		((DOMBased)newConnector).setDOMNode(newChildElt);

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
				"connector", newConnector,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addConnectors(Collection connectors){
		for(Iterator en = connectors.iterator(); en.hasNext(); ){
			IConnector elt = (IConnector)en.next();
			addConnector(elt);
		}
	}		
		
	public void clearConnectors(){
		//DOMUtils.removeChildren(elt, TypesConstants.NS_URI, CONNECTOR_ELT_NAME);
		Collection coll = getAllConnectors();
		removeConnectors(coll);
	}
	
	public void removeConnector(IConnector connectorToRemove){
		if(!(connectorToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, CONNECTOR_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)connectorToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"connector", connectorToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeConnectors(Collection connectors){
		for(Iterator en = connectors.iterator(); en.hasNext(); ){
			IConnector elt = (IConnector)en.next();
			removeConnector(elt);
		}
	}
	
	public Collection getAllConnectors(){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, CONNECTOR_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((IConnector)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "Connector");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((IConnector)o);
					}
					catch(Exception e){
						ConnectorImpl eltImpl = new ConnectorImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					ConnectorImpl eltImpl = new ConnectorImpl((Element)nl.item(i));
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

	public boolean hasConnector(IConnector connectorToCheck){
		Collection c = getAllConnectors();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			IConnector elt = (IConnector)en.next();
			if(elt.isEquivalent(connectorToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasConnectors(Collection connectorsToCheck){
		Vector v = new Vector();
		for(Iterator en = connectorsToCheck.iterator(); en.hasNext(); ){
			IConnector elt = (IConnector)en.next();
			v.addElement(new Boolean(hasConnector(elt)));
		}
		return v;
	}
		
	public boolean hasAllConnectors(Collection connectorsToCheck){
		for(Iterator en = connectorsToCheck.iterator(); en.hasNext(); ){
			IConnector elt = (IConnector)en.next();
			if(!hasConnector(elt)){
				return false;
			}
		}
		return true;
	}
	public IConnector getConnector(String id){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, CONNECTOR_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			
			IConnector el = new ConnectorImpl((Element)nl.item(i));
			if(DOMUtils.objNullEq(id, el.getId())){
				Element domElt = (Element)nl.item(i);
				Object o = makeDerivedWrapper(domElt, "Connector");
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						return (IConnector)o;
					}
					catch(Exception e){}
				}
				el.setXArch(getXArch());
				return el;
			}
		}
		return null;
	}
	
	public Collection getConnectors(Collection ids){
		//If there is an ID that does not exist, it is simply ignored.
		//You can tell if this happened if ids.size() != returned collection.size().
		Vector v = new Vector();
		for(Iterator en = ids.iterator(); en.hasNext(); ){
			String elt = (String)en.next();
			IConnector retElt = getConnector(elt);
			if(retElt != null){
				v.addElement(retElt);
			}
		}
		return v;
	}	
	
	public void addLink(ILink newLink){
		if(!(newLink instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newLink).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, TypesConstants.NS_URI, LINK_ELT_NAME);
		((DOMBased)newLink).setDOMNode(newChildElt);

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
				"link", newLink,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addLinks(Collection links){
		for(Iterator en = links.iterator(); en.hasNext(); ){
			ILink elt = (ILink)en.next();
			addLink(elt);
		}
	}		
		
	public void clearLinks(){
		//DOMUtils.removeChildren(elt, TypesConstants.NS_URI, LINK_ELT_NAME);
		Collection coll = getAllLinks();
		removeLinks(coll);
	}
	
	public void removeLink(ILink linkToRemove){
		if(!(linkToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, LINK_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)linkToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"link", linkToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeLinks(Collection links){
		for(Iterator en = links.iterator(); en.hasNext(); ){
			ILink elt = (ILink)en.next();
			removeLink(elt);
		}
	}
	
	public Collection getAllLinks(){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, LINK_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((ILink)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "Link");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((ILink)o);
					}
					catch(Exception e){
						LinkImpl eltImpl = new LinkImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					LinkImpl eltImpl = new LinkImpl((Element)nl.item(i));
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

	public boolean hasLink(ILink linkToCheck){
		Collection c = getAllLinks();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			ILink elt = (ILink)en.next();
			if(elt.isEquivalent(linkToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasLinks(Collection linksToCheck){
		Vector v = new Vector();
		for(Iterator en = linksToCheck.iterator(); en.hasNext(); ){
			ILink elt = (ILink)en.next();
			v.addElement(new Boolean(hasLink(elt)));
		}
		return v;
	}
		
	public boolean hasAllLinks(Collection linksToCheck){
		for(Iterator en = linksToCheck.iterator(); en.hasNext(); ){
			ILink elt = (ILink)en.next();
			if(!hasLink(elt)){
				return false;
			}
		}
		return true;
	}
	public ILink getLink(String id){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, LINK_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			
			ILink el = new LinkImpl((Element)nl.item(i));
			if(DOMUtils.objNullEq(id, el.getId())){
				Element domElt = (Element)nl.item(i);
				Object o = makeDerivedWrapper(domElt, "Link");
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						return (ILink)o;
					}
					catch(Exception e){}
				}
				el.setXArch(getXArch());
				return el;
			}
		}
		return null;
	}
	
	public Collection getLinks(Collection ids){
		//If there is an ID that does not exist, it is simply ignored.
		//You can tell if this happened if ids.size() != returned collection.size().
		Vector v = new Vector();
		for(Iterator en = ids.iterator(); en.hasNext(); ){
			String elt = (String)en.next();
			ILink retElt = getLink(elt);
			if(retElt != null){
				v.addElement(retElt);
			}
		}
		return v;
	}	
	
	public void addGroup(edu.uci.isr.xarch.instance.IGroup newGroup){
		if(!(newGroup instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		Element newChildElt = (Element)(((DOMBased)newGroup).getDOMNode());
		newChildElt = DOMUtils.cloneAndRename(newChildElt, TypesConstants.NS_URI, GROUP_ELT_NAME);
		((DOMBased)newGroup).setDOMNode(newChildElt);

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
				"group", newGroup,
				XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
			);
		}
	}
		
	public void addGroups(Collection groups){
		for(Iterator en = groups.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IGroup elt = (edu.uci.isr.xarch.instance.IGroup)en.next();
			addGroup(elt);
		}
	}		
		
	public void clearGroups(){
		//DOMUtils.removeChildren(elt, TypesConstants.NS_URI, GROUP_ELT_NAME);
		Collection coll = getAllGroups();
		removeGroups(coll);
	}
	
	public void removeGroup(edu.uci.isr.xarch.instance.IGroup groupToRemove){
		if(!(groupToRemove instanceof DOMBased)){
			throw new IllegalArgumentException("Cannot handle non-DOM-based xArch entities.");
		}
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, GROUP_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			Node n = nl.item(i);
			if(n == ((DOMBased)groupToRemove).getDOMNode()){
				synchronized(DOMUtils.getDOMLock(elt)){
					elt.removeChild(n);
				}

				IXArch context = getXArch();
				if(context != null){
					context.fireXArchEvent(
						new XArchEvent(this, 
						XArchEvent.REMOVE_EVENT,
						XArchEvent.ELEMENT_CHANGED,
						"group", groupToRemove,
						XArchUtils.getDefaultXArchImplementation().isContainedIn(xArch, this))
					);
				}

				return;
			}
		}
	}
	
	public void removeGroups(Collection groups){
		for(Iterator en = groups.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IGroup elt = (edu.uci.isr.xarch.instance.IGroup)en.next();
			removeGroup(elt);
		}
	}
	
	public Collection getAllGroups(){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, GROUP_ELT_NAME);
		int nlLength = nl.getLength();
		ArrayList v = new ArrayList(nlLength);
		IXArch de = getXArch();
		for(int i = 0; i < nlLength; i++){
			Element el = (Element)nl.item(i);
			boolean found = false;
			if(de != null){
				IXArchElement cachedXArchElt = de.getWrapper(el);
				if(cachedXArchElt != null){
					v.add((edu.uci.isr.xarch.instance.IGroup)cachedXArchElt);
					found = true;
				}
			}
			if(!found){
				Object o = makeDerivedWrapper(el, "Group");	
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)o));
						}
						v.add((edu.uci.isr.xarch.instance.IGroup)o);
					}
					catch(Exception e){
						edu.uci.isr.xarch.instance.GroupImpl eltImpl = new edu.uci.isr.xarch.instance.GroupImpl((Element)nl.item(i));
						eltImpl.setXArch(getXArch());
						if(de != null){
							de.cacheWrapper(el, ((edu.uci.isr.xarch.IXArchElement)eltImpl));
						}
						v.add(eltImpl);
					}
				}
				else{
					edu.uci.isr.xarch.instance.GroupImpl eltImpl = new edu.uci.isr.xarch.instance.GroupImpl((Element)nl.item(i));
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

	public boolean hasGroup(edu.uci.isr.xarch.instance.IGroup groupToCheck){
		Collection c = getAllGroups();
		
		for(Iterator en = c.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IGroup elt = (edu.uci.isr.xarch.instance.IGroup)en.next();
			if(elt.isEquivalent(groupToCheck)){
				return true;
			}
		}
		return false;
	}
	
	public Collection hasGroups(Collection groupsToCheck){
		Vector v = new Vector();
		for(Iterator en = groupsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IGroup elt = (edu.uci.isr.xarch.instance.IGroup)en.next();
			v.addElement(new Boolean(hasGroup(elt)));
		}
		return v;
	}
		
	public boolean hasAllGroups(Collection groupsToCheck){
		for(Iterator en = groupsToCheck.iterator(); en.hasNext(); ){
			edu.uci.isr.xarch.instance.IGroup elt = (edu.uci.isr.xarch.instance.IGroup)en.next();
			if(!hasGroup(elt)){
				return false;
			}
		}
		return true;
	}
	public edu.uci.isr.xarch.instance.IGroup getGroup(String id){
		NodeList nl = DOMUtils.getChildren(elt, TypesConstants.NS_URI, GROUP_ELT_NAME);
		for(int i = 0; i < nl.getLength(); i++){
			
			edu.uci.isr.xarch.instance.IGroup el = new edu.uci.isr.xarch.instance.GroupImpl((Element)nl.item(i));
			if(DOMUtils.objNullEq(id, el.getId())){
				Element domElt = (Element)nl.item(i);
				Object o = makeDerivedWrapper(domElt, "Group");
				if(o != null){
					try{
						((edu.uci.isr.xarch.IXArchElement)o).setXArch(getXArch());
						return (edu.uci.isr.xarch.instance.IGroup)o;
					}
					catch(Exception e){}
				}
				el.setXArch(getXArch());
				return el;
			}
		}
		return null;
	}
	
	public Collection getGroups(Collection ids){
		//If there is an ID that does not exist, it is simply ignored.
		//You can tell if this happened if ids.size() != returned collection.size().
		Vector v = new Vector();
		for(Iterator en = ids.iterator(); en.hasNext(); ){
			String elt = (String)en.next();
			edu.uci.isr.xarch.instance.IGroup retElt = getGroup(elt);
			if(retElt != null){
				v.addElement(retElt);
			}
		}
		return v;
	}	
	
	public boolean isEqual(IArchStructure ArchStructureToCheck){
		String thisId = getId();
		String thatId = ArchStructureToCheck.getId();
		
		if((thisId == null) || (thatId == null)){
			throw new IllegalArgumentException("One of the arguments is missing an ID.");
		}
		return thisId.equals(thatId);
	}
	
	public boolean isEquivalent(IArchStructure c){
		return (getClass().equals(c.getClass())) &&
			hasDescription(c.getDescription()) &&
			hasAllComponents(c.getAllComponents()) &&
			c.hasAllComponents(getAllComponents()) &&
			hasAllConnectors(c.getAllConnectors()) &&
			c.hasAllConnectors(getAllConnectors()) &&
			hasAllLinks(c.getAllLinks()) &&
			c.hasAllLinks(getAllLinks()) &&
			hasAllGroups(c.getAllGroups()) &&
			c.hasAllGroups(getAllGroups()) ;
	}

}