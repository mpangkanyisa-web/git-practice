
import java.util.List;
import java.util.stream.Collectors;

public class CollectReduction {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        List<Integer> evenNumbers = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.err.println(evenNumbers);
    }
}
