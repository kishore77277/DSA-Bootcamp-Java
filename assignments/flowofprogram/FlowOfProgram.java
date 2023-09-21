package flowofprogram;

import java.util.Scanner;

public class FlowOfProgram {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(100));

        multiplicationTableOfNumber(9);

        System.out.println(LCM(5, 7));
        System.out.println(LCM(10, 5));

        System.out.println(GCD(5, 7));
        System.out.println(GCD(10, 5));
        System.out.println(GCD(12, 3));

        System.out.println(keepOnTakingNumbersReturnSumUntilEntersX());
    }

    /**
     * if year is divisible by 400 leap year
     * if not then it must be divisible by 4 but not 100
     * @param year year
     * @return true or false
     */
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void multiplicationTableOfNumber(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static int LCM(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }

    public static int GCD(int a, int b) {
        int gcd = Math.min(a, b);
        while (gcd >= 1) {
            if (a % gcd == 0 && b % gcd == 0) {
                return gcd;
            }
            gcd--;
        }
        return gcd;
    }

    public static int keepOnTakingNumbersReturnSumUntilEntersX() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter 'x' to quit, number to add :");
            String num = scanner.next();
            if (num.equalsIgnoreCase("x")) {
                return sum;
            }
            try {
                sum = sum + Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter x to quit, number to add..!!!");
            }

        }
    }
}
