import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record DownstreamEmployee(String name, String department, int salary) {}

public class DownstreamDemo {
    public static void main(String[] args) {
        List<DownstreamEmployee> staff = List.of(
            new DownstreamEmployee("Alice", "HR", 50000),
            new DownstreamEmployee("Bob", "IT", 80000),
            new DownstreamEmployee("Charlie", "IT", 90000)
        );

        Map<String, Integer> totalSalaryByDept = staff.stream()
            .collect(Collectors.groupingBy(
                DownstreamEmployee::department,                  // The Category Label
                Collectors.summingInt(DownstreamEmployee::salary) // The Downstream Action
            ));

        System.out.println(totalSalaryByDept);
    }
}
