import java.util.Scanner;

public class Chap02_12_switch {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		double answer=0;
		
		System.out.print("연산>>");
		double num1=scan.nextDouble();
		String oper=scan.next();
		double num2=scan.nextDouble();
		
		if (num2!=0) {
			switch (oper) {
			case "+":
				answer=num1+num2;
				break;
			case "-":
				answer=num1-num2;
				break;
			case "*":
				answer=num1*num2;
				break;
			case "/":
				answer=num1/num2;
				break;
			}
			System.out.println(num1+oper+num2+"의 계산 결과는 "+answer);
		}
		else
			System.out.println("0으로 나눌 수 없습니다.");
	}
}