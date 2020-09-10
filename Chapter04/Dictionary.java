class Dictionary {

	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	
	public static String kor2Eng(String word) {
		int i;
		String ans="";
		
		for (i=0;i<kor.length;i++) {
			if (kor[i].equals(word)) {
				ans=(word+"은 "+eng[i]);
				break;
			}

		}
		if (i==kor.length)
			ans=(word+"는 저의 사전에 없습니다.");
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DicApp dicApp=new DicApp();
	}

}