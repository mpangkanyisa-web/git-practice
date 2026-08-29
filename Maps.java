import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> names = Map.of("Fred", 5, "Sheila", 5);
        for(String f : names.keySet()){
            System.out.println(f);
        }
        for(int n : names.values()){
            System.out.println(n);

            System.out.println(names);
        }
    }
}
