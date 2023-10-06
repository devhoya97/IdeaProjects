package UTC;
import java.util.*;
public class VerySmallTest {
    public static void main(String[] args){
        String user = "mrko";
        List<List<String>> friends = List.of(
                List.of("donut", "andole"),
                List.of("donut", "jun"),
                List.of("donut", "mrko"),
                List.of("shakevan", "andole"),
                List.of("shakevan", "jun"),
                List.of("shakevan", "mrko")
        );
        LinkedList<List<String>> friendsLinkedList = new LinkedList<>(friends);
        System.out.println(friendsLinkedList);
        for (int i=0; i<friendsLinkedList.size(); i++) {
            List<String> friendAB = friendsLinkedList.get(i);
            if (friendAB.indexOf(user) == 0) {
//                    friendsSet.add(friendAB.get(1));
            }
            else {
//                    friendsSet.add(friendAB.get(0));
            }
            friendsLinkedList.remove(friendAB);
        }

        System.out.println(friendsLinkedList);
//        List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
//        List<String> result = List.of("andole", "jun", "bedi");
    }
}
