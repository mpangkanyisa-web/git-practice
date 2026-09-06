import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Student(String name, int score) {}

public class PartitioningDemo {
    public static void main(String[] args) {
        List<Student> classroom = List.of(
            new Student("David", 85),
            new Student("Emma", 42),
            new Student("Fred", 76)
        );

        // Partitioning by pass/fail threshold
        Map<Boolean, List<Student>> passedOrFailed = classroom.stream()
            .collect(Collectors.partitioningBy(student -> student.score() >= 50));

        System.out.println(passedOrFailed);
    }
}
