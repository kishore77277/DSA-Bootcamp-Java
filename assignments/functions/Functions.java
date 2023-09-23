package functions;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        System.out.println(getGrade(101));
        System.out.println(getGrade(97));
        System.out.println(getGrade(85));
        System.out.println(getGrade(85));
    }

    // 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    public static void printMaxAndMinAmongThree() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }

    // 2. Define a program to find out whether a given number is even or odd.
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }

    // 4. Write a program to print the sum of two numbers entered by user by defining your own method.
    public static int sumOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a + b;
    }

    // 5. Define a method that returns the product of two numbers entered by user.
    public static int productOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a * b;
    }

    // 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public static void printCircumferenceAndAreaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area : " + area);
        System.out.println("Circumference : " + circumference);
    }

    // 7. Define a method to find out if a number is prime or not.
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8 marks question
    public static String getGrade(int marks) {
        if (marks > 100) {
            return "Invalid Marks, please check";
        }
        if (marks >= 91) {
            return "AA";
        }
        if (marks >= 81) {
            return "AB";
        }
        if (marks >= 71) {
            return "BB";
        }
        if (marks >= 61) {
            return "BC";
        }
        if (marks >= 51) {
            return "CD";
        }
        if (marks >= 41) {
            return "DD";
        }
        return "Fail";
    }
}
