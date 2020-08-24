import java.util.Scanner;
import java.util.InputMismatchException;

public class Chap03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n=scan.nextInt();
				int m=scan.nextInt();
				System.out.println(n+"x"+m+"="+n*m);
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scan.nextLine();
				continue;
			}
		}
		scan.close();
	}

}