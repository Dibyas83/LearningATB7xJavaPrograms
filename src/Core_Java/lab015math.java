package Core_Java;
import  java.lang.Math;
import java.util.*;

public class lab015math {
    public static int findMaxIterative(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty.");
        }

        int max = numbers.get(0); // Initialize max with the first element
        for (int i = 1; i < numbers.size(); i++) {
            max = Math.max(max, numbers.get(i)); // Compare current max with next element
        }
        return max;
    }
    public static Optional<Integer> findMaxStream(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty(); // Return empty Optional for empty or null lists
        }
        // Use reduce with Math::max to find the maximum
        return numbers.stream().reduce(Math::max);
    }
    public static int findMaxCollections(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty.");
        }
        return Collections.max(numbers);
    }




    public static void main(String[] args) {
        double a = Math.sqrt(2);
        // Using Arrays.asList()
        List<String> colors = Arrays.asList("Red", "Green", "Blue");
        ;
        // Using List.of()
        List<String> languages = List.of("Java", "Python", "C++");
        // Using Arrays.asList()
        List<Integer> initialNumbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        // Using List.of() (immutable list, Java 9+)
        List<Integer> immutableNumbers = List.of(4, 5, 6);
        int[] numbers = {45, 12, 98, 33, 27};
        System.out.println(a);
        System.out.println(Math.sqrt(4));

        List<Integer> myNumbers1 = Arrays.asList(10, 5, 20, 15, 25);
        int maximum = findMaxIterative(myNumbers1);
        System.out.println("Maximum value (iterative): " + maximum); // Output: 25

        List<Integer> myNumbers2 = Arrays.asList(10, 5, 20, 15, 25);
        Optional<Integer> maximum2 = findMaxStream(myNumbers2);
        maximum2.ifPresent(maxVal -> System.out.println("Maximum value (stream): " + maxVal)); // Output: 25

        List<Integer> emptyList = Arrays.asList();
        Optional<Integer> emptyMax = findMaxStream(emptyList);
        System.out.println("Maximum value (empty list): " + emptyMax.orElse(-1)); // Output: -1 (or handle as needed)

        List<Integer> myNumbers3 = Arrays.asList(10, 5, 20, 15, 25);
        int maximum3 = findMaxCollections(myNumbers3);
        System.out.println("Maximum value (Collections.max): " + maximum3); // Output: 25


    }
}
