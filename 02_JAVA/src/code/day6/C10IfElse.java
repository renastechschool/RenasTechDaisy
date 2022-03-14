package code.day6;

public class C10IfElse {

    public static void main(String[]pa){

        int i=5, j=2;

        if(i*j >=10){

            i++; j--;
            int r = i*j ;
            System.out.println(r+r);
        }
        else {
            int r = ++i * --j;
            System.out.println(r);
        }

        System.out.println(i + "\n" + j);


    }
}
