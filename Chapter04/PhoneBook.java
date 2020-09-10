import java.util.Scanner;

public class PhoneBook {
	
	private Phone phone[];
	int i;
	boolean tf;
	
	PhoneBook (int num) { //PhoneBook 생성자
		phone=new Phone[num];
	}
	
	void bookSet (int num, String name, String phoneNumber) { //객체 배열의 각 객체 생성
		phone[num]=new Phone(name,phoneNumber);
	}
	
	void show (String name) { //객체 배열 중 인자로 받은 name과 동일한 name이 있는지 확인
		for(i=0;i<this.phone.length;i++) {
			tf=phone[i].getNumber(name);
			if (tf==true)
				break;
		}
		if (i==this.phone.length)
			System.out.println(name+" 이 없습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int num;
		String name;
		String phoneNumber;
		
		System.out.print("인원수>>");
		num=scan.nextInt();
		PhoneBook phoneBook=new PhoneBook(num); //PhoneBook 객체 생성
		
		for(int i=0;i<num;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name=scan.next();
			phoneNumber=scan.next();
			phoneBook.bookSet(i,name,phoneNumber); //Phone 객체 배열 생성
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			name=scan.next();
			if (name.equals("그만"))
				break;
			phoneBook.show(name);
		}
	}

}