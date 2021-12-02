package genpact.java.prog;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int n = 153;
        int x = 0;
        int res=0;
         int temp = n;
        while(n>0){
             x = n % 10;
             n = n/10;
             res = res+(x*x*x);

        }
        if(res == temp){
            System.out.println("yes it is a armstron number");
        }
        else
            System.out.println("not a armstrong number");
    }
}
