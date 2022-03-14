package code.day27;

public class PetTester {
    public static void main(String[] args) {

        //UPCASTING: a parent's reference can refer to the child class's object
        Labrador dog1 = new Labrador();
        Dog dog2 = new Labrador();//Labrador "is-a" Dog
        Pet dog3 = new Labrador() ;//Labrador "is-a" Pet
    }
}


abstract class Pet{
    abstract void play() ;
}


//Dog "is-a" Pet
abstract class Dog extends Pet{

}


//Labrador "is-a" Dog
//Labrador "is-a" Pet
class Labrador extends Dog{
    void play(){
        System.out.println("Cute Labra is playing ....");
    }
}