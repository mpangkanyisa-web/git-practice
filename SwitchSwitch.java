public class SwitchSwitch{
    public static void main(String[] args) {
        
    try
    Object s = "Mike";
    String pattenMatching = switch(s){
        case String name when name.equals("Mike")-> System.out.println("Got the name: " + s);
        case String m -> System.out.println("Another name");
        default -> System.out.println("Error");
        };
    }

}
