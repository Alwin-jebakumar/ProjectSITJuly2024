package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {
	
	Properties p;

	public DataReader() throws IOException {

		File f = new File(
				"D:\\Eclipse NotesSITjune\\ProjectDemo\\src\\main\\java\\com\\propertyfile\\Magneto.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
		
	}

	public String getPropertyUrl() throws IOException {

		String url = p.getProperty("url");

		return url;

	}

	public String getPropertyUsername() {

		String username = p.getProperty("username");

		return username;

	}

	public String getPropertyPassword() {

		String password = p.getProperty("password");

		return password;

	}

}
