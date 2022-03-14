package code.day22;

public class C3Constructor {

    /*
     CONSTRUCTOR
     -  a constructor is a special method in a class
            with no return type.
     -  It's name is same as the name of the class.
     -  A constructor is always called whenever an
             object is created using new operator
     */
    public static void main(String[] args) {
        new Movie();//anonymous movie object i.e. reference variable is not declared
        new Movie();

        Movie m1 = new Movie("Titanic" , 1997);
        m1.watchMovie();
        System.out.println("");
    }

    void play() {
        System.out.println("playing");
    }
}

class Movie{
    private String title;
    private String actor;
    private int year;

    void watchMovie(){  System.out.println("watching " + this.title + "...."); }

    /* Default constructor created by the JVM
    public Movie(){}
     */
    Movie(){}

    Movie(String title, int year){
        this.title = title; this.year = year ;
        System.out.println("Constructor is called");
    }

}
