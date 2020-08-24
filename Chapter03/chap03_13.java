public class Chap03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0;
		int second=0;;
		int c=0;

		for (int i=1;i<100;i++) {
			c=0;
			first=i%10;
			second=i/10;
			
			if ((first==3)||(first==6)||(first==9))
				c++;
			if ((second==3)||(second==6)||(second==9))
				c++;
			
			if (c==1)
				System.out.println(i+" 박수 짝");
			else if (c==2)
				System.out.println(i+" 박수 짝짝");
			else;
		}
	}

}