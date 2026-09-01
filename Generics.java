public class Generics {
    List l = new ArrayList <String> ();
    l.add(LocalDate.now());
    List<String> ls = l;
    String s = ls.get(0);

}
