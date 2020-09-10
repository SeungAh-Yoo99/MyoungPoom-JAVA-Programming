import java.util.Scanner;

class DicApp {
	
	Scanner scan=new Scanner(System.in);
	String word;
	
	DicApp() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			word=scan.next();
			
			if (word.equals("그만"))
				break;
			else
				System.out.println(Dictionary.kor2Eng(word));
		}
	}
	
	
}