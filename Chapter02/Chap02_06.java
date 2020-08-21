import java.util.Scanner;

public class Chap02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int sum=0;
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num=scan.nextInt();
		
		if((num>=1)&&(num<=99)) { //범위 확인
			int ten=num/10;
			int one=num%10;
			if((ten==3)||(ten==6)||(ten==9)) //십의 자리수 확인
				sum++;
			if((one==3)||(one==6)||(one==9)) //일의 자리수 확인
				sum++;
			
			if(sum==1)
				System.out.println("박수짝"); //하나만 있는 경우
			else if(sum==2)
				System.out.println("박수짝짝"); //둘 다 있는 경우
			else
				System.out.println(num); //없는 경우
		}
		else
			System.out.println("정수 범위 초과");
	}

}