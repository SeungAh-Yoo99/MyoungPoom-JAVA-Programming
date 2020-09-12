import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int num1;
		int num2;
		String oper;
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		num1=scan.nextInt();
		num2=scan.nextInt();
		oper=scan.next();
		
		switch (oper) {
		case "+":
			Add add=new Add();
			add.setValue(num1,num2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub=new Sub();
			sub.setValue(num1,num2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul=new Mul();
			mul.setValue(num1,num2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div=new Div();
			div.setValue(num1,num2);
			System.out.println(div.calculate());
			break;
		}
	}

}