package puzzle;

import utils.ConvertUtil;

public class Puzzle05 {

	public static void main(String[] args) {
		/* 0x100000000L + 0xcafebabe �� �������� 1cafebabe�� ���� �� ����.
		 * ������ ������ ������ ����� cafebabe�� ��µǰ� �ȴ�.
		 * 1. 0x100000000L + 0xcafebabe �� ������ Long + Int �� �����̴�. ���� 0xcafebabe�� LongŸ������ ��ȯ�ȴ�.
		 * 	  
		 *    1111111
		 *    ffffffffcafebabe
		 * +  0000000100000000
		 * ------------------- 
		 *   100000000cafebabe
		 *   
		 * long Ÿ������ ��ȯ�ϰ� ���� ffffffffcafebabe�� ��ȯ�� �Ǵµ� �����̱⿡ ��ĭ�� f�� ä��Եȴ�. 
		 * �� �� ������ �ϰԵǸ� �ڸ����� �Ѿ�� 1�� ������ �Ǵµ�, �ڸ����� �Ѿ�Ƿ� ������ �ȴ�.
		 * ���� ���� �������� 00000000cafebabe = cafebabe �� �Ǵ°��̴�.
		 */
		System.out.println("0x100000000L + 0xcafebabe = " + Long.toHexString(0x100000000L + 0xcafebabe));
//		String binHex = ConvertUtil.binaryFormatter(0xcafebabe);
//		System.out.println(ConvertUtil.spliter(binHex, 4, " "));
		System.out.println("[long�� int�� ����]");
		System.out.println(String.format("%16s", Long.toHexString(0xcafebabe)).replace(" ", "0"));
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L)).replace(" ", "0"));
		System.out.println("----------------");
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L + 0xcafebabe)).replace(" ", "0"));
		
		System.out.println("[long�� long�� ����]");
		System.out.println(String.format("%16s", Long.toHexString(0xcafebabeL)).replace(" ", "0"));
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L)).replace(" ", "0"));
		System.out.println("----------------");
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L + 0xcafebabe)).replace(" ", "0"));
		
		System.out.println(Integer.valueOf(0xcafebabe));
		System.out.println(Long.valueOf(0xcafebabeL));
	}

}
