package basic;

public class ProcedureTest1 {

	public void pro_00() {
		//선언부
		int v_empno = 7788;
		String v_ename;
		//실행부
		v_ename = "TIGER";
		System.out.println("v_empno : " + v_empno);
		System.out.println("v_ename : " + v_ename);
	}
	
	public static void main(String[] args) {
		//pro_00();
		ProcedureTest1 pt = new ProcedureTest1();
		pt.pro_00();
	}

}
