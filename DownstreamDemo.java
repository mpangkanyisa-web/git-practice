import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownstreamDemo {
    public static void main(String[] args) {
        List<Employee> staff = List.of(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 80000),
            new Employee("Charlie", "IT", 90000)
        );

        Map<String, Integer> totalSalaryByDept = staff.stream()
            .collect(Collectors.groupingBy(
                Employee::department,                  // The Category Label
                Collectors.summingInt(Employee::salary) // The Downstream Action
            ));

        System.out.println(totalSalaryByDept);
    }
}
