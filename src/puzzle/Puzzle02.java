package puzzle;

import java.math.BigDecimal;

public class Puzzle02 {

	public static void main(String[] args) {
		
		System.out.println(2.00 - 1.10);
		/*0.90�� ��ȯ�ؼ� ��Ȯ�� ���� ��ȯ�ϴ°� ó�� �������� 
		 * �����δ� ���� �ݿø��ϴ°��̱⿡ ��Ȯ�� ����̶� �� �� ����.
		 * */
		System.out.printf("%.2f\n", 2.00 - 1.10);		
//		System.out.println(BigDecimal("1"));
		System.out.println(new BigDecimal("2").multiply(new BigDecimal("3")));
	}	

}
