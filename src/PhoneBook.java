import java.util.*;

class PhoneBook{
    public static void main(String[] args) {
            //number of entries
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();

            HashMap<String,Integer> phoneBook = new HashMap<>();

            // Fill phonebook
            for (int i = 0; i < n ; i++)
            {
                String name = sc.nextLine();
                int phone = sc.nextInt();
                phoneBook.put(name, phone);
                sc.nextLine();
            }
            while (sc.hasNext())
            {
                String contact = sc.nextLine();

                if (phoneBook.containsKey(contact)) {
                    System.out.println(contact + ": " + phoneBook.get(contact));
                } else {
                    System.out.println("Not found");
                }
            }
        }
}