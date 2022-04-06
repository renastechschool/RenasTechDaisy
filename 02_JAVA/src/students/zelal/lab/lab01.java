package students.zelal.lab;

public class lab01 {

    public static void main(String[] args) {
        //    ## Lab 01 -  (String) Find the unique
        //    Write a return  method that can find the unique characters from the String
        //
        //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        String str = "AAABBBCCCDEF";
        String s1="AAABBBCCCDEF";
        System.out.println(unique(s1)); // == unique("AAABBBCCCDEF");


        char findunique = 0;
        for (int i = 0; i < str.length(); i++) {
            findunique = str.charAt(i);
            if (str.indexOf(findunique) != str.lastIndexOf(findunique)) {
            } else
                System.out.print("" + findunique);
        }
    }
// with method
    public static String unique(String str){

        String answer="";

        String [] arr=str.split("");

        for (int i = 0; i <str.length() ; i++) {

            int count= 0;

            for (int j = 0; j <str.length() ; j++) {


                if ( arr[i].equals( arr[j])){ // == , .equals(context )

                    count++;
                }
            }

            if (count==1){

                answer +=arr[i];
            }


        }

        return answer;




    }
}



