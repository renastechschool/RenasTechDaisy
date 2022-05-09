package students.Okan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lab10 {
    //    Write a method that can sort the ArrayList
    // in descending order without using the sort method
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        int tempI=0,tempJ=0,temp;
        Collections.addAll(numbers,5,23,11,9,-4,31,62);
        for (int i=0;i<numbers.size();i++){
            for(int j=i;j<numbers.size();j++){
                if(numbers.get(i)<numbers.get(j))
                {
                    tempI=numbers.get(i);
                    tempJ=numbers.get(j);
                    temp=tempI;
                    tempI=tempJ;
                    tempJ=temp;
                    numbers.set(i,tempI);
                    numbers.set(j,tempJ);
                }
            }
            }
        for (int k:numbers){
            System.out.print(k+"  ");
        }
    }
}
