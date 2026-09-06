import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Employee(String name, String department){}

public class CollectorsGroupBy {
    public static void main(String[] args) {
        List<Employee> staff = List.of(
            new Employee ("Alice", "HR"), 
            new Employee("Bob", "IT"),
            new Employee("Charlie", "IT")
        );

        //Grouping by Department

        Map<String, List<Employee>> byDept = staff.stream().collect(Collectors.groupingBy(Employee::department));

         System.out.println (byDept);


        // Printing the threads at work for parllelStream
        // staff.parallelStream().forEach(stf ->
        //     System.out.println(Thread.currentThread().getName() + " processed: " + stf)
        // );
        

    }
}
