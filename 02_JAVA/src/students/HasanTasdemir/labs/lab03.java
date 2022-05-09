package students.HasanTasdemir.labs;

import java.lang.reflect.Array;

public class lab03 {
    public static void main(String[] args) {
        int number[] = new int[101];
        for (int x = 0; x < number.length; x++) {
            number[x] = x;
        }
        System.out.println("The numbers is divisible by 3");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 3 == 0 && number[i] % 5 != 0 ) {
                System.out.println(number[i]);
            }
        }
        System.out.println("The numbers is divisible by 5");
        for (int i = 0; i < number.length; i++) {
                if (number[i] % 5 == 0 && number[i] % 3 != 0) {
                    System.out.println(number[i]);
                }
            }
        System.out.println("The numbers is divisible by 15");
        for (int i = 0; i < number.length; i++) {
            if(number[i] % 5 ==0 && number[i] % 3 == 0){
                System.out.println(number[i]);
            }
        }
    }
}
