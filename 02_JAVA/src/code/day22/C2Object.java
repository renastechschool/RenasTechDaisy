package code.day22;
/*
Write a Java class Book with following features:
Instance variables :
title for the title of book of type String.
author for the author’s name of type String.
price for the book price of type double.
Constructor:
public Book (String title, Author name, double price): A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
Instance methods:
public void setTitle(String title): Used to set the title of book.
public void setAuthor(String author): Used to set the name of author of book.
public void setPrice(double price): Used to set the price of book.
public double getTitle(): This method returns the title of book.
public double getAuthor(): This method returns the author’s name of book.
public String toString(): This method printed out book’s details to the screen
 */
public class C2Object {

    public static void main(String[] args) {

        Book b1 = new Book() ;
        //System.out.println(b1.title);
        //System.out.println(b1.price);
        b1.setPrice(5);
        b1.setTitle("Mahabhatara");
        System.out.println(b1.getTitle());
        System.out.println(b1.getPrice());

        Book b2 = new Book() ;
        System.out.println(b2.getTitle());
        System.out.println(b2.getPrice());
        b2.setTitle("Ramayana");

        Book b3 = new Book() ;
        System.out.println(b3.getTitle());
        System.out.println(b3.getPrice());


        System.out.println(b2.getTitle());
    }

}


class Book{
    //Object Oriented approach says the instance variables should be accessed
    //via functionalities.
    // To achieve this make the variables private and
    // methods public to achieve Encapsulation
    private String title ;
    private double price;
    public String getTitle(){return this.title;}
    public double getPrice(){return this.price;}

    public void setPrice(double price) { this.price = price; }
    public void setTitle(String title) {   this.title = title; }


    //CONSTRUCTOR
    //a constructor is a special method in a class with no return type.
    //It's name is same as the name of the class.
    //A constructor is always called whenever an object is created using new operator
    Book(){}
}

class Club{
    String name = "Chelsea";
}
