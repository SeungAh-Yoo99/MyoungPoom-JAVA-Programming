import java.util.Scanner;

public class Chap02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int num=0; //지폐, 동전의 개수
		
		System.out.print("금액을 입력하시오>>");
		int money=scan.nextInt();
		
		num=money/50000;
		money%=50000;
		if (num!=0)
			System.out.println("오만원권 "+num+"매");
		
		num=money/10000;
		money%=10000;
		if (num!=0)
			System.out.println("만원권 "+num+"매");
		
		num=money/1000;
		money%=1000;
		if (num!=0)
			System.out.println("천원권 "+num+"매");
		
		num=money/500;
		money%=500;
		if (num!=0)
			System.out.println("오백원권 "+num+"매");
		
		num=money/100;
		money%=100;
		if (num!=0)
			System.out.println("백원권 "+num+"개");
		
		num=money/50;
		money%=50;
		if (num!=0)
			System.out.println("오십원 "+num+"개");
		
		num=money/10;
		money%=10;
		if (num!=0)
			System.out.println("십원 "+num+"개");
		
		num=money/1;
		money%=1;
		if (num!=0)
			System.out.println("일원 "+num+"개");
	}

}