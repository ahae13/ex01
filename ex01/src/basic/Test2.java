package basic;

import java.util.Scanner;

class Nums{
	int firstNum;
	int secondNum;
}

public class Test2 {
	//mod( ) 함수 따라하기
	public static int f_mod(Nums nums){
		int result = nums.firstNum % nums.secondNum;
		return result;
	}
	
	public static void main(String[] args) {
		
		Nums nums = new Nums();
				
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
			
		nums.firstNum = sc.nextInt();
		nums.secondNum = sc.nextInt();
		
		int result = f_mod(nums);
		if(result == 0) {
			System.out.printf("%d 는(은) 짝수 입니다.", nums.firstNum);
		}else {
			System.out.printf("%d 는(은) 홀수 입니다.", nums.firstNum);
		}
		
		sc.close();
	}

}
