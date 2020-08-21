import java.util.Scanner;

public class Chap02_12_ifelse {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		double answer=0;
		
		System.out.print("연산>>");
		double num1=scan.nextDouble();
		String oper=scan.next();
		double num2=scan.nextDouble();
		
		if (num2!=0) {
			 if (oper.equals("+"))
				 answer=num1+num2;
			 else if (oper.equals("-"))
				answer=num1-num2;
			 else if (oper.equals("*"))
				answer=num1*num2;
			 else
				answer=num1/num2;
			System.out.println((int)(num1)+oper+(int)(num2)+"의 계산 결과는 "+(int)(answer));
		}
		else
			System.out.println("0으로 나눌 수 없습니다.");
	}
}