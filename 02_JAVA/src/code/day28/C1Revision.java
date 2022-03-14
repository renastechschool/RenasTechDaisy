package code.day28;

public class C1Revision {

    public static void main(String[] args) {
        /*Dentist d = new Dentist() ;
        d.treatPatient();*/

        Doctor doc = new Dentist() ;//Dentist "is-a" Doctor
        //doc.treatPatient();

        //Doctor doc2 = new Cardiologist();   doc2.treatPatient();

        Doctor doc3 = new FamilyDoctor() ;//upcasting
        doc3.treatPatient();
        doc3.eat();

        //If the reference is parent type, then only parent specific methods can be called
        // via that reference
        //In the below example, since doc3 is of Doctor type which does not have bungeeJump method
        //so the method won't run with a Doctor reference variable doc3
        //doc3.bungeeJump();
        FamilyDoctor fd = (FamilyDoctor)doc3 ;//downcasting OR down type casting
        //If using a reference we want to call a method that method should be
        //present in the reference type
        fd.bungeeJump();
    }
}

//abstract class can contain both abstract and non-abstract methods
//an abstract class cannot be instantiated
abstract class Doctor{
    abstract  void treatPatient() ;
    void eat(){ System.out.println("Eating pizza!"); }
}

//FamilyDoctor "is-a" Doctor
class FamilyDoctor extends Doctor{
    void treatPatient(){ System.out.println("FamilyDoc is treating me!"); }
    void bungeeJump(){ System.out.println("family doc is bungee jumping");}
}


//Dentist "is-a" Doctor
class Dentist extends Doctor{
    void treatPatient(){  System.out.println("Do RootCanal");  }
}

//Cardiologist "is-a" Doctor
class Cardiologist extends Doctor{
    void treatPatient() {  System.out.println("Check heartbeat.."); }
}
