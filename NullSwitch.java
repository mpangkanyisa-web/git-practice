public class NullSwitch {
    public static void main (String [] args){
        var x = switch(null) {
            case null -> null;
            case String s when s.equals("") -> "";
            default -> 3;
        }

    }
}
