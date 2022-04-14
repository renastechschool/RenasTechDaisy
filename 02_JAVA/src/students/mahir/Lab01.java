package students.mahir;

public class Lab01 {

    public static void main(String[] args) {
        /**
         *  //    Write a return  method that can find the unique characters from the String
         *     //
         *     //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
         */

        String s1="AAABBBCCCDEF";
        System.out.println(unique(s1)); // == unique("AAABBBCCCDEF");

        System.out.println(unique("java")); //jv


    }



    public static String unique(String str){
        //                             java >> {j, a,v ,a}
        //                                      0  1 2 3
        // last index ==>  str.length() -1;

        String answer=""; // I will store my answer in this variable;

        String [] arr=str.split("");

        for (int i = 0; i <str.length() ; i++) { // fori // i=0

            int count= 0;

            for (int j = 0; j <str.length() ; j++) { // j=0;

                //   j == j
                if ( arr[i].equals( arr[j])){ // == , .equals(context )

                    count++; // 0 ++ => 1
                }
            }

            if (count==1){

                answer +=arr[i];
            }


        }

        return answer;


    }


}
