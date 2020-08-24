import java.util.Random;
import java.util.Scanner;

public class Chap03_OpenChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		Scanner scan=new Scanner(System.in);
		int start=0;
		int end=99;
		int i=0;
		
		while(true) { //text가 n이 입력될 때까지 반복
			start=0; //매번 시작과 끝을 1과 99로 초기화
			end=99;
			i=1; //매번 횟수 초기화
			int k=r.nextInt(100); //랜덤으로 수 결정
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			while(true) { //답이 나올 때까지 반복
				System.out.println(start+"-"+end);
				System.out.print(i+">>");
				i++;
				int num=scan.nextInt();
			
				if (k==num) { //맞았을 경우
					System.out.println("맞았습니다.");
					break;
				}
				else if (k<num) {
					end=num;
					System.out.println("더 낮게");
				}
				else {
					start=num;
					System.out.println("더 높게");
				}
			}
			System.out.print("다시하시겠습니까(y/n)");
			String text=scan.next();
			if (text.equals("n"))
				break;
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}