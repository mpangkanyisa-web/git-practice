import java.util.Arrays;

public class IncrementExercise {
    public static void main(String[] args){
        int i = 0;
        int [] ia = new int[]{0,1,2,3};
        ia[i++] += ia[i];
        System.out.println(Arrays.toString(ia));
    }
}
