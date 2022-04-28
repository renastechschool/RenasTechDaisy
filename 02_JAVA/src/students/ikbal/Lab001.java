package students.ikbal;

public class Lab001 {


     /*   char ch;
        String str = "AABCDDYDFSDGDFGX";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }*/


    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        char ch;

        for (int i =0; i<str.length();i++){
            ch= str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }
    }

}



