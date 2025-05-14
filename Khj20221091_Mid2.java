import java.util.Scanner;
public class Khj20221091_Mid2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("무엇을 낼까요?(바위(3), 가위(3), 보(3), 별(3) 남았습니다.)");
        
        
        int star = 3;
        int cmp_star = 3;
        int r = 3, cmp_r=3;
        int si = 3, cmp_si=3;
        int p = 3, cmp_p=3;

        while(r>0 || si>0 || p>0 ) {

        int use;

        use = s.nextInt();
  
        if (use == 0 && r > 0) {
        	r--;
            System.out.println("바위를 냈습니다");}
        else if (use == 1 && si > 0) {
        	si --;
            System.out.println("가위를 냈습니다");}
        else if (use == 2 && p > 0) {
        	p --;
            System.out.println("보를 냈습니다");}
        else {
        	System.out.println("해당 행동을 모두 소진 했습니다.");
        	continue;
        }

        int cmp = -1;
        while (cmp == -1) {
            cmp = (int) (Math.random() * 3);
            if (cmp == 0 && cmp_r > 0) {
                cmp_r--;
                System.out.println("컴퓨터: 바위");}
             else if (cmp == 1 && cmp_si > 0) {
                cmp_si--;
                System.out.println("컴퓨터: 가위");}
             else if (cmp == 2 && cmp_p > 0) {
                cmp_p--;
                System.out.println("컴퓨터: 보");}
             else {
            	 cmp = -1;
             }
            
        }

        
        
		if (use==cmp) {
        	System.out.println("비겼습니다");
        	System.out.printf("무엇을 낼까요?(바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", r,si,p,star);
        	System.out.printf("(컴퓨터:바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", cmp_r,cmp_si,cmp_p,cmp_star);
        	}
        else if (use-cmp== -1) {
        	System.out.println("유저 승 컴퓨터 패 컴퓨터 별 1 차감");
        	star ++;
        	cmp_star --;
        	System.out.printf("무엇을 낼까요?(바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", r,si,p,star);
        	System.out.printf("(컴퓨터:바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", cmp_r,cmp_si,cmp_p,cmp_star);}		
 		else if (use-cmp==-2) {
        	System.out.println("유저 패 컴퓨터 승 유저 별 1 차감");
        	star --;
        	cmp_star ++;
        	System.out.printf("무엇을 낼까요?(바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", r,si,p,star);
        	System.out.printf("(컴퓨터:바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", cmp_r,cmp_si,cmp_p,cmp_star);}			
        else if (use-cmp==1) {
        	System.out.println("유저 패 컴퓨터 승 유저 별 1 차감");
        	star --;
        	cmp_star ++;
        	System.out.printf("무엇을 낼까요?(바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", r,si,p,star);
        	System.out.printf("(컴퓨터:바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", cmp_r,cmp_si,cmp_p,cmp_star);}
        else if (use-cmp== 2) {
        	System.out.println("유저 승 컴퓨터 패 컴퓨터 별 1 차감");
        	star ++;
        	cmp_star --;
        	System.out.printf("무엇을 낼까요?(바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", r,si,p,star);
        	System.out.printf("(컴퓨터:바위(%d) 가위(%d) 보(%d) 별(%d)남았습니다.)\n", cmp_r,cmp_si,cmp_p,cmp_star);}


        
         if (r==0&&si==0&&p==0&&cmp_r==0&&cmp_si==0&&cmp_p==0&&star>cmp_star) {
        	 System.out.println("최종 유저의 별이 많습니다 유저 승");
        	 break;
         }
         else if (r==0&&si==0&&p==0&&cmp_r==0&&cmp_si==0&&cmp_p==0&&star<cmp_star) {
        	 System.out.println("최종 컴퓨터의 별이 많습니다 컴퓨터 승");
        	 break;
         }
         else if(r==0&&si==0&&p==0&&cmp_r==0&&cmp_si==0&&cmp_p==0&&star==cmp_star) {
        	 System.out.println("최종 별의 갯수가 동일합니다 비겼습니다.");
        	 break;
         }
         else if(star==0) {
        	 System.out.println("유저가 별을 모두 소모했습니다 컴퓨터 승");
        	 break;
         }
         else if(cmp_star==0) {
        	 System.out.println("컴퓨터가 별을 모두 소모했습니다 유저 승");
        	 break;
         }
       
        	
        
        
        
       
        }