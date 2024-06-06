import java.io.FileReader;
import java.util.HashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONToHashMap {
    public static void main(String[] args) {
        try {
            // Path to the JSON file
            String filePath = "{\n"
            		+ "  \"name\": \"John\",\n"
            		+ "  \"age\": 30,\n"
            		+ "  \"city\": \"New York\"\n"
            		+ "}";

            // Create a JSON parser
            JSONParser parser = new JSONParser();

            // Parse the JSON file
            Object obj = new JSONParser().parse(filePath);

            // Convert the parsed JSON object to a JSONObject
            JSONObject jsonObject = (JSONObject) obj;

            // Create a HashMap to store JSON values
            HashMap<String, Object> map = new HashMap<>();

            // Iterate over the JSON keys and values
            for (Object key : jsonObject.keySet()) {
                String keyValue = (String) key;
                Object value = jsonObject.get(keyValue);
                map.put(keyValue, value);
            }

            // Print the HashMap
            System.out.println("HashMap: " + map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
