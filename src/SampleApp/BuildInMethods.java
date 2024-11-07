package SampleApp;
import java.sql.SQLOutput;
import java.util.Scanner;
public class BuildInMethods {

    public static void main(String[] args) {
        String s1 = "Learning Java";
        String s2 = "Basics";

        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println("S1 length is" + s1.length());
        System.out.println("Upper case to S1 is " + s1.toUpperCase());
        System.out.println("Index is " + s1.indexOf("e"));
        System.out.println("char length" + s1.charAt(5));
        System.out.println("compare " +s1.equals("Python"));
        System.out.println("remove white space from both ends" +s1.trim());
    }
}
