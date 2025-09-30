package learnings.java8.singleton;

// Test Class
public class SingleTon {
    public static void main(String[] args) {
        DataBaseConnection logger1 = DataBaseConnection.getInstance();
        DataBaseConnection logger2 = DataBaseConnection.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        // Both variables point to the SAME instance
        System.out.println(logger1 == logger2); // true
    }
}
