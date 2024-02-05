import java.util.*;

// A METHOD
// Asking the user the LENGTH password
// You can implement to Email.java if you want

public class AskingLength {
    public static void main(String[] args){
        System.out.println("Thse length of password: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.close();
        System.out.println(length);
    }
}
