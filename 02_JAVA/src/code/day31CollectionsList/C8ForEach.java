package code.day31CollectionsList;

import java.util.Arrays;

public class C8ForEach {

    public static void main(String[] args) {
        double arr[] = {2.2, 5.6, 98.5, 10.254} ;

        for(double d :  arr){
            System.out.println(d);
        }

        System.out.println(arr);
        System.out.println(
                Arrays . toString(arr)

        );
    }
}
