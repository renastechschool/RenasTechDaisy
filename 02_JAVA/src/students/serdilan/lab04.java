package students.serdilan;

import java.util.HashMap;
import java.util.Map;

//    String -- Frequency of Characters
//    Write a return method that can find the frequency of characters
//
//    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class lab04 {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        getFrequencyOfChars(str);
    }
    public static void getFrequencyOfChars(String input) {
        int len = input.length();
        Map<Character, Integer> zip = new HashMap<Character, Integer>();
        for (int j = 0; len > j; j++) {
            int count = 0;
            for (int i = 0; len > i; i++) {
                if (input.charAt(j) == input.charAt(i)) {
                    count++;
                }
            }
            zip.put(input.charAt(j), count);
        }
        StringBuffer myValue = new StringBuffer();
        String myMapKeyValue = "";
        for (Map.Entry<Character, Integer> entry : zip.entrySet()) {
            myMapKeyValue = Character.toString(entry.getKey()).concat(
                    Integer.toString(entry.getValue()));
            myValue.append(myMapKeyValue);
        }
        System.out.println(myValue);
    }
}



