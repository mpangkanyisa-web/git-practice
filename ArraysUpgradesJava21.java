import java.util.List;

public class ArraysUpgradesJava21 {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    public static void main(String[] args){
        ArraysUpgradesJava21 au21 = new ArraysUpgradesJava21();
        au21.printFirstAndLast21();
    }
        

// List has contains() and size(), getFirst() and getLast();
    public void printFirstAndLast21() {
        IO.println(numbers.getFirst());
        IO.println(numbers.getLast());
        
        if (numbers.contains(3)){
            IO.println("Congratulations");
            }
        IO.println(numbers.size());    

        }

}
