import java.util.Scanner;

public class Chap02_08 {
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x>=rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2))
			return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		
		System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		
		if(inRect(x1,y1,100,100,200,300)^inRect(x2,y2,100,100,200,200)) //제시한 점 1, 2 중 하나라도 주어진 사각형 안에 있다면 true
			System.out.println("두 사각형은 충돌합니다.");
		else
			System.out.println("두 사각형은 충돌하지 않습니다.");
		
		scan.close();
	}

}