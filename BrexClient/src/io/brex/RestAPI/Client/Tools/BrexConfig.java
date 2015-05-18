package io.brex.RestAPI.Client.Tools;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.*;


public class BrexConfig implements Serializable 
{
	private static final long serialVersionUID = 395657741119819239L;
	
	public static String DefaultBaseAddressStr = "https://api.brex.io/";
	public static String DefaultUser_Key = "sandbox";
	public static String DefaultPrefix = "api/v1/";
	public static String DefaultMediaType = "application/json";
	
	public String BaseAddressStr = DefaultBaseAddressStr;
	public String User_Key = DefaultUser_Key;
	public String Prefix = DefaultPrefix;
	public String MediaType = DefaultMediaType;
	
	public String ConfigSource = "future use";
	
	public BrexConfig()
	{		
	}
	
	public BrexConfig readKeyFrom(String fileLocation) 
	{
		try {
			File keyfile = new File(fileLocation);
			if (!keyfile.canRead()) return this;
			
			Path path = keyfile.toPath();
			Stream<String> ss =  Files.lines( path );
			
			User_Key = ss.toArray()[0].toString();
		} catch (IOException e) {
	 	
		}
		return this;
	}
	
}
