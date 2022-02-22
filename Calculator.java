package week1.day2;

public class Calculator {
	public void add () {
		int i=8;
		int j=9;
		int m=5;
		System.out.println("Add:"+i+j+m);
	}
	public void sub() {
		int k=17;
		int l=10;
		System.out.println(k-l);
		
	}
	public void mul() {
		double d= 145.36;
		double e= 12.67;
		System.out.println("Multiply:"+d*e);
		
	}
	public void div() {
		float f=87.99f;
		float g=58.66f;
		System.out.println("Division:"+f/g);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Calculator c= new Calculator();
     c.add();
     c.sub();
     c.mul();
     c.div();
     
	}

}
