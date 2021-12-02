package genpact.java.prog;

public class PrimeNo {

    public static void PrimeNo(int n ){

        int temp = 0;
        if(n==0 || n==1){
            System.out.println("not a prime no");
        }
        for(int i = 2;i<n-1;i++){
            if(n % i == 0){
                temp++;
            }
        }
        if(temp>0){
            System.out.println("its a not a prime no");
        }
        else {
            System.out.println("Its a prime no");
        }
    }

    public static void main(String[] args) {

        int no = 7;
         PrimeNo(no);
    }
}
