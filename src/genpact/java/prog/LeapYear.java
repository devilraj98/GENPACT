package genpact.java.prog;

public class LeapYear {

    private static boolean leapYear(int year) {

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int year = 2020;
        System.out.println(leapYear(year));
    }


}
