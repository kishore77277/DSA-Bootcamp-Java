package firstjava;

import java.util.Scanner;

public class FirstJava {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println(findSimpleInterest(4000, 2, 7));
//
//        System.out.println(findNthFobNumber(3));

//        for (int i = 0; i <= 10; i++) {
//            System.out.print(findNthFobNumber(i) + " ");
//        }

        printArmstrongNumbersInRange(1, 2000);
    }

    // 1
    public static void evenOrOddNumber(int n) {
        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    // 2
    public static void printGreetings(String name) {
        System.out.println("Greetings! " + name);
    }

    // 3
    public static int findSimpleInterest(int p, int t, int r) {
        return p * t * r / 100;
    }

    // 4
    public static void calculator() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();
        if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("_")) {
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            if (b == 0) {
                System.out.println("denominator can not be 0");
            } else {
                System.out.println(a / b);
            }
        }
    }

    // 5
    public static int largestOfTwoNumbers(int a, int b) {
        return Math.max(a, b);
    }

    // 6
    // present 1 dollar = 83 rupees
    public static int rupeesToUSD(int rupees) {
        return rupees / 83;
    }

    // 7
    public static int findNthFobNumber(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        int count = 1;
        while (count < n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        return b;
    }

    // 8
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isArmstrongNumber(int n) {
        int digitCount = (int) Math.log10(n) + 1;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum = sum + (int) Math.pow(temp % 10, digitCount);
            temp = temp / 10;
        }
        return n == sum;
    }

    // 9
    public static void printArmstrongNumbersInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isArmstrongNumber(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
