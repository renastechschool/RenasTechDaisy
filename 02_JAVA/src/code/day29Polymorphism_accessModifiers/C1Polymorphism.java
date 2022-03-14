package code.day29Polymorphism_accessModifiers;

public class C1Polymorphism {

    //Static Binding OR Early Binding OR Compile time polymorphism
    //is achieved vis method overloading


    /*
    Static VS Dynamic Binding:
    When a method call is resolved at compilation time, it's called Static Binding while
    when a method call is resolved at runtime (in case of method overriding) it's called Dynamic Binding
    Dynamic Binding is applicable only for instance methods
     */
    public static void main(String[] args) {
        C1Polymorphism.show() ;
    }

    static void show(){
        System.out.println("Hello");
    }
}
