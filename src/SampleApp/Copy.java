package SampleApp;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int arr2[] = {2,3,4,5,6,};

        if(Arrays.equals(arr, arr2)){
            System.out.println("Arrays are equal");
        }
        else System.out.println("Not Equal");

        //System.out.println("Length is: "+arr.length);
        //System.out.println("Sorted Array ");
}}

