class Phone {
	
	private String name;
	private String phoneNumber;
	
	Phone (String name, String phoneNumber) { //Phone 생성자
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	boolean getNumber (String name) { //인자로 받은 이름이 객체의 이름과 같으면 번호 출력 후 true 반환
		if (this.name.equals(name)) {
			System.out.println(name+"의 번호는 "+this.phoneNumber+" 입니다.");
			return true;
		}
		else
			return false;
	}
}