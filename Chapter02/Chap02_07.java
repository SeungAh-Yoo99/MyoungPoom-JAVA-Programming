import java.util.Scanner;

public class Chap02_07 {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if ((x>100)&&(x<200)&&(y>100)&&(y<200)) //직사각형의 테두리에 걸치는 것 포함x
			System.out.println("("+x+","+y+") 는 사각형 안에 있습니다.");
		else
			System.out.println("("+x+","+y+") 는 사각형 안에 있지 않습니다.");
		
		scan.close();
	}
}