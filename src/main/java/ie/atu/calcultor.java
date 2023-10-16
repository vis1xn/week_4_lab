package ie.atu;

import java.util.Scanner;

public class calcultor {

    public static void main(String[] args) {
        add();

    }


    public static void add()
    {
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter you second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }
}
