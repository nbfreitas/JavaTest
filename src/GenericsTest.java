public class GenericsTest {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Nicolas", "Freitas" };

        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}

class Printer {
    public void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}