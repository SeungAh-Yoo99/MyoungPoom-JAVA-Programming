import java.util.Scanner;

public class Chap03_05 {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int arry[]=new int[10];
		System.out.print("양의 정수 10개 입력하시오>>");
		for(int i=0;i<arry.length;i++)
			arry[i]=scan.nextInt();
		
		System.out.print("3의 배수는 ");
		for(int i=0;i<arry.length;i++)
			if ((arry[i]%3)==0)
				System.out.print(arry[i]+" ");
		System.out.println();
	}
}