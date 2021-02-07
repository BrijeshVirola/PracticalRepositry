package managers;

import dataProviders.ConfigFileReader;
import dataProviders.JsonDataReader;

import java.io.FileNotFoundException;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;
    private static JsonDataReader jsonDataReader;

    private FileReaderManager(){

    }

    public static FileReaderManager getInstance(){
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() throws FileNotFoundException {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }

    public JsonDataReader getJsonReader() throws FileNotFoundException {
        return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
    }
}
