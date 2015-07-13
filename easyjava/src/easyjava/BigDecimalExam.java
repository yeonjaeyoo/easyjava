package easyjava;

import java.math.BigDecimal;

public class BigDecimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal a = new BigDecimal(3.141592);
		BigDecimal b = new BigDecimal(3.141592);
		BigDecimal c, d;
		
		c = a.setScale(1, BigDecimal.ROUND_CEILING);
		d = b.setScale(4, BigDecimal.ROUND_HALF_DOWN);
				
		System.out.println(c.doubleValue());
		System.out.println(d.doubleValue());
		System.out.println(a.setScale(1, BigDecimal.ROUND_DOWN));
		/*ROUND_CEILING 
		BigDecimal이 양수인 경우, ROUND_UP으로 작동하며, 음수인 경우 ROUND_DOWN으로 작동합니다. 
		
		ROUND_DOWN 
		버릴 부분 앞자리를 결코 증가시키지 않습니다(예: 절단). 
		
		ROUND_FLOOR 
		BigDecimal이 양수인 경우, ROUND_DOWN으로 작동하며, 음수인 경우 ROUND_UP으로 작동합니다. 
		
		ROUND_HALF_DOWN 
		버릴 부분이 .5보다 큰 경우 ROUND_UP으로 작동합니다. 그렇지 않은 경우, ROUND_DOWN으로 작동합니다. 
		
		ROUND_HALF_EVEN 
		버릴 부분의 왼쪽에 있는 자리가 홀수인 경우 ROUND_HALF_UP으로 작동하며, 짝수인 경우 ROUND_HALF_DOWN으로 작동합니다. 
		
		ROUND_HALF_UP 
		버릴 부분이 .5보다 크거나 같은 경우 ROUND_UP으로 작동하며, 그렇지 않은 경우 ROUND_DOWN으로 작동합니다. 
		
		ROUND_UNNECESSARY 
		"의사(pseudo) 올림 모드"는 실제로 요청된 작동이 정확한 결과를 갖는다는 선언이므로, 올림이 필요하지 않습니다. 
		
		ROUND_UP 
		항상 0이 아닌 버릴 부분 앞자리를 증가시킵니다. 
		*/
	}

}
