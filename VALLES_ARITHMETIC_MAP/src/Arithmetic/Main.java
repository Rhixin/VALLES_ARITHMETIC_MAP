package Arithmetic;

import java.util.Scanner;

public class Main {
    static Number num1, num2;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose the data type for num1:");
        System.out.println("1 - Integer \n2 - Long \n3 - Float \n4 - Double");
        System.out.print("Enter your choice: ");
        int choice1 = sc.nextInt();

        gettingNum(1, choice1);

        System.out.println("Choose the data type for num2:");
        System.out.println("1 - Integer \n2 - Long \n3 - Float \n4 - Double");
        System.out.print("Enter your choice: ");
        int choice2 = sc.nextInt();

        gettingNum(2, choice2);

        Arithmetic a = new Arithmetic(num1, num2);

        System.out.println("\nResult of Addition: \t\t" + a.add());
        System.out.println("Result of Subtraction: \t\t" + a.subtract());
        System.out.println("Result of Multiplication: \t" + a.multiply());
        System.out.println("Result of Division: \t\t" + a.divide());
        System.out.println("Minimum Value: \t\t\t\t" + a.getMin());
        System.out.println("Maximum Value: \t\t\t\t" + a.getMax());
    }

    public static void gettingNum(int num, int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter an integer for num" + num + ": ");
                if (num == 1) {
                    num1 = sc.nextInt();
                } else {
                    num2 = sc.nextInt();
                }
                break;
            case 2:
                System.out.print("Enter a long integer for num" + num + ": ");
                if (num == 1) {
                    num1 = sc.nextLong();
                } else {
                    num2 = sc.nextLong();
                }
                break;
            case 3:
                System.out.print("Enter a floating-point number for num" + num + ": ");
                if (num == 1) {
                    num1 = sc.nextFloat();
                } else {
                    num2 = sc.nextFloat();
                }
                break;
            case 4:
                System.out.print("Enter a double precision number for num" + num + ": ");
                if (num == 1) {
                    num1 = sc.nextDouble();
                } else {
                    num2 = sc.nextDouble();
                }
                break;
        }
    }
}
