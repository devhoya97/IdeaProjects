package CH11;
import java.util.*;
public class ArrayListEx2 {
    public static void main(String[] args){
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        ArrayList list = new ArrayList(source.length()/LIMIT + 1);
        for(int i=0; i<source.length(); i+= LIMIT){
            if(i+LIMIT < source.length())
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i, source.length()));
        }
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
