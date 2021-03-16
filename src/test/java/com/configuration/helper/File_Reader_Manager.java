package com.configuration.helper;

public class File_Reader_Manager {
	
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager  reader = new File_Reader_Manager();
		return reader;
	}
	
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader helper = new Configuration_Reader();
		return helper;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
