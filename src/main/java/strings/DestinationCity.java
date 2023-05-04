package strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
//    Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
//    Output: "Sao Paulo"
//    Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

    public static String destinationCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        for (String city : map.values()) {
            if (!map.containsKey(city)) {
                return city;
            }
        }
        return "";
    }
    public static void main(String[] args) {
//        System.out.println(destinationCity([["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]));
    }
  }


