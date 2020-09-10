class Circle_6 {
	static int max;
	private double x,y;
	private int radius;
	public Circle_2 (double x,double y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	
	public void maxArea() {
		if (max<=this.radius)
			max=this.radius;
	}
	
	public void showMaxArea() {
		if (max==this.radius)
			System.out.println("가장 면적이 큰 원은 ("+this.x+","+this.y+")"+this.radius);
	}
}