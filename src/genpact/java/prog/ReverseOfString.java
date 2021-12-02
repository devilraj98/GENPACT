package genpact.java.prog;

public class ReverseOfString {

    public static void main(String[] args) {

        String str = "NEERAJRAJ";
        char []ch  = str.toCharArray();


        for (int i =ch.length-1 ;i>=0; i--) {

            System.out.print(ch[i]);

        }
    }
}
