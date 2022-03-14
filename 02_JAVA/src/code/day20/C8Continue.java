package code.day20;

public class C8Continue {

    public static void main(String[] args) {

        //when continue is executed that particular iteration is skipped
        for(int i=1; i<10; i++){

            if(i%2==0) continue;

            System.out.println(i);
        }


    }
}
