public class Chap03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int sum=0;

		for(int i=0;i<args.length;i++) {
			try {
					num=Integer.parseInt(args[i]);
					sum+=num;
			}
			catch (NumberFormatException e) {
			}
		}
		System.out.println(sum);
	}

}