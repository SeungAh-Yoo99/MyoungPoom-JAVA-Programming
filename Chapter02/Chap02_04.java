import java.util.Scanner;

public class Chap02_04 {
	public static void main(String args[]) {

		Scanner scan=new Scanner(System.in);
		int medium=0;
		
		System.out.print("정수 3개 입력>>");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if (num1<=num2) { //먼저 num1과 num2 비교
			if(num1>num3) //num3<num1<=num2
				medium=num1;
			else {
				if(num2<=num3) //num1<=num2<=num3
					medium=num2;
				else //num1<=num3<num2
					medium=num3;
			}	
		}
		else {
			if(num1<=num3) //num2<num1<=num3
				medium=num1;
			else {
				if(num2<=num3) //num2<=num3<num1
					medium=num3;
				else //num3<num2<num1
					medium=num2;
			}
		}
		
		System.out.println("중간 값은 "+medium);
		scan.close();
	}
}