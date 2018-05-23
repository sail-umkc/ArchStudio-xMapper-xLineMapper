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
 * The context interface for the boolguard package.
 * This interface is used to create objects that are used
 * in the boolguard namespace.
 *
 * @author Automatically Generated by xArch apigen
 */
public interface IBoolguardContext extends IXArchContext{

	/**
	 * Create an ISymbol object in this namespace.
	 * @return New ISymbol object.
	 */
	public ISymbol createSymbol();

	/**
	 * Brings an ISymbol object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public ISymbol recontextualizeSymbol(ISymbol value);

	/**
	 * Create an IValue object in this namespace.
	 * @return New IValue object.
	 */
	public IValue createValue();

	/**
	 * Brings an IValue object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IValue recontextualizeValue(IValue value);

	/**
	 * Create an IBooleanGuard object in this namespace.
	 * @return New IBooleanGuard object.
	 */
	public IBooleanGuard createBooleanGuard();

	/**
	 * Brings an IBooleanGuard object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IBooleanGuard recontextualizeBooleanGuard(IBooleanGuard value);

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
	edu.uci.isr.xarch.options.IGuard value);

	/**
	 * Create an IBool object in this namespace.
	 * @return New IBool object.
	 */
	public IBool createBool();

	/**
	 * Brings an IBool object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IBool recontextualizeBool(IBool value);

	/**
	 * Create an IBooleanExp object in this namespace.
	 * @return New IBooleanExp object.
	 */
	public IBooleanExp createBooleanExp();

	/**
	 * Brings an IBooleanExp object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IBooleanExp recontextualizeBooleanExp(IBooleanExp value);

	/**
	 * Create an IParen object in this namespace.
	 * @return New IParen object.
	 */
	public IParen createParen();

	/**
	 * Brings an IParen object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IParen recontextualizeParen(IParen value);

	/**
	 * Create an IGreaterThan object in this namespace.
	 * @return New IGreaterThan object.
	 */
	public IGreaterThan createGreaterThan();

	/**
	 * Brings an IGreaterThan object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IGreaterThan recontextualizeGreaterThan(IGreaterThan value);

	/**
	 * Create an IGreaterThanOrEquals object in this namespace.
	 * @return New IGreaterThanOrEquals object.
	 */
	public IGreaterThanOrEquals createGreaterThanOrEquals();

	/**
	 * Brings an IGreaterThanOrEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IGreaterThanOrEquals recontextualizeGreaterThanOrEquals(IGreaterThanOrEquals value);

	/**
	 * Create an ILessThan object in this namespace.
	 * @return New ILessThan object.
	 */
	public ILessThan createLessThan();

	/**
	 * Brings an ILessThan object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public ILessThan recontextualizeLessThan(ILessThan value);

	/**
	 * Create an ILessThanOrEquals object in this namespace.
	 * @return New ILessThanOrEquals object.
	 */
	public ILessThanOrEquals createLessThanOrEquals();

	/**
	 * Brings an ILessThanOrEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public ILessThanOrEquals recontextualizeLessThanOrEquals(ILessThanOrEquals value);

	/**
	 * Create an IEquals object in this namespace.
	 * @return New IEquals object.
	 */
	public IEquals createEquals();

	/**
	 * Brings an IEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IEquals recontextualizeEquals(IEquals value);

	/**
	 * Create an INotEquals object in this namespace.
	 * @return New INotEquals object.
	 */
	public INotEquals createNotEquals();

	/**
	 * Brings an INotEquals object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public INotEquals recontextualizeNotEquals(INotEquals value);

	/**
	 * Create an IAnd object in this namespace.
	 * @return New IAnd object.
	 */
	public IAnd createAnd();

	/**
	 * Brings an IAnd object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IAnd recontextualizeAnd(IAnd value);

	/**
	 * Create an IOr object in this namespace.
	 * @return New IOr object.
	 */
	public IOr createOr();

	/**
	 * Brings an IOr object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IOr recontextualizeOr(IOr value);

	/**
	 * Create an INot object in this namespace.
	 * @return New INot object.
	 */
	public INot createNot();

	/**
	 * Brings an INot object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public INot recontextualizeNot(INot value);

	/**
	 * Create an IInSet object in this namespace.
	 * @return New IInSet object.
	 */
	public IInSet createInSet();

	/**
	 * Brings an IInSet object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IInSet recontextualizeInSet(IInSet value);

	/**
	 * Create an IInRange object in this namespace.
	 * @return New IInRange object.
	 */
	public IInRange createInRange();

	/**
	 * Brings an IInRange object created in another
	 * context into this context.
	 * @param value Object to recontextualize.
	 * @return <code>value</code> object in this namespace.
	 */
	public IInRange recontextualizeInRange(IInRange value);


	public final static XArchTypeMetadata TYPE_METADATA = new XArchTypeMetadata(
		XArchTypeMetadata.XARCH_CONTEXT,
		"boolguard", null, null,
		new XArchPropertyMetadata[]{},
		new XArchActionMetadata[]{
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, ISymbol.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, ISymbol.TYPE_METADATA, ISymbol.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IValue.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IValue.TYPE_METADATA, IValue.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IBooleanGuard.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IBooleanGuard.TYPE_METADATA, IBooleanGuard.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.PROMOTE, edu.uci.isr.xarch.options.IGuard.TYPE_METADATA, IBooleanGuard.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IBool.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IBool.TYPE_METADATA, IBool.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IBooleanExp.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IBooleanExp.TYPE_METADATA, IBooleanExp.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IParen.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IParen.TYPE_METADATA, IParen.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IGreaterThan.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IGreaterThan.TYPE_METADATA, IGreaterThan.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IGreaterThanOrEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IGreaterThanOrEquals.TYPE_METADATA, IGreaterThanOrEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, ILessThan.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, ILessThan.TYPE_METADATA, ILessThan.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, ILessThanOrEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, ILessThanOrEquals.TYPE_METADATA, ILessThanOrEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IEquals.TYPE_METADATA, IEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, INotEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, INotEquals.TYPE_METADATA, INotEquals.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IAnd.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IAnd.TYPE_METADATA, IAnd.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IOr.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IOr.TYPE_METADATA, IOr.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, INot.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, INot.TYPE_METADATA, INot.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IInSet.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IInSet.TYPE_METADATA, IInSet.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.CREATE, null, IInRange.TYPE_METADATA),
			new XArchActionMetadata(XArchActionMetadata.RECONTEXTUALIZE, IInRange.TYPE_METADATA, IInRange.TYPE_METADATA)});

}

