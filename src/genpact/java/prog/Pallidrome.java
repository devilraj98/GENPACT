package genpact.java.prog;

public class Pallidrome {

    private static void pallidrome(String str) {
        int i = 0;
        int j= str.length()-1;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("not a pallindrome");
                return;
            }
            else
            {
                i++;
                j--;
            }
        }
        System.out.println("yes its a pallidrome");

    }

    public static void main(String[] args) {
        String str = "abcba";

        pallidrome(str);
    }


}
