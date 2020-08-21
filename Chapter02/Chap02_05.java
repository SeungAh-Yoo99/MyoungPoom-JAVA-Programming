import java.util.Scanner;

public class Chap02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오>>");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if ((num1<num2+num3)&&(num2<num1+num3)&&(num3<num1+num2))
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 안됩니다");
		
		scan.close();
	}

}