package Ex2;

public class CountTest {
    public static int count(String src, String target){
        int count = 0;
        int pos = 0;
        while (true){
            pos = src.indexOf(target, pos);
            if(pos != -1){
                count++;
                pos += target.length();
                continue;
            }
            break;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
}
