import java.util.Scanner;
import java.util.Random;

public class Chap03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		Random r= new Random();
		int array[];
		int i=0;
		int j=0;
		int turn=0;
		
		while(true) {
			System.out.print("정수 몇개?");
			int length=scan.nextInt();
			if ((length>=1)&&(length<100)) { //받은 배열 길이가 적당한지 검사 
				array=new int [length]; //적당하면 배열 생성
				break;
			}
			else //범위 초과하면 배열 길이 계속 확인
				System.out.println("범위 초과. 다시 입력");
		}
		
		for(i=0;i<array.length;i++) {
			int num=r.nextInt(100)+1;
			turn=i;
			for (j=0;j<turn;j++) { //이미 정해진 수와 같은 수가 할당 되면 i를 1 줄임으로써 다시 할당.
				if (array[j]==num)
					i--;
			}
			if (j==turn) //위의 for문 안의 if문에 걸리지 않고 잘 통과하면(같은 수가 없으면)
				array[i]=num;
		}
		
		for(i=0;i<array.length;i++) { //배열에 할당된 수 출력
			System.out.print(array[i]+ "\t");
			if (((i+1)%10)==0) //한 줄에 10개씩만 출력
				System.out.println();
		}
		
	}

}