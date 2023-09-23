package conditionalsloops;

import java.util.Scanner;

public class ConditionalsLoops {

    public static void main(String[] args) {

//        System.out.println(findAreaOfCircle(54.23));

//        System.out.println(findAreaOfTriangle(12.2, 24.23));
//
//        printFibSeries(6);
//        System.out.println();
//        System.out.println(findNthFibNumber(5));

//        printFactors(36);

//        System.out.println(printSumOfNumbersUntilUserEntersZero());

//        System.out.println(printLargestOfNumbersUntilUserEntersZero());

//        System.out.println(factorial(10));

//        System.out.println(calculateDiscount(2000, 9));

//        System.out.println(distanceBetweenTwoPoints(1, 1, -4, -15));

        System.out.println(power(2, 10));


    }


    // 1. Area Of Circle Java Program
    public static double findAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 2. Area Of Triangle
    public static double findAreaOfTriangle(double base, double height) {
        return base * height / 2;
    }

    // 3. Area Of Rectangle Program
    public static double findAreaOfRectangle(double length, double width) {
        return length * width;
    }

    // 21. Fibonacci Series In Java Programs
    // count starting from 0
    public static void printFibSeries(int n) {
        int a = 0;
        int b = 1;
        int count = 1;
        while (count <= n) {
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
    }

    // mine
    public static int findNthFibNumber(int n) {
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

    // 22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
    // leetcode 1281
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }
        return product - sum;
    }

    // 23. Input a number and print all the factors of that number (use loops).
    public static void printFactors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                // for perfect squares
                // not printing a same factor twice
                // ex: 36
                // 6 * 6
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }

    // 24. Take integer inputs till the user enters 0 and print the sum of all numbers
    //(HINT: while loop)
    public static int printSumOfNumbersUntilUserEntersZero() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            n = scanner.nextInt();
            sum = sum + n;
        } while (n != 0);
        return sum;
    }

    // 25. Take integer inputs till the user enters 0 and print the largest number from
    //all.
    public static int printLargestOfNumbersUntilUserEntersZero() {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int n;
        do {
            n = scanner.nextInt();
            largest = Math.max(largest, n);
        } while (n != 0);
        return largest;
    }

    // 26. Addition Of Two Numbers
    public static int addTwoNumber(int a, int b) {
        return a + b;
    }

    // INTERMEDIATE
    // 1. Factorial Program In Java
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // 2. Calculate Electricity Bill
    public static int calculateElectricityBill(int units, int unitCost, int minimumBill) {
        return unitCost * units + minimumBill;
    }

    // 3. Calculate Average Of N Numbers
    public static double avg(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return (double) sum / nums.length;
    }

    // 4. Calculate Discount Of Product
    public static double calculateDiscount(int price, int discountPercetange) {
        return (double) price * discountPercetange / 100;
    }

    // 5. Calculate Distance Between Two Points
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    // 6. Calculate Commission Percentage
    public static double calculateCommission(int total, int commissionRate) {
        return total * commissionRate / (double) 100;
    }

    // 7. Power In Java
    public static double power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        double answer = base;
        for (int i = 2; i <= power; i++) {
            answer = answer * base;
        }
        return answer;
    }

    // 8. Calculate Depreciation of Value
    // TODO : continue from here

}
