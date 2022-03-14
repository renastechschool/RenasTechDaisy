package code.day27;

public class HumanTester {
    public static void main(String[] args) {
        Engineer e = new Engineer();
        Human h = e ; //Engineer "is-a" Human
        LivingThing t = e ; // Engineer "is-a" LivingThing

    }
}

// ABSTRACTION: can be achieved in 2 ways:
//1) Abstract class (partial implementation of abstraction)
//2) Interface (full implementation of abstraction)
interface LivingThing{
    // internally it becomes : public abstract void breathe() ;
    void breathe();
     //public void breathe();
    //abstract  void breathe();
    //abstract public void breathe() ;
}


//Human "is-a" LivingThing
//a class 'implements' an interface while a class 'extends' another class
//LivingThing is the parent interface of the Human class
abstract class Human implements LivingThing{
    //an abstract class can contain abstract as well as non-abstract methods
    void eat(){  System.out.println("Human is eating Pizza"); }

    abstract void work() ;
}

//Engineer "is-a" Human;
// Engineer "is-a" LivingThing
class Engineer extends Human{
    void work(){ System.out.println("Engineer is working..."); }
    public void breathe(){ System.out.println("Engineer is breathing");  }
}