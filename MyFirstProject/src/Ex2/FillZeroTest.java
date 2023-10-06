package Ex2;

public class FillZeroTest {
    public static String fillZero(String src, int length){
        if(src == null || src.equals("") || length < 0)
            return "";
        if (src.length() > length){
            return src.substring(0, length);
        }
        else if(src.length() < length){
            String zeros = "";
            for(int i=src.length(); i<length; i++){
                zeros += "0";
            }
            return zeros+src;
        }
        else{
            return src;
        }
    }
    public static void main(String[] args){
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
