package Ex2;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CloneTest {
    public static void main(String[] args){
        int[][] arr1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] arr2 = arr1.clone();
        arr2[0][0] = 100;
        System.out.println(arr1[0][0]);
        System.out.println(arr2[0][0]);
    }
}
