package students.serkan.Lab;

import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args) {
                int[] i={6,150,298,-78,-85,656};
                System.out.println(maxValueOfArray(i));

            }
            public static int maxValueOfArray(int[] arr){
                Arrays.sort(arr);
                return arr[arr.length-1];
            }

            }

