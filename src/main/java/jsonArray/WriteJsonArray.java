package jsonArray;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJsonArray {
    public static void main(String[] args) {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("ID", "1");
        jsonObject.put("First_Name", "Krishna Kasyap");
        jsonObject.put("Last_Name", "Bhagavatula");
        jsonObject.put("Date_Of_Birth", "1989-09-26");
        jsonObject.put("Place_Of_Birth", "Vishakhapatnam");
        jsonObject.put("Country", "25000");

        //Creating a json array
        JSONArray array = new JSONArray();
        array.add("e-mail: krishna_kasyap@gmail.com");
        array.add("phone: 9848022338");
        array.add("city: Hyderabad");
        array.add("Area: Madapur");
        array.add("State: Telangana");

        //Adding array to the json object
        jsonObject.put("contact",array);

        try {
            FileWriter file = new FileWriter("json_array_output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);

    }
}
