package code.day25;
public class C7Inheritance {
    public static void main(String[] args) {
        Evlat3 e = new Evlat3() ;
        System.out.println(e.m);
        System.out.println(e.j);
        //System.out.println(e.i);  error: i has a private acces in its class
        System.out.println(e.getI());
        System.out.println(e.getK());
    }
}

class Dede3{
    private int i = 5 ;
    int getI(){  return i ; }
    int j = 20 ;
}

class Baba3 extends Dede3{
    private int k = 30 ;
    public int getK(){  return k ; }
}

class Evlat3 extends Baba3{
    int m = 40;
}