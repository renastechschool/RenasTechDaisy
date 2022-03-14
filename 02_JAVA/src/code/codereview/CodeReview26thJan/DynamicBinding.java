package code.codereview.CodeReview26thJan;

public class DynamicBinding {


    public static void main(String[] args) {
        Doctor doc = new Dentist() ;
        //Runtime Polymorphism OR Dynamic Binding (achieved by method overriding) OR Late Binding
        //when an object is bound with the functionality at runtime i.e. at runtime
        //it's decided which method(overriding or overridden) to run
        doc.treatPatient();
    }
}

abstract class Doctor{
    //overridden
    abstract void treatPatient() ;
}

class Dentist extends Doctor{
    //overriding
    void treatPatient(){
        System.out.println("Do root Canal");
    }
}
