import java.util.Scanner;

public class CircleManager_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		Circle_2 c[]=new Circle_2[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y radius >>");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			int radius=scanner.nextInt();
			c[i]=new Circle_2(x,y,radius);
		}
		for(int i=0;i<c.length;i++)
			c[i].maxArea();
		
		for(int i=0;i<c.length;i++)
			c[i].showMaxArea();

		scanner.close();
	}

}