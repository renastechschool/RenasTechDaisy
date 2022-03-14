package code.day28;
public class C3Interface {
    public static void main(String[] args) {
        Tempo t=  new Tempo()  ; t.show(); t.play();
        //upcasting is implicit
        Pet1 p1 = t ;  p1.show(); p1.play() ;
        Pet p = t ; p.show() ;   //p.play() ; error: as play is not there in Pet interface
        Pet2 p2 = t ; p2.play();   //p2.show() ; error: Cannot resolve method 'show' in 'Pet2'
    }
}

// one interface can inherit (extend) one or more interfaces
//i.e. multiple inheritance is allowed in case of interfaces
interface Pet{   void show() ;  }

interface Pet2 {  void play() ; }

interface Pet1 extends Pet, Pet2{

}

class Tempo implements  Pet1{
    public void show(){
        System.out.println("hello");
    }
    public void play(){
        System.out.println("hi");
    }

}