package basic;

public class PrimeTest {

	public static void main(String[] args) {
		int num = 105;
		int result = 0;
		if(num > 100) {
			result = num % 100;
			
		}else if(num > 10) {
			result = num % 10;
			
		}else {
			result = num;
		}
		if(result == 3) {
			System.out.println("good");
		}else {
			System.out.println("bad");
		}
	}

}
