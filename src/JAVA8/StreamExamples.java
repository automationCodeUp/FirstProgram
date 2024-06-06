package JAVA8;
import java.util.Arrays;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
      System.out.println(numbers.stream().reduce(0, Integer::sum));
    }
}
