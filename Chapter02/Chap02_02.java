import java.util.Scanner;

public class Chap02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num=scan.nextInt();
		
		if ((num>=10)&&(num<=99)) {
			int ten=num/10;
			int one=num%10;
			if (ten==one)
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			else
				System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		else
			System.out.println("정수 범위 초과");
		
		scan.close();
	}

}