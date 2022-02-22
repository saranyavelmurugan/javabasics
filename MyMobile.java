package week1.day2;

public class MyMobile {
	static int k= 28;
	public void makeCall() {
		
		int i =1987;
		System.out.println(i);
	}
	public void sendMsg() {
		String s= "life";
		System.out.println(s);
		
	}
	private void payBills() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile m=new MyMobile();
		m.makeCall();
		m.sendMsg();
		m.payBills();
		System.out.println("static int is:"+k);
		

	}

}
