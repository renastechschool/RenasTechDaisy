package students.Yasemin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Labs09 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "hello", "Eric", "mike"));

        names.removeAll(Arrays.asList("Ahmed"));


        System.out.println(names);


    }
}
