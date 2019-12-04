import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        StringBuilder sb = new StringBuilder(text);

        if (text.equals(sb.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
