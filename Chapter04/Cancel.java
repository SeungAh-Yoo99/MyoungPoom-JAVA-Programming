import java.util.*;

class Cancel {
	Cancel (String S[],String A[],String B[]) {
		Scanner scan=new Scanner(System.in);
		int option;
		String name;
		int seat;
		
		while (true) {
			try {
				System.out.print("좌석 S:1, A:2, B:3>>");
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
				while(true) {
					System.out.print("이름>>"); //예약자 이름 입력
					name=scan.next();
					int i;
					for (i=0;i<S.length;i++) { //해당하는 이름 있으면 삭제
						if (S[i].equals(name)) {
							S[i]="---";
							break;
						}	
					}
					if (i==S.length) {
						System.out.println("예약 내역이 없습니다. 다시 입력해 주세요.");
						continue;
					}
					break;
				}
				break;
			}
			else if (option==2) {
				System.out.print("A>>"); //현재 A석 상태 출력
				for (int i=0;i<A.length;i++)
					System.out.print(" "+A[i]);
				System.out.println();
				while(true) {
					System.out.print("이름>>"); //예약자 이름 입력
					name=scan.next();
					int i;
					for (i=0;i<A.length;i++) { //해당하는 이름 있으면 삭제
						if (A[i].equals(name)) {
							A[i]="---";
							break;
						}	
					}
					if (i==A.length) {
						System.out.println("예약 내역이 없습니다. 다시 입력해 주세요.");
						continue;
					}
					break;
				}
				break;
			}
			else if (option==3) {
				System.out.print("B>>"); //현재 B석 상태 출력
				for (int i=0;i<B.length;i++)
					System.out.print(" "+B[i]);
				System.out.println();
				while(true) {
					System.out.print("이름>>"); //예약자 이름 입력
					name=scan.next();
					int i;
					for (i=0;i<B.length;i++) { //해당하는 이름 있으면 삭제
						if (B[i].equals(name)) {
							B[i]="---";
							break;
						}	
					}
					if (i==B.length) {
						System.out.println("예약 내역이 없습니다. 다시 입력해 주세요.");
						continue;
					}
					break;
				}
				break;
			}
			else
				System.out.println("잘못 입력. 다시 입력해주세요.");
		}
	}

}