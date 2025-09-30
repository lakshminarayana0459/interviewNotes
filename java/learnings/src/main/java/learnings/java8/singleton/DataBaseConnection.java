package learnings.java8.singleton;

public class DataBaseConnection {

    /*
     * Creating a Singleton Class in Java To create a singleton class, we must
     * follow the steps, given below: a. First, we create the private
     * constructor of the singleton class which prevent from the direct
     * instantiation.
     * 
     * b. Then create the static method also called as getInstance() method
     * which return the single instance of the class. This ensure that the only
     * one object is created using lazy intialization
     * 
     * c.Store the instance in the private static variable which make sure that
     * the only single instance is created.
     */

    // C. Stores the instance in private static variable
    private static DataBaseConnection conenction = new DataBaseConnection();

    // a. Create a private constructor;

    private DataBaseConnection() {
        System.out.println("constructor");
    }

    // b.provide a public method for the instance
    // the static method also called as getInstance()

    public static DataBaseConnection getInstance() {
        return conenction;
    }

    // Example method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

}
