public class Chap03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][]=new int [4][4];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*10+1);
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}