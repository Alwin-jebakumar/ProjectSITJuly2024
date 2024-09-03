package com.helper;

import java.io.IOException;

public class DataReaderManager {

	/*
	 * 1. Private Constructor
	 * 
	 * 2. One static Method
	 * 
	 */

	private DataReaderManager() {
		// TODO Auto-generated constructor stub
	}

	static DataReaderManager drm;

	public static DataReaderManager getInstanceDRM() {

		if (drm == null) {

			drm = new DataReaderManager();

		}

		return drm;

	}

	DataReader dr;

	public DataReader getInstanceDR() throws IOException {

		if (dr == null) {

			dr = new DataReader();

		}

		return dr;

	}

}
