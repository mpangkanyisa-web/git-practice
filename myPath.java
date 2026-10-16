import java.nio.file.*;


public class myPath {
 
    public static void main(String[] args) {

// Path p1 = Path.of("C:/Users/mpang/git-practice-1");
Path p2 = Path.of("/var/./log/../etc/passwd");

System.out.println(p2.normalize());
System.out.println(p2.getRoot());

 }
}
    

    

