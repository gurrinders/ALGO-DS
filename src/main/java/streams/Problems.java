package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problems {
    public static void main(String[] args) {
        //1.Avg
        System.out.println("");
        List< Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        System.out.println("List of numbers: " + nums);
        Double avg = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Avg:" + avg);

        //2.CAPS
        System.out.println("");
        List<String> chars = Arrays.asList("a","b","c");
        System.out.println("Before - List of Char: " + chars);
        chars = chars.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("After - List of Char: " + chars);

        //3.Sum of all even, odd numbers
        System.out.println("");
        List< Integer > nums2 = Arrays.asList(1, 3, 6, 8, 10, 18, 21);
        System.out.println("List of numbers: " + nums2);
        int sumEven = nums2.stream()
                        .filter(num ->  num%2 == 0)
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println("Sum of Evens: " + sumEven);

        int sumOdd = nums2.stream()
                .filter(num -> num%2==1)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Odds: " + sumOdd);

        //4. Remove Duplicates
        List <Integer> nums3 = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original List of numbers: " + nums3);

        nums3 = nums3.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct list of numbers: " + nums3);

        //5. Count String
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original list of strings (colors): " + colors);
        char startingLetter = 'B';
        long count = colors.stream().filter( word -> word.startsWith(String.valueOf(startingLetter))).count();
        System.out.println("Count:" + count);

    }
}
