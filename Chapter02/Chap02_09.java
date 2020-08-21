import java.util.Scanner;

public class Chap02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		int circlex=scan.nextInt();
		int circley=scan.nextInt();
		double radius=scan.nextDouble();
		
		System.out.print("점 입력>>");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		double distance=(((circlex-x)*(circlex-x))+((circley-y)*(circley-y)));
		distance=Math.sqrt(distance);
		
		if(distance<=radius)
			System.out.println("점 ("+x+", "+y+")는 원 안에 있다.");
		else
			System.out.println("점 ("+x+", "+y+")는 원 안에 있지 않다.");
		
		scan.close();
	}

}