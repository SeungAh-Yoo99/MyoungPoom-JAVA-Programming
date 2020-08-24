import java.util.Scanner;

public class Chap03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String course []= {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score []= {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("과목 이름>>");
			String name=scan.next();
			
			if (name.equals("그만"))
				break;
			else {
				for (int i=0; i<course.length;i++) {
					if (course[i].equals(name)) {
						System.out.println(course[i]+"의 점수는 "+score[i]);
						break;
					}
					if (i==(course.length-1))
						System.out.println("없는 과목입니다.");
				}
			}
		}
	}

}