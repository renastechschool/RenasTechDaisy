package code.day31CollectionsList;

import java.util.ArrayList;

public class C7ForEachLoop {

    public static void main(String[] args) {
        /*
        add
        get
        size
         */

        /*ArrayList<Integer> al = new ArrayList<>() ;
        al.add(10) ;    al.add(20);  al.add(30) ;
        al.add(40) ;
        al.add(null) ; al.add(40);
        System.out.println(al);
        System.out.println("\nUsing for each loop");
        for(  Integer i  :  al     ){

            System.out.println(i);
        }
    */



        ArrayList<Dog> dogs = new ArrayList<>() ;
        dogs.add( new Dog("Tommy", 2)) ;
        dogs.add(new Dog("Pluto", 1)) ;
        dogs.add(new Dog("Scooby", 1 )) ;
        System.out.println(dogs);

        System.out.println("Using for loop");
        for(int i=0; i<dogs.size(); i++){
            System.out.println(dogs.get(i));
        }



        //For Each loop OR Enhanced For Loop
        System.out.println("\nUsing for each loop");
        for( Dog d  :  dogs  ){
            System.out.println(d);
        }


    }
}

class Dog{
    String name ;
    int age ;
    Dog(String name, int age){this.name=name ; this.age=age ; }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
