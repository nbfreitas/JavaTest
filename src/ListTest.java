import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        //number of entries
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Integer> elements = new ArrayList<>();

        //insert values in array
        for(int i = 0; i < size; i++) {
            elements.add(sc.nextInt());
        }

        //number of queries
        int queries = sc.nextInt();

        for(int i = 0; i < queries; i++) {
            String input = sc.next();
            if("Insert".equals(input)) {
                elements.add(sc.nextInt(), sc.nextInt()); //insert value (key, value)
            } else if ("Delete".equals(input)) {
                elements.remove(sc.nextInt());
            }
        }

        for(Integer integer : elements) {
            System.out.print(integer + " ");
        }

    }
}
