import java.util.Scanner;

public class Chap03_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String str[]= {"가위","바위","보"};
		int winner=0;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user=scan.next();
			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			int n=(int)(Math.random()*3);
			
			switch (user) {
			case "가위":
				if (str[n].equals("가위"))
					winner=1;
				else if (str[n].equals("바위"))
					winner=2;
				else
					winner=3;
				break;
			case "바위":
				if (str[n].equals("가위"))
					winner=3;
				else if (str[n].equals("바위"))
					winner=1;
				else
					winner=2;
				break;
			case "보":
				if (str[n].equals("가위"))
					winner=2;
				else if (str[n].equals("바위"))
					winner=3;
				else
					winner=1;
				break;
			}
			
			if (winner==1)
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
			else if (winner==2)
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
			else
				System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
		}
	}

}