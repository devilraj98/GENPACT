package genpact.java.prog;

import java.util.Scanner;

public class Factorial {

    private static int factorial(int number) {

      if(number<=1){
          return 1;
      }
       int res = number * factorial(number-1);
       return  res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scn.nextInt();

        System.out.println("your output will be"+ " "+ factorial(number));
    }


}
