package code.day16;

public class C1ArrayDemo {

    public static void main(String[] args) {

        //int i = 10 ;

        int i; //declaration
        i = 10 ;  // initialization

        String name1 = "Zelal";
        String name2 = "Mihrican";
        String name3 = "kqBud";
        String name4 = "Ruken" ;


        //String names[] = new String[50] ;
        String names[] ; // declaration
        names  = new String[50] ; // initialization


        System.out.println(names.length);

        names[0] = "Kefo" ;
        names[5] = "Esther" ;

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[5]);
        names[5]=  "Volkan";
        System.out.println(names[5]);
    }

}
