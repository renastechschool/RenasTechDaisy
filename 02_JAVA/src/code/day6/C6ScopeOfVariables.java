package code.day6;

public class C6ScopeOfVariables {

    public static void main(String[]sp) {

        System.out.println("This is before the block of code");


        {
            System.out.println("This is inside a block of code");
            int i = 10;
            System.out.println(i);//10
        }
        int i = 20;
        System.out.println(i);//20
        if('a'!='b')
        System.out.println("This is after the block of code");

    }
}
