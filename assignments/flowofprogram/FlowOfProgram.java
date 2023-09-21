package flowofprogram;

public class FlowOfProgram {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(100));
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
}
