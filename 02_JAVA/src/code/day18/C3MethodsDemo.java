package code.day18;

public class C3MethodsDemo {

    public static void main(String[] args) {
        //a local variable is local to a method or block in which it is declared.
        //So, local variable cannot be used outside the method or block where
        //it is declared
        //any variable declared inside a method is called a local variable
        int i = 10;
        System.out.println("hello people!");
        m1();//first m1 method call will be resolved, then below statements are executed
        System.out.println("Bye"); m2() ;
    }

    static void m1(){
        m2();
        int j = 50;//local variable
        System.out.println("m1 method " + j );
       m2();
    }


    static void m2(){
        int k = 30 ;// local variable
        System.out.println("m2 method");
    }

}
