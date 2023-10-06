package Ex2;

public class getRandEx {

    public static void main(String[] args){
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 " + stringCount(src,"aa")+"개 찾았습니다.");
    }
    static int stringCount(String src, String key){
        return stringCount(src,key,0);
    }
    static int stringCount(String src, String key, int pos){
        StringBuffer sb = new StringBuffer(src);
        int count = 0;
        int index = sb.indexOf(key, pos);
        while(index != -1){
            count++;
            pos = index + key.length();
            index = sb.indexOf(key, pos);
        }
        return count;
    }
}
