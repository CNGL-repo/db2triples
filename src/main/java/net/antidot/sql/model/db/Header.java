/* 
 * Copyright 2011-2013 Antidot opensource@antidot.net
 * https://github.com/antidot/db2triples
 * 
 * This file is part of DB2Triples
 *
 * DB2Triples is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * DB2Triples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * SQL model : Header
 *
 * Represents header of a database.
 * Header contains information about types of data stored
 * in column of tables.
 *
 */
package net.antidot.sql.model.db;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public interface Header {

	/**
	 * Return datatypes of this header.
	 * @return
	 */
	public LinkedHashMap<String, String> getDatatypes();
	
	/**
	 * Set datatypes values of this header.
	 * @param datatypes
	 */
	public void setDatatypes(LinkedHashMap<String, String> datatypes);

	/**
	 * Return column names of this header.
	 * @return
	 */
	public ArrayList<String> getColumnNames();

}
