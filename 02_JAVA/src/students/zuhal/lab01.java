package src.students.zuhal;

public class lab01 {

public static void main(String[] args) {
    //  ## Lab 01 - (String) Find the unique
    //  Write a return method that can find the unique characters from the String
    //  Ex: unique("AAABBBCCCDEF") ==> "DEF";

    String str="AAABBBCCCDEF";
    uniqueCharacters(str);
}

    public static void uniqueCharacters(String str) {
        char unique = 0;
        for (int i=0;i<str.length();i++){
            unique=str.charAt(i);
            if (str.indexOf(unique) != str.lastIndexOf(unique)){
            }else
                System.out.print("" + unique);
        }
    }
}
