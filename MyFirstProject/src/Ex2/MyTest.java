package Ex2;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Random;
import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(13);
        for(int i=0; i<8; i++){
            sb.append(getRand(0,9));
        }
        sb.insert(4,"-");
        sb.insert(0,"010-");
        System.out.println(sb);

        int[] callNum = fillRand(new int[8], new int[]{7,8,9});
        StringBuffer sb2 = new StringBuffer(Arrays.toString(callNum));
        sb2.deleteCharAt(0);
        sb2.deleteCharAt(sb2.length()-1);
        while(sb2.indexOf(" ") != -1)
            sb2.deleteCharAt(sb2.indexOf(" "));
        while(sb2.indexOf(",") != -1)
            sb2.deleteCharAt(sb2.indexOf(","));
        sb2.insert(4, "-");
        System.out.println("010-"+sb2);
    }
    static int[] fillRand(int[] arr, int[] src){
        for(int i=0; i<arr.length; i++){
            int randNum = (int)(Math.random()*src.length);
            arr[i] = src[randNum];
        }
        return arr;
    }
    static int getRand(int from, int to){
        Random rand = new Random();
        int randNum = rand.nextInt(Math.abs(from-to)+1) + Math.min(from,to);
        return randNum;
    }
}
