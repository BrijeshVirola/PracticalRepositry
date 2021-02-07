package dataProviders;

import com.google.gson.Gson;
import managers.FileReaderManager;
import testDataTypes.LabelDetails;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonDataReader {

        @SuppressWarnings("unchecked")
        public static String getjsonData(String key) {
            String data = null;
            JSONParser parser = new JSONParser();
            try {
               // Object obj = parser.parse(new FileReader("src/test/java/resources/testDataResources/LabelDetails.json"));
                Object obj = parser.parse(new FileReader("src/test/java/resources/testDataResources/CreateCollections.json"));
                // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
                JSONObject jsonObject = (JSONObject) obj;

                // A JSON array. JSONObject supports java.util.List interface.
                data = (String) jsonObject.get(key);
                //System.out.println(data);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return data;
        }
    }