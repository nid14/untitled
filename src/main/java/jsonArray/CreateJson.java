package jsonArray;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

//{
//        "book": [
//        {
//        "id": "01",
//        "language": "Java",
//        "edition": "third",
//        "author": "Herbert Schildt"
//        },
//        {
//        "id": "07",
//        "language": "C++",
//        "edition": "second",
//        "author": "E.Balagurusamy"
//        }
//        ]
//        }
public class CreateJson {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        jsonObject1.put("id", "01");
        jsonObject1.put("language", "Java");
        jsonObject1.put("edition", "third");
        jsonObject1.put("author", "Herbert Schildt");

        jsonObject2.put("id", "07");
        jsonObject2.put("language", "C++");
        jsonObject2.put("edition", "second");
        jsonObject2.put("author", "E.Balagurusamy");

        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonObject.put("Book", jsonArray);

        try {
            FileWriter fileWriter = new FileWriter("create.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
