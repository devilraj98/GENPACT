package genpact.java.prog;

public class starPatter {
    public static void main(String[] args) {

        // patter 1
        for(int i =1;i<=6;i++){

            for (int j = 1; j <=i ; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();


        // pattern 1 reverse

        for(int i =6;i>=1;i--){

            for (int j = 1; j <=i ; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
