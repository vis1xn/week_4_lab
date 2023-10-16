package ie.atu;

import java.util.Scanner;

public class calcultor {

    public static void main(String[] args) {
        System.out.println("Addition");
        add();
        System.out.println("Multiplication");
        delete();
        System.out.println("Subtraction");
        delete2();
        System.out.println("Divition");
        delete3();

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

    public static void delete()
    {
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter you second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }

    public static void delete2()
    {
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter you second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }

    public static void delete3()
    {
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter you second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total is " + total);
    }
}
