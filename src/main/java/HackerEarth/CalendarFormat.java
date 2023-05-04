package HackerEarth;

import java.util.HashMap;
import java.util.Map;

//"1st Mar 1974" => 1974-03-01
public class CalendarFormat {
    public static String convertDate(String date) {
        if (date.isEmpty()){
            return "";
        }
        String[] arr = date.split(" ");
        if (arr.length < 3) {
            return "";
        }
        String dayStr = arr[0] ;
        int day = 0;
        for (int i =0; i < dayStr.length(); i++) {
            if (Character.isDigit(dayStr.charAt(i))) {
                int num = dayStr.charAt(i) - '0';
                day = day*10 + num;
            } else {
                break;
            }
        }
        String finalDayStr = "";
        if (day <=9) {
            finalDayStr = "0" + day;
        } else {
            finalDayStr = String.valueOf(day);
        }

        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        String month = map.get(arr[1]);
        String year = arr[2];
        String wholeDate = year + "-" + month + "-" + finalDayStr;
        return wholeDate;
    }

    public static void main(String[] args) {
        System.out.println(convertDate("1st Mar 1974"));
    }


}
