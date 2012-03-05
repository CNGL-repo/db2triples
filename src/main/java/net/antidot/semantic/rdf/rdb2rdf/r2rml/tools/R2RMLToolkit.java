/***************************************************************************
 *
 * R2RML Toolkit
 *
 * (C) 2011 Antidot (http://www.antidot.net)
 *
 * Module			:	Main
 * 
 * Fichier			:	DirectMappingTools.java
 *
 * Description		:   Collection of useful tool-methods used in R2RML 
 *
 * Options de compilation:
 *
 * Auteurs(s)			:	JHO
 *
 *
 ****************************************************************************/
package net.antidot.semantic.rdf.rdb2rdf.r2rml.tools;

import java.util.Set;

public abstract class R2RMLToolkit {

	public static boolean checkCurlyBraces(String value) {
		if (value == null)
			// No brace : valid
			return true;
		char[] chars = value.toCharArray();
		boolean openedBrace = false;
		boolean emptyBraceContent = false;
		boolean closedBrace = true;
		for (char c : chars) {
			switch (c) {
			case '{':
				// Already opened
				if (openedBrace)
					return false;
				openedBrace = true;
				closedBrace = false;
				emptyBraceContent = true;
				break;

			case '}':
				// Already closed or not opened or empty content
				if (closedBrace || !openedBrace || emptyBraceContent)
					return false;
				openedBrace = false;
				closedBrace = true;
				emptyBraceContent = true;
				break;

			default:
				if (openedBrace)
					emptyBraceContent = false;
				break;
			}
		}
		// All curly braces have to be closed
		return (!openedBrace && closedBrace);
	}

	public static boolean checkInverseExpression(String inverseExpression) {
		// TODO
		return false;
	}

	public static boolean checkStringTemplate(String stringTemplate) {
		// TODO
		return true;
	}

	public static Set<String> extractColumnNamesFromStringTemplate(
			String stringTemplate) {
		// TODO
		return null;
	}

}
