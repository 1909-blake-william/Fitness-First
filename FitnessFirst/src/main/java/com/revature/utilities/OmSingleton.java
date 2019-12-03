

package com.revature.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.revature.models.User;


public class OmSingleton {

	
	// For readability/maintainability
	public static final String CONTENT_TYPE = "application/json";
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	// invoke <clinit> (don't have to do this, I like the pretty print)
	static {
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
	}
	
	// Restrict Instantiation
	private OmSingleton() {}
	
	
	public static byte[] write(Object o) {
		try {
			return mapper.writeValueAsBytes(o);
		} catch (IOException e) {
			Exceptions.logJsonMarshalException(e, o.getClass());
			return null;
		}
	}
	
	public static Object read(InputStream is, Class<?> clazz) {
		try {
			return mapper.readValue(is, clazz);
		} catch (IOException e) {
			Exceptions.logJsonUnmarshalException(e, clazz);
			return null;
		}
	}


	public static User readValue(BufferedReader reader, Class<User> class1) {
		// TODO Auto-generated method stub
		return null;
	}


	public static String writeValueAsString(Object attribute) {
		// TODO Auto-generated method stub
		return null;
	}


}








