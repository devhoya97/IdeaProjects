package Ex2;

public class ContainsTest {
    static boolean contains(String src, String target){
        if(src == null || target == null){
            return false;
        }
        char[] srcArr = src.toCharArray();
        char[] targetArr = target.toCharArray();
        for(int i=0; i<srcArr.length; i++){
            if(srcArr[i] == targetArr[0]){
                System.arraycopy(srcArr,i,targetArr,0,targetArr.length);
                if(target.equals(new String(targetArr)))
                    return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
