import java.util.*;

class Reservation {
	Scanner scan=new Scanner(System.in);
	
	Reservation(String S[],String A[],String B[]) {
		int option;
		String name;
		int seat;
		
		while (true) {
			try {
			System.out.print("좌석구분 S(1), A(2), B(3)>>");
			option=scan.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("잘못 입력. 다시 입력하시오.");
				scan.nextLine();
				continue;
			}
			if (option==1) {
				System.out.print("S>>"); //현재 S석 상태 출력
				for (int i=0;i<S.length;i++)
					System.out.print(" "+S[i]);
				System.out.println();
				System.out.print("이름>>"); //예약자 이름 입력
				name=scan.next();
				while(true) { //좌석 번호 입력(좌석 번호 범위 초과 시 오류 메시지)
					try {
						System.out.print("번호>>");
						seat=scan.nextInt();
					}
					catch (InputMismatchException e) {
						System.out.println("잘못 입력. 다시 입력하시오.");
						scan.nextLine();
						continue;
					}
					if ((seat>=1)&&(seat<=10)) {
						if (S[seat].equals("---")) //빈자리면 예약 진행
							S[seat]=name;
						else {
							System.out.println("이미 예약된 자리입니다. 다시 입력하세요.");
							continue;
						}
						break;
					}
					else {
						System.out.println("자리번호는 1~10까지 입니다. 다시 입력해 주세요.");
						continue;
					}
				}
				break;
			}
			else if (option==2) {
				System.out.print("A>>"); //현재 A석 상태 출력
				for (int i=0;i<A.length;i++)
					System.out.print(" "+A[i]);
				System.out.println();
				System.out.print("이름>>"); //예약자 이름 입력
				name=scan.next();
				while(true) { //좌석 번호 입력(좌석 번호 범위 초과 시 오류 메시지)
					try {
						System.out.print("번호>>");
						seat=scan.nextInt();
					}
					catch (InputMismatchException e) {
						System.out.println("잘못 입력. 다시 입력하시오.");
						scan.nextLine();
						continue;
					}
					System.out.print("번호>>");
					seat=scan.nextInt();
					if ((seat>=1)&&(seat<=10)) {
						if (A[seat].equals("---")) //빈자리면 예약 진행
							A[seat]=name;
						else {
							System.out.println("이미 예약된 자리입니다. 다시 입력하세요.");
							continue;
						}
						break;
					}
					else {
						System.out.println("자리번호는 1~10까지 입니다. 다시 입력해 주세요.");
						continue;
					}
				}
				break;
			}
			else if (option==3) {
				System.out.print("B>>"); //현재 B석 상태 출력
				for (int i=0;i<B.length;i++)
					System.out.print(" "+B[i]);
				System.out.println();
				System.out.print("이름>>"); //예약자 이름 입력
				name=scan.next();
				while(true) { //좌석 번호 입력(좌석 번호 범위 초과 시 오류 메시지
					try {
						System.out.print("번호>>");
						seat=scan.nextInt();
					}
					catch (InputMismatchException e) {
						System.out.println("잘못 입력. 다시 입력하시오.");
						scan.nextLine();
						continue;
					}
					System.out.print("번호>>");
					seat=scan.nextInt();
					if ((seat>=1)&&(seat<=10)) {
						if (B[seat].equals("---")) //빈자리면 예약 진행
							B[seat]=name;
						else {
							System.out.println("이미 예약된 자리입니다. 다시 입력하세요.");
							continue;
						}
						break;
					}
					else {
						System.out.println("자리번호는 1~10까지 입니다. 다시 입력해 주세요.");
						continue;
					}
				}
				break;
			}
			else
				System.out.println("잘못 입력. 다시 입력해주세요.");
		}
	}

	
}