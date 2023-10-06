package Ex2;

public class Exercise9_11 {
    public static void main(String[] args){
        if (args.length != 2) {
            System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요");
            return;
        }
        int x, y;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요");
            return;
        }
        if (!((2<=x && x<=9) && (2<=y && y<=9))){
            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
            return;
        }

        for(int i=Math.min(x,y); i<=Math.max(x,y); i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%d*%d=%d\n",i,j,i*j);
            }
            System.out.println();
        }
    }
}
