package learnings.java8;

public interface defaultStaticMethod {
    String getName(String name);

    default String defaultMethod() {
        return "default";
    }

    static String staticMethod() {
        return "static";
    }

}
