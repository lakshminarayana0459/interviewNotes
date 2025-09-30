package learnings.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LamdaExpressions {
    public static String sayHello() {
        return "hello from method reference";
    }

    public static void main(String[] args) {

        // 1️⃣ Normal Lambda (multi-line block)
        Testing test = () -> {
            return "hello";
        };

        System.out.println(test.getName());

        // 2️⃣ Short Lambda (single-line)
        Testing test2 = () -> "hello from short lambda";
        System.out.println(test2.getName()); // Output: hello from short lambda

        // 3️⃣ Using Method Reference

        Testing test3 = LamdaExpressions::sayHello;
        System.out.println(test3.getName());

        // 4 forEach with Parameters
        List<String> names = Arrays.asList("arjun", "bheem", "Krishna");

        // Lambda with parameter
        names.forEach(name -> System.out.println("Hello, " + name));

        // 5 Map (Transforming values)
        // Capitalize first letter using map
        List<String> capitalized = names.stream().map(name -> name.substring(0, 1).toUpperCase())
                .collect(Collectors.toList());

        System.out.println(capitalized);

        // 6 filter (Condition check with parameter)
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        // Filter even numbers
        Optional<Integer> number = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println(number);

        // 7 reduce (Aggregation using multiple parameters)
        List<Integer> addintion = Arrays.asList(1, 2, 3, 4, 5);
        // Sum of all numbers
        int sum = addintion.stream().reduce(0, (a, b) -> a + b); // parameters
                                                                 // a,
                                                                 // b

        System.out.println("Sum = " + sum); // Sum = 15

        // 8 Comparator with Lambdas (very common in interviews)
        List<String> comparaterName = Arrays.asList("Krishna", "Arjun", "Bheem");

        // Sort by length using lambda
        comparaterName.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(names); // [Arjun, Bheem, Krishna]
    }
}
