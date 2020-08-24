import java.util.Scanner;

public class Chap03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		
		System.out.print("금액을 입력하시오>>");
		int price=scan.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			if ((price/unit[i])!=0)
				System.out.println(unit[i]+"원 짜리 : "+(price/unit[i])+"개");
			price%=unit[i];
		}
	}
}