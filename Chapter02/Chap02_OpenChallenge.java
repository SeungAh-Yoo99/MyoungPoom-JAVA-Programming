import java.util.Scanner;

public class Chap02_OpenChallenge {

	public static void main(String[] args) {
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		Scanner scan=new Scanner(System.in);
		int winner=0;
		
		System.out.print("철수>>>");
		String cs=scan.next();
		
		System.out.print("영희>>>");
		String yh=scan.next();
		
		switch(cs) {
		case "가위":
			if(yh.equals("가위"))
				winner=1;
			else if (yh.equals("바위"))
				winner=2;
			else
				winner=3;
			break;
		case "바위":
			if(yh.equals("가위"))
				winner=3;
			else if (yh.equals("바위"))
				winner=1;
			else
				winner=2;
			break;
		case "보":
			if(yh.equals("가위"))
				winner=2;
			else if (yh.equals("바위"))
				winner=3;
			else
				winner=1;
			break;
		}
		
		switch (winner) {
		case 1:
			System.out.println("비겼습니다.");
			break;
		case 2:
			System.out.println("영희가 이겼습니다.");
			break;
		case 3:
			System.out.println("철수가 이겼습니다.");
			break;
			}
	}
}