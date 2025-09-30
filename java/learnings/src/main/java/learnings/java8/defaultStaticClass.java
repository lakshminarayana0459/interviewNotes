package learnings.java8;

public class defaultStaticClass implements defaultStaticMethod {

    @Override
    public String getName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String... args) {

        System.out.print("Default sttaic method");

        System.out.print("Default sttaic method" + defaultStaticMethod.staticMethod());
    }

}
