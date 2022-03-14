package code.day28;

public class C4Interface {
    public static void main(String[] args) {
        //Static method may be invoked on containing interface class only
        // EatingFood.eatPasta() ;
        //the static method of the interface is associated with just the interface name.
        //It cannot be called with the implementation class name
        Eat.eatPasta();
        Eat e = new EatingFood() ;  e.eatPizza();  e.eatSomethingToLive();
    }
}

//static and default methods are added in the interface from Java version 8, to maintain
// backward compatibility
//Meaning if the new version of Java is used, old existing code should not break
interface Eat{
    void eatPizza() ;
    static void eatPasta(){ System.out.println("You can eat pasta if you want");   }

    //default method of an interface, when inherited,  acts like an instance method
    default void eatSomethingToLive(){ System.out.println("Eat Fruits"); }
}

class EatingFood implements Eat{

    public void eatPizza() {
        System.out.println("Eating pasta");
    }
}