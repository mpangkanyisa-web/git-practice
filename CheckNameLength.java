public class CheckNameLength {
    public static void main(String[] args) {//for java 21 there are no wrappers needed, you can write void main() {...},  No public, static, or String[] args needed!
 
        String name = "Kanyisa";
        String studentsNames = """
                Willow
                Zillo
                Millo
                """;
        
        
        if (name.isBlank()){
            System.out.println("empty");
        }
        else{
            System.out.println((name + "\n").repeat(3)); /// or use triple quotes instead of "/n", tomake it more cleaner.
            System.out.println("Name Length is : " + name.length());
            System.out.println(studentsNames);//or you can put the tripple quotes here.

        }
    }
    
}
