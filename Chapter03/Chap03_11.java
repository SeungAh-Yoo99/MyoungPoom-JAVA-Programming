public class Chap03_11 {

	public static void main(String args[]) {
		
		int sum=0;
		double averg=0;
		for(int i=0;i<args.length;i++)
			sum+=Integer.parseInt(args[i]);
		averg=(double)sum/args.length;
		System.out.println(averg);
	}
}