package basic;

public class PrintTest {
	public static void p(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		String str = "hello~~";
		int n = 10;
		double d= 3.2;
		float f = 13.4f;
		boolean tf = false;
		
		p(n);
		p(str + n);
		p(d);
		p(f);
		p(tf);
		
	}

}
