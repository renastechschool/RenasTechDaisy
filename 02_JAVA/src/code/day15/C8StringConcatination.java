package code.day15;

public class C8StringConcatination {

    public static void main(String[] args) {

        /*
        String Concatenation
        + operator
        concat method
         */
        /*
        String s1 = "snow" + "ball";
        System.out.println(s1);

        System.out.println("new" + " York" + " is very cold");

        String s2 = "fair".concat("play") ;
        System.out.println(s2);

        System.out.println("New".concat(" Jersey"));
        */

       // System.out.println(  10 + 20 + "30"  );

       System.out.println(

                  10 + 20 + "30" + 10 + 10
               //    30   + "30" + 10 + 10
               //       "3030"   + 10 + 10
               //            "303010" + 10
               //                 30301010




       );


       /* System.out.println(

                10 + 20 + "30" + (10+10)
               //  30   + "30" + (10+10)
               //     "3030"   +  (20)
               //           "303020"
        );
        */

        //System.out.println("50" + "60" + "gully");

        System.out.println(

                 (10+10+"30"+10+10+"25"+10)
                //( 20 +"30"+10+10+"25"+10)
                //(  "2030" +10+10+"25"+10)
                //(    "203010"+10+"25"+10)
                //(     "20301010"+"25"+10)
                //(        "2030101025"+10)
                //(         "203010102510")
        );

    }
}
