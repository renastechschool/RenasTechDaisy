package code.day28;


/*
An interface can contain the following types of methods(with the following modifiers or access specifiers):
1) abstract methods
2) static methods
3) default methods
NOTE: default keyword is specifically used for interface methods

There is only one access modifier allowed in interface ==> public

 Difference between abstract class and interface
 - A class can inherit(extends) only one class at a time
 - A class can implement multiple interface


 NOTES:
 - One class can implement one or more interfaces
 - One interface can extend one or more interfaces
 */
public class C2Interface {
    public static void main(String[] args) {
        //Demo d = new Demo() ;  d.show() ; d.play();
        My m = new Demo() ; m.show() ; //m.play() ;
        My1 m1 = new Demo() ;  m1.play();  //m1.show() ;

    }
}

interface My{
    //public abstract void show()
    void show() ;
}

interface My1{ void play() ;}

class Foo implements My{
    public void show(){ System.out.println("Hello");   }
}

//One class can implement one or more interfaces
class Demo implements My, My1{
    public void show(){ System.out.println("slaw") ; }
    public void play(){System.out.println("play") ; }
}




