import java.util.*;

interface Food {
    public String getType();
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equals("pizza")) {
            return new Pizza();
        } else if (order.equals("cake")) {
            return new Cake();
        } else {
            return null;
        }
    }
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

public class FactoryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned " + food.getClass());

        System.out.println(food.getType());
    }
}