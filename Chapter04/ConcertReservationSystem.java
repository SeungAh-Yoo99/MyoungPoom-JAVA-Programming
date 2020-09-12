import java.util.*;

public class ConcertReservationSystem {
	static String S[]=new String[10];
	static String A[]=new String[10];
	static String B[]=new String[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int option;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		for(int i=0;i<10;i++) { //세 좌석 타입 모두 빈자리로 초기화
			S[i]="---";
			A[i]="---";
			B[i]="---";
		}
		
		while (true) {
			try {
				System.out.print("예약:1. 조회:2, 취소:3, 끝내기:4>>");
				option=scan.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("잘못 입력. 다시 입력하시오.");
				scan.nextLine();
				continue;
			}
			if (option==1) { //예약
				Reservation reservation=new Reservation(S,A,B);
				continue;
			}
			else if (option==2) { //조회
				Check check=new Check(S,A,B);
				continue;
			}
			else if (option==3) { //취소
				Cancel cancel=new Cancel(S,A,B);
				continue;
			}
			else if (option==4)//끝내기
				break;
			else {
				System.out.println("잘못 입력. 다시 입력해주세요.");
				continue;
			}
		}
	}
}