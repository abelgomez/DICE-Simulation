package es.unizar.disco.pnml.m2m.utils;

import java.util.Collection;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;

import es.unizar.disco.simulation.models.datatypes.PrimitiveVariableAssignment;

public class MathUtils {

	@Operation(contextual = true)
	public static String eval(String expression, Collection<PrimitiveVariableAssignment> vars) {
	    JexlEngine engine = new JexlBuilder().create();
	    JexlExpression expr = engine.createExpression(expression);
	    JexlContext context = new MapContext();
	    for (PrimitiveVariableAssignment var : vars) {
	    	context.set(var.getVariable(), var.getValue());
	    }
	    return expr.evaluate(context).toString();
	}

}
