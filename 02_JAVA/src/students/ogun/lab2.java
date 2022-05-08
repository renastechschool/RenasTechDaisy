package study;

public class lab2 {

    public static void main(String[] args) {

        int numbers [] = {2, 10, -5 ,58 , 100, 0, 24};

        int max = numbers[0];

        System.out.println(max);

        for (int i=0;i<numbers.length;i++){

            if (numbers[i]>max){
                max=numbers[i];
            }
        }      System.out.println(max);

    }
}