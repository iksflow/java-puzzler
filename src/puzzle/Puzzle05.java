package puzzle;

import utils.ConvertUtil;

public class Puzzle05 {

	public static void main(String[] args) {
		/* 0x100000000L + 0xcafebabe 의 연산결과로 1cafebabe가 나올 것 같다.
		 * 하지만 실제로 연산의 결과는 cafebabe로 출력되게 된다.
		 * 1. 0x100000000L + 0xcafebabe 의 연산은 Long + Int 의 연산이다. 따라서 0xcafebabe는 Long타입으로 변환된다.
		 * 	  
		 *    1111111
		 *    ffffffffcafebabe
		 * +  0000000100000000
		 * ------------------- 
		 *   100000000cafebabe
		 *   
		 * long 타입으로 변환하고 나면 ffffffffcafebabe로 변환이 되는데 음수이기에 빈칸을 f로 채우게된다. 
		 * 그 후 연산을 하게되면 자리수를 넘어가는 1이 나오게 되는데, 자리수가 넘어가므로 버리게 된다.
		 * 따라서 최종 연산결과는 00000000cafebabe = cafebabe 가 되는것이다.
		 */
		System.out.println("0x100000000L + 0xcafebabe = " + Long.toHexString(0x100000000L + 0xcafebabe));
//		String binHex = ConvertUtil.binaryFormatter(0xcafebabe);
//		System.out.println(ConvertUtil.spliter(binHex, 4, " "));
		System.out.println("[long과 int의 연산]");
		System.out.println(String.format("%16s", Long.toHexString(0xcafebabe)).replace(" ", "0"));
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L)).replace(" ", "0"));
		System.out.println("----------------");
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L + 0xcafebabe)).replace(" ", "0"));
		
		System.out.println("[long과 long의 연산]");
		System.out.println(String.format("%16s", Long.toHexString(0xcafebabeL)).replace(" ", "0"));
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L)).replace(" ", "0"));
		System.out.println("----------------");
		System.out.println(String.format("%16s", Long.toHexString(0x100000000L + 0xcafebabe)).replace(" ", "0"));
		
		System.out.println(Integer.valueOf(0xcafebabe));
		System.out.println(Long.valueOf(0xcafebabeL));
	}

}
