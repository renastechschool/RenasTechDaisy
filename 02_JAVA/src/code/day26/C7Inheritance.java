package code.day26;



//this()  and super() are used for the constructor chaining.
//this() is used to call the current class's constructor
//super() is used to call the parent's constructor.
//between this() and super() either one could be used in a constructor.
//either this() or super() should be used as the first statement of the constructor
//Constructor Chaining
public class C7Inheritance {

    C7Inheritance(){
        this(5);
        System.out.println("Chao");
    }

    C7Inheritance(int a){
        this("slaw") ;
        System.out.println("Hi") ;
    }


    C7Inheritance(String a){  System.out.println(a) ; }

    public static void main(String[] args) {
        new C7Inheritance(10) ;

        new C7Inheritance("Hello");


        new C7Inheritance() ;
    }
}
