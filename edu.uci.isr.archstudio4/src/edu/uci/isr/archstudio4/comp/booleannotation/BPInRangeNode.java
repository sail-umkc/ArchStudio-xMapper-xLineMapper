package edu.uci.isr.archstudio4.comp.booleannotation;


/* Generated By:JJTree: Do not edit this line. BPInRangeNode.java */

import edu.uci.isr.xarchflat.ObjRef;
import edu.uci.isr.xarchflat.XArchFlatInterface;

/**
 * In-Range expression.
 *
 * @author Rob Egelink (egelink@ics.uci.edu)
 */
public class BPInRangeNode extends SimpleNode
{

    public BPInRangeNode( int id )
    {
        super( id );
    }

    public BPInRangeNode( Boolean p, int id )
    {
        super( p, id );
    }

    /**
     * Returns the in-range expression stored in an object of type
     * BooleanExp.
     * @param context A boolguard context.
     * @param xarch An XArchADT proxy.
     * @return in-range expression
     */
    public ObjRef toXArch( ObjRef context, XArchFlatInterface xarch )
    {
        ObjRef inrange = xarch.create( context, "InRange" );

        // The first operand can only be a symbol (i.e. variable)
        ObjRef first = xarch.create( context, "Symbol" );
        xarch.set( first, "Value", firstOp );
        xarch.set( inrange, "Symbol", first );

        // The second and third operands can only be values.
        ObjRef second = xarch.create( context, "Value" );
        xarch.set( second, "Value", secondOp );
        xarch.add( inrange, "Value", second );
        ObjRef third = xarch.create( context, "Value" );
        xarch.set( third, "Value", thirdOp );
        xarch.add( inrange, "Value", third );

        ObjRef boolexp = xarch.create( context, "BooleanExp" );
        xarch.set( boolexp, "InRange", inrange );

        return boolexp;
    }

    /**
     * Returns a human readable representation of the expression stored
     * in a in-range node.
     * @return in-range expression.
     */
    public String toString()
    {
        return new String( firstOp + " @ [" + secondOp + ", " + thirdOp + "]" );
    }

    protected String firstOp;   // the variable (symbol) name
    protected String secondOp;  // the lowerbound
    protected String thirdOp;   // the upperbound
}
