package code.day25;

public class C8Inheritance {

    public static void main(String[] args) {
        Evlet8 e = new Evlet8();
        e.show();
        e.display();
    }
}

class Dede8{
    void show(){  System.out.println("Hello");  }
}

class Baba8 extends Dede8{
    private void play(){ System.out.println("Hi"); }
    void display(){  play();}
}

class Evlet8 extends Baba8{
    private int i=   5 ;
}