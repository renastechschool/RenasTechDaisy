package students.Kadir;

//    Write a return  method that can find the unique characters from the String
//
//    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


public class Lab01 {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        char ch;
      for (int i = 0 ;i<str.length() ;i++){
         ch=str.charAt(i);
         if (str.indexOf(ch) == str.lastIndexOf(ch)){
             System.out.print(ch);
          }
      }

    }

}
