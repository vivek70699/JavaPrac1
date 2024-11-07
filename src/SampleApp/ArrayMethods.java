package SampleApp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,5};
        int arr2[] = {1,2,4,7,9};
        Arrays.sort(arr);
        System.out.println("Length of array is "+ arr.length);
        System.out.println("sorting "+ Arrays.toString(arr));

        if (arr.equals(arr2)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
