class ArrayUtil {
	
	static int[] c;
	
	public static int [] concat(int[] a, int[] b) {
		c=new int[a.length+b.length];
		int i;
		for (i=0;i<a.length;i++)
			c[i]=a[i];
		for (i=0;i<b.length;i++)
			c[i+a.length]=b[i];
		return c;
	}
	
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
}