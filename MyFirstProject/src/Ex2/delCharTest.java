package Ex2;

public class delCharTest {
    static String format(String str, int size, int align){
        if(str == null)
            return str;
        if(str.length() > size)
            return str.substring(0, size);
        StringBuffer sb = new StringBuffer(size);
        int startIdx = 0;
        for(int i=0; i<sb.capacity(); i++){
            sb.append(" ");
        }
        switch(align){
            case 0:
                break;
            case 1:
                startIdx = (size-str.length())/2;
                break;
            case 2:
                startIdx = size - str.length();
        }
        sb.replace(startIdx, startIdx+str.length(), str);
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "가나다";
        System.out.println(format(str,7,0));
        System.out.println(format(str,7,1));
        System.out.println(format(str,7,2));
    }
}
