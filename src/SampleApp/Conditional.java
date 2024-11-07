package SampleApp;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        if (number >6) {
            System.out.println("Number is greater than 6\n");
        }
                else{
                System.out.println("Number is smaller than 6");
            }
            }
}
