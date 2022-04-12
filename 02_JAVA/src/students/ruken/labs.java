package students.ruken;

public class labs {
    public static void main(String[] args) {
        //  ## Lab 01 - (String) Find the unique
        //  Write a return method that can find the unique characters from the String
        //
        //  Ex: unique("AAABBBCCCDEF") ==> "DEF";
        String str="RUKEN";
        uniqueCharacters(str);
    }
    public static void uniqueCharacters(String str) {
        char findunique = 0;
        for (int i=0;i<str.length();i++){
            findunique=str.charAt(i);
            if (str.indexOf(findunique) != str.lastIndexOf(findunique)){
            }else
                System.out.print(" This is a: " + findunique);
        }
    }
}

