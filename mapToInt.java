import java.util.stream.Stream;

public class mapToInt {
    public static void main(String[] args) {
        Stream.of("Fred", "Jim", "Sheila")
            .flatMapToInt(String::chars)
            .mapToObj(c -> (char) c) 
            .forEach(System.out::println);
    }
}