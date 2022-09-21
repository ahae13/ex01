package basic;

import java.util.Scanner;

public class Test {
	//mod( ) 함수 따라하기
	public static int f_mod(int[] nums){
		int result = nums[0] % nums[1];
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int[] nums = new int[2];
		nums[0] = sc.nextInt();
		nums[1] = sc.nextInt();
		
		int result = f_mod(nums);
		if(result == 0) {
			System.out.printf("%d 는(은) 짝수 입니다.", nums[0]);
		}else {
			System.out.printf("%d 는(은) 홀수 입니다.", nums[0]);
		}
		
		sc.close();
	}

}
