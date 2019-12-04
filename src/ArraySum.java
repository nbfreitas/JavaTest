import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        int size, sum = 0;

        //array size
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        sc.nextLine();

        int values[] = new int[size];

        for (int i = 0; i < size ; i++)
        {
            values[i] = sc.nextInt();
            sum = sum + values[i];
        }
        System.out.println(sum);
    }
}
