package net.antidot.semantic.rdf.rdb2rdf.r2rml.function;

import java.util.ArrayList;
import java.util.List;

import net.antidot.semantic.rdf.rdb2rdf.r2rml.model.ObjectMap;

/**
 * A POJO for capturing function calls.
 * 
 * @author Christophe Debruyne
 *
 */
public class FunctionCall {

	private String functionName;
	private List<ObjectMap> parameters = new ArrayList<ObjectMap>();

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public List<ObjectMap> getParameters() {
		return parameters;
	}

	public void setParameters(List<ObjectMap> parameters) {
		this.parameters = parameters;
	}

}
