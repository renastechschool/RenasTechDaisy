package students.Yasemin;

import java.util.*;

public class Lab17 {
    public static void main(String[] args) {


        HashSet<Integer> hs= new HashSet<Integer>();
        hs.add(2);hs.add(21);hs.add(45);hs.add(15);
        for( int e: hs){
            System.out.println(e);}


        Set<String> hs2= new HashSet<String>(); hs2.add("hi");hs2.add("hello");hs2.add("slaw");
        Set<String> tst= new TreeSet<>(hs2);
        System.out.println(tst);

        Queue<String> q= new PriorityQueue<>();q.add("apple");q.add("kivi");q.add("orange");
        System.out.println(q);
        System.out.println(q.peek());q.remove();
        System.out.println(q);


        Map<String,Integer>m=new HashMap<>();
        m.put("Sara",34);m.put("Mihrican",36);m.put("Yasemin",39);

        Set<String> keys = m.keySet();
        for(String k:keys)
            System.out.println(k);

        Collection<Integer> values =  m.values() ;
        for(  Integer v :  values){
            System.out.println(v);


        }
    }
}


