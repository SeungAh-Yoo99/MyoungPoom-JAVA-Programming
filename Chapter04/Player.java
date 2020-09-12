import java.util.Scanner;

class Player {
	Scanner scan=new Scanner(System.in);
	private String name;
	private String word;
	
	Player(String name) {
		this.name=name;
	}
	
	String getPlayerName() {
		return this.name;
	}
	
	String getWordFromUser() {
		System.out.print(this.name+">>");
		this.word=scan.next();
		return this.word;
	}
	
	boolean checkSuccess (char lastChar) {
		boolean result;
		char firstChar=this.word.charAt(0);
		if (lastChar==firstChar)
			result=true;
		else
			result=false;
		return result;
	}
}