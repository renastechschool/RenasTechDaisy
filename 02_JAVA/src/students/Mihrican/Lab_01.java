package students.Mihrican;

public class Lab_01 {

    //    Write a return  method that can find the unique characters from the String
    //
    //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args){

        String s1="AAABBBCCCDEF";
        System.out.println(unique(s1));

    }

    public static String unique(String str) {
        String unique1 = "";
        String[] arr = str.split("");

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            if (count == 1) {
                unique1 += arr[i];
            }

        }
        return unique1;
    }

    }