package students.Yasemin;

import java.util.ArrayList;
import java.util.Collections;

public class Labs10 {
    public static void main(String args[])
    {


        ArrayList<String>
                list = new ArrayList<String>();
        list.add("Java");
        list.add("For");
        list.add("ForJava");
        list.add("JavaForJava");
        list.add("A software language");
        System.out.println("Unsorted ArrayList: "
                + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList "
                + "in Descending order : "
                + list);
    }
}
