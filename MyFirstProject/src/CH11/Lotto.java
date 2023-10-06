package CH11;
import java.util.*;
public class Lotto {
    static HashMap phoneBook = new HashMap();
    public static void main(String[] args){
        addPhoneNo("친구", "이진훈", "010-111-1111");
        addPhoneNo("친구", "조승수", "010-222-2222");
        addPhoneNo("친구", "천진우", "010-333-1111");
        addPhoneNo("회사", "김우일", "010-444-1111");
        addPhoneNo("회사", "김병직", "010-555-1111");
        addPhoneNo("회사", "성낙희", "010-666-1111");
        addPhoneNo("회사", "이재용", "010-777-1111");
        addPhoneNo("예원이", "010-6304-0097");

        printList();
    }
    static void addPhoneNo(String groupName, String name, String phoneNum){
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(phoneNum, name);
    }
    static void addPhoneNo(String name, String phoneNum){
        addPhoneNo("애인", name, phoneNum);
    }
    static void addGroup(String groupName){
        if (!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }
    static void printList(){
        Set s = phoneBook.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            HashMap innerMap = (HashMap)e.getValue();
            System.out.println(" * "+e.getKey()+"["+innerMap.size()+"]");
            Set innerS = innerMap.entrySet();
            Iterator innerIt = innerS.iterator();
            while (innerIt.hasNext()){
                Map.Entry innerE = (Map.Entry) innerIt.next();
                System.out.println(innerE.getKey() + " " + innerE.getValue());
            }
            System.out.println();
        }
    }
}
