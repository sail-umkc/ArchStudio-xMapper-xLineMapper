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
package edu.uci.isr.xarch.pladiff;

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * Add <code>xsi:type</code> in the
 * pladiff namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface IAdd extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"pladiff", "Add", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createElement("addStructuralEntity", "pladiff", "AddStructuralEntity", 1, 1),
			XArchPropertyMetadata.createElement("addTypeEntity", "pladiff", "AddTypeEntity", 1, 1)},
		new XArchActionMetadata[]{});

	/**
	 * Set the addStructuralEntity for this Add.
	 * @param value new addStructuralEntity
	 */
	public void setAddStructuralEntity(IAddStructuralEntity value);

	/**
	 * Clear the addStructuralEntity from this Add.
	 */
	public void clearAddStructuralEntity();

	/**
	 * Get the addStructuralEntity from this Add.
	 * @return addStructuralEntity
	 */
	public IAddStructuralEntity getAddStructuralEntity();

	/**
	 * Determine if this Add has the given addStructuralEntity
	 * @param addStructuralEntityToCheck addStructuralEntity to compare
	 * @return <code>true</code> if the addStructuralEntitys are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasAddStructuralEntity(IAddStructuralEntity addStructuralEntityToCheck);

	/**
	 * Set the addTypeEntity for this Add.
	 * @param value new addTypeEntity
	 */
	public void setAddTypeEntity(IAddTypeEntity value);

	/**
	 * Clear the addTypeEntity from this Add.
	 */
	public void clearAddTypeEntity();

	/**
	 * Get the addTypeEntity from this Add.
	 * @return addTypeEntity
	 */
	public IAddTypeEntity getAddTypeEntity();

	/**
	 * Determine if this Add has the given addTypeEntity
	 * @param addTypeEntityToCheck addTypeEntity to compare
	 * @return <code>true</code> if the addTypeEntitys are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasAddTypeEntity(IAddTypeEntity addTypeEntityToCheck);
	/**
	 * Determine if another Add is equivalent to this one, ignoring
	 * ID's.
	 * @param AddToCheck Add to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * Add are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(IAdd AddToCheck);

}