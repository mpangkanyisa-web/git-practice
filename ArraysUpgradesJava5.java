public class ArraysUpgradesJava5 {
    int[] numbers = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args){
        
        ArraysUpgradesJava5 au = new ArraysUpgradesJava5();
        au.printFirstAndLast();
        }

        
    
      public void printFirstAndLast() {
            System.out.println("First Digit: "+ numbers[0]);
            System.out.println("Last digit: " + numbers[numbers.length - 1]);
            }
    
    
    //print first and last digit list.getFirst();
        // list.getLast(); insted of list.length - 1;
        


        // public void printFirstAndLast() {
        //     System.out.println(numbers.getFirst());
        //     System.out.println(numbers.getLast());
        //     }
    }

