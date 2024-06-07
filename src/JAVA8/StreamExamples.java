package JAVA8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().reduce(0, Integer::sum));
        
        List<String> listofStrings = Arrays.asList("Raja","Sekar","Superb","shahrukh","Fantastic");
        
        List<String> listofFInalstr= listofStrings.stream().filter(name->name.startsWith("s")).map(s->s.toUpperCase()).collect(Collectors.toList());
      
        listofFInalstr.forEach(System.out::println);
    }
}
