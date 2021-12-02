package genpact.java.prog;

public class totalNoOfChar {

    public static void main(String[] args) {
        String str = "neeraj";

        char[] ch = str.toCharArray();
        int count = 0;
        for(int c : ch){
            count++;

        }
        System.out.println(count);
    }
}
