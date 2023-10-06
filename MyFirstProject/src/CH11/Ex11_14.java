package CH11;
import java.util.*;
class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank;
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor+eng+math;
    }
    int getTotal(){
        return total;
    }
    float getAverage(){
        return ((int)((getTotal()/3f)*10 +0.5))/10f;
    }
    public int compareTo(Object o){
        if (o instanceof Student){
            Student tmp = (Student) o;
            return tmp.getTotal() - getTotal();
        } else{
            return -1;
        }
    }
    public String toString(){
        return name
                +", "+ban
                +", "+no
                +", "+kor
                +", "+eng
                +", "+math
                +", "+getTotal()
                +", "+getAverage()
                +", "+schoolRank
                +", "+classRank
                ;
    }
}
public class Ex11_14 {
    static ArrayList record = new ArrayList();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        while(true){
            switch (displayMenu()){
                case 1 :
                    inputRecord();
                    break;
                case 2 :
                    displayRecord();
                    break;
                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }
    static int displayMenu(){
        System.out.println("*****************************************");
        System.out.println("*          성적 관리 프로그램               *");
        System.out.println();
        System.out.println("1. 학생성적 입력하기");
        System.out.println();
        System.out.println("2. 학생성적 보기");
        System.out.println();
        System.out.println("3. 프로그램 종료");
        System.out.println();
        int menu;
        while(true) {
            System.out.println("원하는 메뉴를 선택하세요. (1~3) : ");
            try {
                menu = s.nextInt();
                if (menu < 1 || menu > 3)
                    throw new Exception();
            }catch(Exception e){
                System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
                continue;
            }
            break;
        }
        return menu;
    }
    static void inputRecord(){
        System.out.println("1. 학생성적 입력하기");
        System.out.println("'이름, 반, 번호, 국어성적, 영어성적, 수학성적' 순서로 공백없이 입력하세요");
        System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
        String input = "";
        while(true){
            input = s.nextLine();
            if (input.equalsIgnoreCase("q"))
                break;
            String[] studentInfo = input.split(",");
            if(studentInfo.length != 6){
                System.out.println("입력오류입니다. '이름, 반, 번호, 국어성적, 영어성적, 수학성적'의 순서로 입력하세요.");
                continue;
            }
            Student s = new Student(studentInfo[0].trim(),
                    Integer.parseInt(studentInfo[1].trim()),
                    Integer.parseInt(studentInfo[2].trim()),
                    Integer.parseInt(studentInfo[3].trim()),
                    Integer.parseInt(studentInfo[4].trim()),
                    Integer.parseInt(studentInfo[5].trim())
            );
            record.add(s);
            System.out.println("잘 입력되었습니다. 입력을 마치려면 q를 입력하세요.");
        }
    }
    static void displayRecord(){
        System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
        Iterator it = record.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
