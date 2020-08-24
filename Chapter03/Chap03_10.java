/*
1. array[4][4] 다 0으로 초기화
2. 1~16 중 랜덤으로 10개 숫자 고르고(중복 시 다시 고름) ran[10]에 넣음.
3. 고른 수 array[ran[i]/4][ran[i]%4]에 랜덤 수 넣음
4. 출력
 */

import java.util.Random;

public class Chap03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		int num=0;
		int turn=0;
		int i=0;
		int j=0;
		
		int array [][]=new int [4][4];
		int ran[]=new int [10];
		
		for (i=0;i<ran.length;i++) { //2. 1~16 중 랜덤으로 10개 숫자 고르고(중복 시 다시 고름) ran[10]에 넣음.
			num=r.nextInt(16)+1;
			turn=i;
			for (j=0;j<turn;j++)
				if (ran[j]==num) {
					i--;
					break;
				}
			if (j==turn)
				ran[i]=num;
		}
		
		for(i=0;i<ran.length;i++) { //3. 고른 수 array[ran[i]/4][ran[i]%4]에 랜덤 수 넣음
			int first=ran[i]/4;
			int second=ran[i]%4;
			array[first][second]=(int)(Math.random()*10+1);
		}
		
		for(i=0;i<array.length;i++) { //4. 출력
			for (j=0;j<array[i].length;j++)
				System.out.print(array[i][j]+"\t");
			System.out.println();
		}
	}

}