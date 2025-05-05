import java.util.Scanner;
public class Khj20221091_Mid1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("무엇을 낼까요?(0:바위, 1:가위, 2:보 입니다.)");

        int use;

        use = s.nextInt();

        if (use == 0)
            System.out.println("유저: 바위를 냈습니다.");
        else if (use == 1)
            System.out.println("유저: 가위를 냈습니다.");
        else if (use == 2)
            System.out.println("유저: 보를 냈습니다.");

        s.close();

        int cmp =(int) (Math.random() *3);
        System.out.println(cmp);
        
        if (cmp == 0)
            System.out.println("컴퓨터: 바위를 냈습니다.");
        else if (cmp == 1)
            System.out.println("컴퓨터: 가위를 냈습니다.");
        else if (cmp == 2)
            System.out.println("컴퓨터: 보를 냈습니다.");

        if (use == cmp)
            System.out.println("비겼습니다");
        
        else if(use-cmp==-1)
            System.out.println("유저가 승리했습니다.");
        else if(use-cmp==-2)
            System.out.println("컴퓨터가 승리했습니다.");
        else if(use-cmp==1)
            System.out.println("컴퓨터가 승리했습니다.");
        else if(use-cmp==2)
            System.out.println("유저가 승리했습니다.");





    }
}