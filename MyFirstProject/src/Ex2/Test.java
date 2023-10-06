package Ex2;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.*;

public class Test {
    public static void main(String[] args){
        String[] strArr = {"asfas", "bdsfds", "fa32@"};
        Pattern p = Pattern.compile("[^a].*");
        for(String str : strArr){
            Matcher m = p.matcher(str);
            if(m.matches())
                System.out.println(str);
        }
    }
}
