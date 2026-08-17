import java.util.List;

public class ArraysUpgradesJava21 {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    public static void main(String[] args){
        ArraysUpgradesJava21 au21 = new ArraysUpgradesJava21();
        au21.printFirstAndLast21();
    }
        

// List has contains() and size(), getFirst() and getLast(); removeFirst(); removeLast();

    public void printFirstAndLast21() {
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        
        if (numbers.contains(3)){
            System.out.println("Congratulations");
            }
        System.out.println(numbers.size());    

        }

}
