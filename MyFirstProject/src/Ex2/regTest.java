package Ex2;
import java.util.regex.*;
public class regTest {
    public static void main(String[] args){
        String[] emailArr = {"diajbh135@naver.com", "sdas12@gmail.com", "dasf#%@kasd.com","dsaf@asf!.com", "123asda@naver.com"};
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z]*.com");
        for(String s : emailArr){
            Matcher m = p.matcher(s);
            if(m.matches())
                System.out.println(s);
        }

    }
}
