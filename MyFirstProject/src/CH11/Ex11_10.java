package CH11;
import java.util.*;
public class Ex11_10 {
    public static void main(String[] args){
        Set set = new HashSet();
        int [][] board = new int[5][5];
        while (set.size() < board.length*board[0].length){
            String randNum = (int)(Math.random()*30)+1 + "";
            if (!set.contains(randNum))
                set.add(randNum);
        }
        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);

        Iterator it = list.iterator();
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                board[i][j] = Integer.parseInt((String)it.next());
                if (board[i][j] < 10){
                    System.out.print(" ");
                }
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
