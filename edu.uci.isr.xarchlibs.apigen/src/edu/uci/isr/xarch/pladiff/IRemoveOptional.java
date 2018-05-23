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
 * RemoveOptional <code>xsi:type</code> in the
 * pladiff namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface IRemoveOptional extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"pladiff", "RemoveOptional", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createElement("elementDescription", "instance", "Description", 1, 1),
			XArchPropertyMetadata.createElement("optionalDescription", "instance", "Description", 1, 1)},
		new XArchActionMetadata[]{});

	/**
	 * Set the elementDescription for this RemoveOptional.
	 * @param value new elementDescription
	 */
	public void setElementDescription(edu.uci.isr.xarch.instance.IDescription value);

	/**
	 * Clear the elementDescription from this RemoveOptional.
	 */
	public void clearElementDescription();

	/**
	 * Get the elementDescription from this RemoveOptional.
	 * @return elementDescription
	 */
	public edu.uci.isr.xarch.instance.IDescription getElementDescription();

	/**
	 * Determine if this RemoveOptional has the given elementDescription
	 * @param elementDescriptionToCheck elementDescription to compare
	 * @return <code>true</code> if the elementDescriptions are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasElementDescription(edu.uci.isr.xarch.instance.IDescription elementDescriptionToCheck);

	/**
	 * Set the optionalDescription for this RemoveOptional.
	 * @param value new optionalDescription
	 */
	public void setOptionalDescription(edu.uci.isr.xarch.instance.IDescription value);

	/**
	 * Clear the optionalDescription from this RemoveOptional.
	 */
	public void clearOptionalDescription();

	/**
	 * Get the optionalDescription from this RemoveOptional.
	 * @return optionalDescription
	 */
	public edu.uci.isr.xarch.instance.IDescription getOptionalDescription();

	/**
	 * Determine if this RemoveOptional has the given optionalDescription
	 * @param optionalDescriptionToCheck optionalDescription to compare
	 * @return <code>true</code> if the optionalDescriptions are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasOptionalDescription(edu.uci.isr.xarch.instance.IDescription optionalDescriptionToCheck);
	/**
	 * Determine if another RemoveOptional is equivalent to this one, ignoring
	 * ID's.
	 * @param RemoveOptionalToCheck RemoveOptional to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * RemoveOptional are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(IRemoveOptional RemoveOptionalToCheck);

}
