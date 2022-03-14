package code.day6;

public class C8If {

    public static void main(String[]ak){

        int i=0, j=5;

        if(j<40) i++;

        if(j>=50) i = 6+i;

        if(j==50){
            ++i;
            j=j+i;
        }

        System.out.println(j);
        System.out.println(i);



    }
}
