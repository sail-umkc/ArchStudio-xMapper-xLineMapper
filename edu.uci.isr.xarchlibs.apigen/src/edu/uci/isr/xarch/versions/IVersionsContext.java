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
package edu.uci.isr.xarch.versions;

import java.util.*;

import edu.uci.isr.xarch.*;

import org.w3c.dom.*;

import edu.uci.isr.xarch.IXArch;
import edu.uci.isr.xarch.IXArchContext;

/**
 * The context interface for the versions package.
 * This interface is used to create objects that are used
 * in the versions namespace.
 *
 * @author Automatically Generated by xArch apigen
 */
public interface IVersionsContext extends IXArchContext{

	/**
	 * Create an IVersionID object in this namespace.
	 * @return New IVersionID object.
	 */
	public IVersionID createVersionID();

	/**
	 * Brings an IVersionID object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IVersionID recontextualizeVersionID(IVersionID value);

	/**
	 * Create an INode object in this namespace.
	 * @return New INode object.
	 */
	public INode createNode();

	/**
	 * Brings an INode object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public INode recontextualizeNode(INode value);

	/**
	 * Create an edu.uci.isr.xarch.instance.IXMLLink object in this namespace.
	 * @return New edu.uci.isr.xarch.instance.IXMLLink object.
	 */
	public edu.uci.isr.xarch.instance.IXMLLink createXMLLink();

	/**
	 * Brings an edu.uci.isr.xarch.instance.IXMLLink object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.instance.IXMLLink recontextualizeXMLLink(edu.uci.isr.xarch.instance.IXMLLink value);

	/**
	 * Create an IComponentTypeVersionGraph object in this namespace.
	 * @return New IComponentTypeVersionGraph object.
	 */
	public IComponentTypeVersionGraph createComponentTypeVersionGraph();

	/**
	 * Brings an IComponentTypeVersionGraph object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IComponentTypeVersionGraph recontextualizeComponentTypeVersionGraph(IComponentTypeVersionGraph value);

	/**
	 * Create an edu.uci.isr.xarch.instance.IDescription object in this namespace.
	 * @return New edu.uci.isr.xarch.instance.IDescription object.
	 */
	public edu.uci.isr.xarch.instance.IDescription createDescription();

	/**
	 * Brings an edu.uci.isr.xarch.instance.IDescription object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public edu.uci.isr.xarch.instance.IDescription recontextualizeDescription(edu.uci.isr.xarch.instance.IDescription value);

	/**
	 * Create an IConnectorTypeVersionGraph object in this namespace.
	 * @return New IConnectorTypeVersionGraph object.
	 */
	public IConnectorTypeVersionGraph createConnectorTypeVersionGraph();

	/**
	 * Brings an IConnectorTypeVersionGraph object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IConnectorTypeVersionGraph recontextualizeConnectorTypeVersionGraph(IConnectorTypeVersionGraph value);

	/**
	 * Create an IInterfaceTypeVersionGraph object in this namespace.
	 * @return New IInterfaceTypeVersionGraph object.
	 */
	public IInterfaceTypeVersionGraph createInterfaceTypeVersionGraph();

	/**
	 * Brings an IInterfaceTypeVersionGraph object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IInterfaceTypeVersionGraph recontextualizeInterfaceTypeVersionGraph(IInterfaceTypeVersionGraph value);

	/**
	 * Create an IArchVersions object in this namespace.
	 * @return New IArchVersions object.
	 */
	public IArchVersions createArchVersions();

	/**
	 * Brings an IArchVersions object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IArchVersions recontextualizeArchVersions(IArchVersions value);

	/**
	 * Create an IVariantComponentTypeImplVers object in this namespace.
	 * @return New IVariantComponentTypeImplVers object.
	 */
	public IVariantComponentTypeImplVers createVariantComponentTypeImplVers();

	/**
	 * Brings an IVariantComponentTypeImplVers object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IVariantComponentTypeImplVers recontextualizeVariantComponentTypeImplVers(IVariantComponentTypeImplVers value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.implementation.IVariantComponentTypeImpl</code>
	 * to one of type <code>IVariantComponentTypeImplVers</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.implementation.IVariantComponentTypeImpl</code>
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
	public IVariantComponentTypeImplVers promoteToVariantComponentTypeImplVers(
	edu.uci.isr.xarch.implementation.IVariantComponentTypeImpl value);

	/**
	 * Create an IVariantConnectorTypeImplVers object in this namespace.
	 * @return New IVariantConnectorTypeImplVers object.
	 */
	public IVariantConnectorTypeImplVers createVariantConnectorTypeImplVers();

	/**
	 * Brings an IVariantConnectorTypeImplVers object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IVariantConnectorTypeImplVers recontextualizeVariantConnectorTypeImplVers(IVariantConnectorTypeImplVers value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.implementation.IVariantConnectorTypeImpl</code>
	 * to one of type <code>IVariantConnectorTypeImplVers</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.implementation.IVariantConnectorTypeImpl</code>
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
	public IVariantConnectorTypeImplVers promoteToVariantConnectorTypeImplVers(
	edu.uci.isr.xarch.implementation.IVariantConnectorTypeImpl value);

	/**
	 * Create an IInterfaceTypeImplVers object in this namespace.
	 * @return New IInterfaceTypeImplVers object.
	 */
	public IInterfaceTypeImplVers createInterfaceTypeImplVers();

	/**
	 * Brings an IInterfaceTypeImplVers object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IInterfaceTypeImplVers recontextualizeInterfaceTypeImplVers(IInterfaceTypeImplVers value);

	/**
	 * Promote an object of type <code>edu.uci.isr.xarch.implementation.IInterfaceTypeImpl</code>
	 * to one of type <code>IInterfaceTypeImplVers</code>.  xArch APIs
	 * are structured in such a way that a regular cast is not possible
	 * to change interface types, so casting must be done through these
	 * promotion functions.  If the <code>edu.uci.isr.xarch.implementation.IInterfaceTypeImpl</code>
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
	public IInterfaceTypeImplVers promoteToInterfaceTypeImplVers(
	edu.uci.isr.xarch.implementation.IInterfaceTypeImpl value);

	/**
	 * Create a top-level element of type <code>IArchVersions</code>.
	 * This function should be used in lieu of <code>createArchVersions</code>
	 * if the element is to be added as a sub-object of <code>IXArch</code>.
	 * @return new IArchVersions suitable for adding
	 * as a child of xArch.
	 */
	public IArchVersions createArchVersionsElement();

	/**
	 * Gets the IArchVersions child from the given <code>IXArch</code>
	 * element.  If there are multiple matching children, this returns the first one.
	 * @param xArch <code>IXArch</code> object from which to get the child.
	 * @return <code>IArchVersions</code> that is the child
	 * of <code>xArch</code> or <code>null</code> if no such object exists.
	 */
	public IArchVersions getArchVersions(IXArch xArch);

	/**
	 * Gets all the IArchVersions children from the given 
	 * <code>IXArch</code> element.
	 * @param xArch <code>IXArch</code> object from which to get the children.
	 * @return Collection of <code>IArchVersions</code> that are 	
	 * the children of <code>xArch</code> or an empty collection if no such object exists.
	 */
	public Collection getAllArchVersionss(IXArch xArch);


	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_CONTEXT,
		"versions", null, null,
		new XArchPropertyMetadata[]{},
		new XArchActionMetadata[]{
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IVersionID.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IVersionID.TYPE_METADATA, IVersionID.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, INode.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, INode.TYPE_METADATA, INode.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, edu.uci.isr.xarch.instance.IXMLLink.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, edu.uci.isr.xarch.instance.IXMLLink.TYPE_METADATA, edu.uci.isr.xarch.instance.IXMLLink.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IComponentTypeVersionGraph.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IComponentTypeVersionGraph.TYPE_METADATA, IComponentTypeVersionGraph.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, edu.uci.isr.xarch.instance.IDescription.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, edu.uci.isr.xarch.instance.IDescription.TYPE_METADATA, edu.uci.isr.xarch.instance.IDescription.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IConnectorTypeVersionGraph.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IConnectorTypeVersionGraph.TYPE_METADATA, IConnectorTypeVersionGraph.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IInterfaceTypeVersionGraph.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IInterfaceTypeVersionGraph.TYPE_METADATA, IInterfaceTypeVersionGraph.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IArchVersions.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IArchVersions.TYPE_METADATA, IArchVersions.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IVariantComponentTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IVariantComponentTypeImplVers.TYPE_METADATA, IVariantComponentTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.implementation.IVariantComponentTypeImpl.TYPE_METADATA, IVariantComponentTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IVariantConnectorTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IVariantConnectorTypeImplVers.TYPE_METADATA, IVariantConnectorTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.implementation.IVariantConnectorTypeImpl.TYPE_METADATA, IVariantConnectorTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IInterfaceTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IInterfaceTypeImplVers.TYPE_METADATA, IInterfaceTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.implementation.IInterfaceTypeImpl.TYPE_METADATA, IInterfaceTypeImplVers.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE_ELEMENT, null, IArchVersions.TYPE_METADATA)});

}

