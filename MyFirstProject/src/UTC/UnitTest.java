package UTC;

import java.util.*;
public class UnitTest {
    static final int RECOMMENDED_NUM = 5;
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
        List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
        List<String> result = List.of("andole", "jun", "bedi");
        System.out.println(solution(user, friends, visitors));
    }
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>(RECOMMENDED_NUM);
        HashMap<String, Integer> visitorsMap = getVisitiorsMap(visitors);
//        HashMap<String, Integer> commonFriendsMap = getCommonFriendsMap(user, friends);
        LinkedList<List<String>> friendsLinkedList = getCommonFriendsMap(user, friends);
//        TreeMap<String, Integer> totalPointMap = getTotalPointMap(visitorsMap, getCommonFriendsMap);
//        for (int i=0; i<RECOMMENDED_NUM; i++) {
//            Map.Entry<String, Integer> entry = totalPointMap.pollLastEntry();
//            if (entry.getValue() > 0)
//                answer.add(entry.getKey());
//        }
        Iterator<List<String>> iterator = friendsLinkedList.iterator();
        while (iterator.hasNext()) {
            List<String> element = iterator.next();
            System.out.println(element);
        }
//        for (Map.Entry<String, Integer> entry : commonFriendsMap.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }

        return answer;
    }
//    public static HashMap<String, Integer> getCommonFriendsMap(String user, List<List<String>> friends) {
    public static LinkedList<List<String>> getCommonFriendsMap(String user, List<List<String>> friends) {
        LinkedList<List<String>> friendsLinkedList = new LinkedList<>(friends);
        HashSet<String> friendsSet = new HashSet<>();
        HashMap<String, Integer> commonFriendsMap = new HashMap<>();
        for (List<String> friendAB : friendsLinkedList) {
            if (friendAB.contains(user)) {
                if (friendAB.indexOf(user) == 0) {
                    friendsSet.add(friendAB.get(1));
                }
                else {
                    friendsSet.add(friendAB.get(0));
                }
                friendsLinkedList.remove(friendAB);
            }
        }
        return friendsLinkedList;

//        for (String friend : friendsSet) {
//            for (List<String> friendAB : friendsLikedList) {
//                if (friendAB.contains(friend)) {
//                    int recommendPoint = 10;
//                    friendAB.remove(friend);
//                    if (commonFriendsMap.containsKey(friendAB.get(0))){
//                        recommendPoint += commonFriendsMap.get(friendAB.get(0));
//                    }
//                    commonFriendsMap.put(friendAB.get(0), recommendPoint);
//                }
//            }
//        }
//        return commonFriendsMap;
    }
    public static HashMap<String, Integer> getVisitiorsMap(List<String> visitors) {
        HashMap<String, Integer> visitorMap = new HashMap<>();
        for (int i=0; i<visitors.size(); i++) {
            String visitor = visitors.get(i);
            int visitNum = 1;
            if (visitorMap.containsKey(visitor)){
                visitNum = visitorMap.get(visitor) + 1;
            }
            visitorMap.put(visitor, visitNum);
        }
        return visitorMap;
    }
}

