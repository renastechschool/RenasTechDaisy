package code.studyhalls.st_28_01_2022;
public class PolyDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();  show(a1);
        Animal a2 = new Cat() ; show(a2) ;
        Animal a3 = new Tiger() ;   show(a3) ;
    }
    //In the below example Animal a acts as a polymorphic reference
    //Below is also the example of Dynamic Binding OR Late Binding OR Runtime Polymorphism
    //which is achieved by method overriding
    //Upcasting is also a way to achieve Polymorphism
    static void show(Animal a ){   a.makeNoise(); }
}

interface Animal{
    abstract public void makeNoise() ;//overridden method
}

//Dog "is-a" Animal
class Dog implements Animal{
    public void makeNoise(){ System.out.println("Roff Roff!!");}//overriding method
}

//Cat "is-a" Animal
class Cat implements Animal{
    public void makeNoise(){ System.out.println("Meow Meow!!");}//overriding method
}

//Tiger "is-a" Animal
class Tiger implements Animal{
    public void makeNoise(){ System.out.println("Roar Roar!!");}//overriding method
}
