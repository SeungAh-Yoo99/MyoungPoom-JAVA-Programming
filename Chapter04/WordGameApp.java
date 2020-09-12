import java.util.Scanner;

public class WordGameApp {
	static Scanner scan=new Scanner(System.in);
	String word="아버지";
	int lastIndex;
	char lastChar;
	boolean result;
	
	WordGameApp() {}
	
	void run(int num) {
		String name;
		Player player[]=new Player[num];
		
		for (int i=0;i<player.length;i++) { //참가자 이름 입력
			System.out.print("참가자의 이름을 입력하세요>>");
			name=scan.next();
			player[i]=new Player(name);
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		while(true) {
			for (int i=0;i<player.length;i++) {
				lastIndex=word.length()-1;
				lastChar=word.charAt(lastIndex);
				word=player[i].getWordFromUser();
				result=player[i].checkSuccess(lastChar);
				if (result==false) {
					System.out.println(player[i].getPlayerName()+"이 졌습니다.");
					break;
				}
			}
			if (result==false)
				break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WordGameApp wordGameApp=new WordGameApp();
		int num;
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		num=scan.nextInt();
		wordGameApp.run(num);
	}

}