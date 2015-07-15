package easyjava;

import java.math.BigDecimal;

public class BigDecimalExam2 {
	public static void main(String[] args) {
		double dNum1, dNum2;
		dNum1 = 3.05;
		dNum2 = 0.034;
		
		System.out.println(dNum1 + dNum2);
		
		BigDecimal a = new BigDecimal("3.05");
		BigDecimal b = new BigDecimal("0.034");
				
		System.out.println(a.add(b).toString());
		
		//3.0839999999999996
		//3.084
	}
}
