import java.util.Scanner;

public class Chap03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String apb=scan.next();
		char c=apb.charAt(0);
		
		for(char i=c;i>='a';i--) {
			for(char j='a';j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}

}