package Ex2;
import java.util.ArrayList;
import java.util.*;
import java.util.regex.*;
public class phoneNumExercise {
    public static void main(String[] args){
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };
        ArrayList<String> list = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println(">>");
            String input = s.nextLine().trim();

            if(input.equals("")){
                continue;
            } else if(input.equalsIgnoreCase("Q")){
                System.exit(0);
            }
            Pattern p = Pattern.compile(".*"+input+".*");
            for(String phoneNum : phoneNumArr) {
                Matcher m = p.matcher(phoneNum.replace("-",""));
                if(m.matches())
                    list.add(phoneNum);
            }
            if(list.size() > 0){
                System.out.println(list);
                list.clear();
            }else{
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    }
}
