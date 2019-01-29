package com.finreach.framework.libraries;

import com.finreach.framework.dataproviders.ConfigFileReader;

public class FileReaderLibrary {

	private static FileReaderLibrary fileReaderManager = new FileReaderLibrary();
	private static ConfigFileReader configFileReader;

	private FileReaderLibrary() {
	}

	public static FileReaderLibrary getInstance() {

		return fileReaderManager;
	}

	// initialize ConfigFileReader object, if already present then return the
	// current instance.
	public ConfigFileReader getConfigReader() {

		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

}
