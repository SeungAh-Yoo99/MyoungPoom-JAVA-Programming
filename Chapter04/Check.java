class Check {
	Check(String S[],String A[], String B[]) {
		
		System.out.print("S>>"); //S좌석 출력
		for (int i=0;i<10;i++)
			System.out.print(" "+S[i]);
		System.out.println();

		System.out.print("A>>"); //A좌석 출력
		for (int i=0;i<10;i++)
			System.out.print(" "+A[i]);
		System.out.println();
		
		System.out.print("B>>"); //B좌석 출력
		for (int i=0;i<10;i++)
			System.out.print(" "+B[i]);
		System.out.println();

		System.out.println("<<조회를 완료하였습니다>>");
	}
}