package code.day06;

public class C9IfElse {

    public static void main(String[]ap){

        int i =1, j=10;

        if(i==j)
            i = i + j;
        else
            i = ++i + j;

        System.out.println(i+"\n"+j);

    }
}
