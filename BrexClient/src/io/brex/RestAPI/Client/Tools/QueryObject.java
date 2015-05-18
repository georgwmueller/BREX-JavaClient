package io.brex.RestAPI.Client.Tools;

import java.lang.reflect.Field;
import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

public abstract class QueryObject {

	protected Field[] getFields() {
		return this.getClass().getFields();	
	}
	
	public Form keyVs()  
	{
	
		Form ret = new Form();
		
		try {
		for (Field f : getFields()) {
			Object target = f.get ( this )	;
			if (target != null)
				ret.param(
						f.getName().toLowerCase()
					,	(String) target	
					);
		}
		} catch (IllegalArgumentException ia) {
			//
		}
		catch (IllegalAccessException ia) {
		//
		}
		return ret;
	}
	
	public Entity<?> postParams()  { 
		return Entity.entity(keyVs() 
				, MediaType.APPLICATION_FORM_URLENCODED_TYPE) ;
		}
	
}
