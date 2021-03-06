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

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * SubArchitecture <code>xsi:type</code> in the
 * types namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface ISubArchitecture extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"types", "SubArchitecture", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createElement("archStructure", "instance", "XMLLink", 1, 1),
			XArchPropertyMetadata.createElement("signatureInterfaceMapping", "types", "SignatureInterfaceMapping", 0, XArchPropertyMetadata.UNBOUNDED)},
		new XArchActionMetadata[]{});

	/**
	 * Set the archStructure for this SubArchitecture.
	 * @param value new archStructure
	 */
	public void setArchStructure(edu.uci.isr.xarch.instance.IXMLLink value);

	/**
	 * Clear the archStructure from this SubArchitecture.
	 */
	public void clearArchStructure();

	/**
	 * Get the archStructure from this SubArchitecture.
	 * @return archStructure
	 */
	public edu.uci.isr.xarch.instance.IXMLLink getArchStructure();

	/**
	 * Determine if this SubArchitecture has the given archStructure
	 * @param archStructureToCheck archStructure to compare
	 * @return <code>true</code> if the archStructures are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasArchStructure(edu.uci.isr.xarch.instance.IXMLLink archStructureToCheck);

	/**
	 * Add a signatureInterfaceMapping to this SubArchitecture.
	 * @param newSignatureInterfaceMapping signatureInterfaceMapping to add.
	 */
	public void addSignatureInterfaceMapping(ISignatureInterfaceMapping newSignatureInterfaceMapping);

	/**
	 * Add a collection of signatureInterfaceMappings to this SubArchitecture.
	 * @param signatureInterfaceMappings signatureInterfaceMappings to add.
	 */
	public void addSignatureInterfaceMappings(Collection signatureInterfaceMappings);

	/**
	 * Remove all signatureInterfaceMappings from this SubArchitecture.
	 */
	public void clearSignatureInterfaceMappings();

	/**
	 * Remove the given signatureInterfaceMapping from this SubArchitecture.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param signatureInterfaceMappingToRemove signatureInterfaceMapping to remove.
	 */
	public void removeSignatureInterfaceMapping(ISignatureInterfaceMapping signatureInterfaceMappingToRemove);

	/**
	 * Remove all the given signatureInterfaceMappings from this SubArchitecture.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param signatureInterfaceMappings signatureInterfaceMapping to remove.
	 */
	public void removeSignatureInterfaceMappings(Collection signatureInterfaceMappings);

	/**
	 * Get all the signatureInterfaceMappings from this SubArchitecture.
	 * @return all signatureInterfaceMappings in this SubArchitecture.
	 */
	public Collection getAllSignatureInterfaceMappings();

	/**
	 * Determine if this SubArchitecture contains a given signatureInterfaceMapping.
	 * @return <code>true</code> if this SubArchitecture contains the given
	 * signatureInterfaceMappingToCheck, <code>false</code> otherwise.
	 */
	public boolean hasSignatureInterfaceMapping(ISignatureInterfaceMapping signatureInterfaceMappingToCheck);

	/**
	 * Determine if this SubArchitecture contains the given set of signatureInterfaceMappings.
	 * @param signatureInterfaceMappingsToCheck signatureInterfaceMappings to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>signatureInterfaceMappings</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasSignatureInterfaceMappings(Collection signatureInterfaceMappingsToCheck);

	/**
	 * Determine if this SubArchitecture contains each element in the 
	 * given set of signatureInterfaceMappings.
	 * @param signatureInterfaceMappingsToCheck signatureInterfaceMappings to check for.
	 * @return <code>true</code> if every element in
	 * <code>signatureInterfaceMappings</code> is found in this SubArchitecture,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllSignatureInterfaceMappings(Collection signatureInterfaceMappingsToCheck);

	/**
	 * Gets the signatureInterfaceMapping from this SubArchitecture with the given
	 * id.
	 * @param id ID to look for.
	 * @return signatureInterfaceMapping with the given ID, or <code>null</code> if not found.
	 */
	public ISignatureInterfaceMapping getSignatureInterfaceMapping(String id);

	/**
	 * Gets the signatureInterfaceMappings from this SubArchitecture with the given
	 * ids.
	 * @param ids ID to look for.
	 * @return signatureInterfaceMappings with the given IDs.  If an element with a given
	 * ID was not found, that ID is ignored.
	 */
	public Collection getSignatureInterfaceMappings(Collection ids);

	/**
	 * Determine if another SubArchitecture is equivalent to this one, ignoring
	 * ID's.
	 * @param SubArchitectureToCheck SubArchitecture to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * SubArchitecture are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(ISubArchitecture SubArchitectureToCheck);

}
