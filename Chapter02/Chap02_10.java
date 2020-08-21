import java.util.Scanner;

public class Chap02_10 {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		double radius1=scan.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		double radius2=scan.nextDouble();
		
		double distance=(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		distance=Math.sqrt(distance);
		
		if (distance<=(radius1+radius2))
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		scan.close();
	}
}