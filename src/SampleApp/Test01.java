package SampleApp;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number>6){
            System.out.println("You won the game");
        }
        else {
            System.out.println("You lost the game");
        }
    }

}
