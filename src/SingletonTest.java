public class SingletonTest {
    //A public String instance variable named str
    public String str;

    private static SingletonTest singleInstance = new SingletonTest();

    //A private Singleton non parameterized constructor
    private SingletonTest() {

    }

    //A static method named getSingleInstance that returns the single instance of the Singleton class
    public static SingletonTest getSingleInstance() {
        return singleInstance;
    }

}
