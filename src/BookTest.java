import java.util.*;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class BookTest{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();

        MyBook book = new MyBook();
        book.setTitle(title);

        System.out.println("The title is: " + book.getTitle());
        in.close();

    }
}
