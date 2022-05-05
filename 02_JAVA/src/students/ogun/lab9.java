package study;

import java.util.ArrayList;
import java.util.List;

public class lab9 {

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Amed");
        list.add("hello");
        list.add("Eric");
        list.add("mike");
        System.out.println(list);
        list.remove("hello");

        System.out.println(list);

    }

}
