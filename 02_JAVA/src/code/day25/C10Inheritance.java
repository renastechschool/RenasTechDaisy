package code.day25;

public class C10Inheritance {
    public static void main(String[] args) {
       Evlat10 e = new Evlat10() ;
       e.show();
    }

}

class Dede10{
    void show(){   System.out.println("Hello");  }
}

class Baba10 extends Dede10{
    //overridden method
    void show(){     System.out.println("hi");  }
}


class Evlat10 extends Baba10{
    //overriding OR Override method
    void show(){  System.out.println("Chai");   }
}