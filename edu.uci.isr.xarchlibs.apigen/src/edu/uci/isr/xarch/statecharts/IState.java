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
package edu.uci.isr.xarch.statecharts;

import java.util.Collection;
import edu.uci.isr.xarch.XArchActionMetadata;
import edu.uci.isr.xarch.XArchTypeMetadata;
import edu.uci.isr.xarch.XArchPropertyMetadata;

/**
 * Interface for accessing objects of the
 * State <code>xsi:type</code> in the
 * statecharts namespace.
 * 
 * @author Automatically generated by xArch apigen
 */
public interface IState extends edu.uci.isr.xarch.IXArchElement{

	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_ELEMENT,
		"statecharts", "State", edu.uci.isr.xarch.IXArchElement.TYPE_METADATA,
		new XArchPropertyMetadata[]{
			XArchPropertyMetadata.createAttribute("stateType", "statecharts", "StateType", null, null),
			XArchPropertyMetadata.createAttribute("id", "instance", "Identifier", null, null),
			XArchPropertyMetadata.createElement("description", "instance", "Description", 1, 1),
			XArchPropertyMetadata.createElement("entry", "statecharts", "Action", 0, XArchPropertyMetadata.UNBOUNDED),
			XArchPropertyMetadata.createElement("exit", "statecharts", "Action", 0, XArchPropertyMetadata.UNBOUNDED),
			XArchPropertyMetadata.createElement("doActivity", "statecharts", "Action", 0, XArchPropertyMetadata.UNBOUNDED)},
		new XArchActionMetadata[]{});

	/**
	 * Set the stateType attribute on this State.
	 * @param stateType stateType
	 * @exception FixedValueException if the attribute has a fixed value
	 * and the value passed is not the fixed value.
	*/
	public void setStateType(String stateType);

	/**
	 * Remove the stateType attribute from this State.
	 */
	public void clearStateType();

	/**
	 * Get the stateType attribute from this State.
	 * if the attribute has a fixed value, this function will
	 * return that fixed value, even if it is not actually present
	 * in the XML document.
	 * @return stateType on this State
	 */
	public String getStateType();

	/**
	 * Determine if the stateType attribute on this State
	 * has the given value.
	 * @param stateType Attribute value to compare
	 * @return <code>true</code> if they match; <code>false</code>
	 * otherwise.
	 */
	public boolean hasStateType(String stateType);


	/**
	 * Set the id attribute on this State.
	 * @param id id
	 * @exception FixedValueException if the attribute has a fixed value
	 * and the value passed is not the fixed value.
	*/
	public void setId(String id);

	/**
	 * Remove the id attribute from this State.
	 */
	public void clearId();

	/**
	 * Get the id attribute from this State.
	 * if the attribute has a fixed value, this function will
	 * return that fixed value, even if it is not actually present
	 * in the XML document.
	 * @return id on this State
	 */
	public String getId();

	/**
	 * Determine if the id attribute on this State
	 * has the given value.
	 * @param id Attribute value to compare
	 * @return <code>true</code> if they match; <code>false</code>
	 * otherwise.
	 */
	public boolean hasId(String id);


	/**
	 * Set the description for this State.
	 * @param value new description
	 */
	public void setDescription(edu.uci.isr.xarch.instance.IDescription value);

	/**
	 * Clear the description from this State.
	 */
	public void clearDescription();

	/**
	 * Get the description from this State.
	 * @return description
	 */
	public edu.uci.isr.xarch.instance.IDescription getDescription();

	/**
	 * Determine if this State has the given description
	 * @param descriptionToCheck description to compare
	 * @return <code>true</code> if the descriptions are equivalent,
	 * <code>false</code> otherwise
	 */
	public boolean hasDescription(edu.uci.isr.xarch.instance.IDescription descriptionToCheck);

	/**
	 * Add a entry to this State.
	 * @param newEntry entry to add.
	 */
	public void addEntry(IAction newEntry);

	/**
	 * Add a collection of entrys to this State.
	 * @param entrys entrys to add.
	 */
	public void addEntrys(Collection entrys);

	/**
	 * Remove all entrys from this State.
	 */
	public void clearEntrys();

	/**
	 * Remove the given entry from this State.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param entryToRemove entry to remove.
	 */
	public void removeEntry(IAction entryToRemove);

	/**
	 * Remove all the given entrys from this State.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param entrys entry to remove.
	 */
	public void removeEntrys(Collection entrys);

	/**
	 * Get all the entrys from this State.
	 * @return all entrys in this State.
	 */
	public Collection getAllEntrys();

	/**
	 * Determine if this State contains a given entry.
	 * @return <code>true</code> if this State contains the given
	 * entryToCheck, <code>false</code> otherwise.
	 */
	public boolean hasEntry(IAction entryToCheck);

	/**
	 * Determine if this State contains the given set of entrys.
	 * @param entrysToCheck entrys to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>entrys</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasEntrys(Collection entrysToCheck);

	/**
	 * Determine if this State contains each element in the 
	 * given set of entrys.
	 * @param entrysToCheck entrys to check for.
	 * @return <code>true</code> if every element in
	 * <code>entrys</code> is found in this State,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllEntrys(Collection entrysToCheck);


	/**
	 * Add a exit to this State.
	 * @param newExit exit to add.
	 */
	public void addExit(IAction newExit);

	/**
	 * Add a collection of exits to this State.
	 * @param exits exits to add.
	 */
	public void addExits(Collection exits);

	/**
	 * Remove all exits from this State.
	 */
	public void clearExits();

	/**
	 * Remove the given exit from this State.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param exitToRemove exit to remove.
	 */
	public void removeExit(IAction exitToRemove);

	/**
	 * Remove all the given exits from this State.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param exits exit to remove.
	 */
	public void removeExits(Collection exits);

	/**
	 * Get all the exits from this State.
	 * @return all exits in this State.
	 */
	public Collection getAllExits();

	/**
	 * Determine if this State contains a given exit.
	 * @return <code>true</code> if this State contains the given
	 * exitToCheck, <code>false</code> otherwise.
	 */
	public boolean hasExit(IAction exitToCheck);

	/**
	 * Determine if this State contains the given set of exits.
	 * @param exitsToCheck exits to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>exits</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasExits(Collection exitsToCheck);

	/**
	 * Determine if this State contains each element in the 
	 * given set of exits.
	 * @param exitsToCheck exits to check for.
	 * @return <code>true</code> if every element in
	 * <code>exits</code> is found in this State,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllExits(Collection exitsToCheck);


	/**
	 * Add a doActivity to this State.
	 * @param newDoActivity doActivity to add.
	 */
	public void addDoActivity(IAction newDoActivity);

	/**
	 * Add a collection of doActivitys to this State.
	 * @param doActivitys doActivitys to add.
	 */
	public void addDoActivitys(Collection doActivitys);

	/**
	 * Remove all doActivitys from this State.
	 */
	public void clearDoActivitys();

	/**
	 * Remove the given doActivity from this State.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param doActivityToRemove doActivity to remove.
	 */
	public void removeDoActivity(IAction doActivityToRemove);

	/**
	 * Remove all the given doActivitys from this State.
	 * Matching is done by the <code>isEquivalent(...)</code> function.
	 * @param doActivitys doActivity to remove.
	 */
	public void removeDoActivitys(Collection doActivitys);

	/**
	 * Get all the doActivitys from this State.
	 * @return all doActivitys in this State.
	 */
	public Collection getAllDoActivitys();

	/**
	 * Determine if this State contains a given doActivity.
	 * @return <code>true</code> if this State contains the given
	 * doActivityToCheck, <code>false</code> otherwise.
	 */
	public boolean hasDoActivity(IAction doActivityToCheck);

	/**
	 * Determine if this State contains the given set of doActivitys.
	 * @param doActivitysToCheck doActivitys to check for.
	 * @return Collection of <code>java.lang.Boolean</code>.  If the i<sup>th</sup>
	 * element in <code>doActivitys</code> was found, then the i<sup>th</sup>
	 * element of the collection will be set to <code>true</code>, otherwise it
	 * will be set to <code>false</code>.  Matching is done with the
	 * <code>isEquivalent(...)</code> method.
	 */
	public Collection hasDoActivitys(Collection doActivitysToCheck);

	/**
	 * Determine if this State contains each element in the 
	 * given set of doActivitys.
	 * @param doActivitysToCheck doActivitys to check for.
	 * @return <code>true</code> if every element in
	 * <code>doActivitys</code> is found in this State,
	 * <code>false</code> otherwise.
	 */
	public boolean hasAllDoActivitys(Collection doActivitysToCheck);

	/**
	 * Determine if another State has the same
	 * id as this one.
	 * @param StateToCheck State to compare with this
	 * one.
	 */
	public boolean isEqual(IState StateToCheck);
	/**
	 * Determine if another State is equivalent to this one, ignoring
	 * ID's.
	 * @param StateToCheck State to compare to this one.
	 * @return <code>true</code> if all the child elements of this
	 * State are equivalent, <code>false</code> otherwise.
	 */
	public boolean isEquivalent(IState StateToCheck);

}