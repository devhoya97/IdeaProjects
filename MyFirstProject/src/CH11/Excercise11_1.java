package CH11;

import java.util.ArrayList;

public class Excercise11_1 {
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();
        ArrayList cha = new ArrayList();
        ArrayList hap = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        kyo = (ArrayList) list1.clone();
        kyo.retainAll(list2);
        cha = (ArrayList) list1.clone();
        cha.removeAll(list2);
        hap = (ArrayList) list1.clone();

        for (int i=0; i<list2.size(); i++){
            Object MemberOfList2 = list2.get(i);
            if (!list1.contains(MemberOfList2))
                hap.add(MemberOfList2);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(kyo);
        System.out.println(cha);
        System.out.println(hap);

    }
}
