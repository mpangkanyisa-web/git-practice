import java.nio.file.*;


public class myPath {
 
    public static void main(String[] args) {

Path p2 = Path.of("C:/Users/mpang/git-practice-1");
// Path p2 = Path.of("C:/var/./log/../etc/passwd");


System.out.println("--- NIO Path Output ---");

System.out.println(p2.normalize());
System.out.println(p2.getRoot());
System.out.println(p2.getFileName());
System.out.println(p2.getNameCount());
System.out.println(p2.getName(3));
System.out.println(p2.subpath(2,3));

}
}
    

    

