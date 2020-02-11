package puzzle;

import utils.ConvertUtil;

public class Puzzle05 {

	public static void main(String[] args) {
		System.out.println(Integer.toHexString(19));
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		String binHex = ConvertUtil.binaryFormatter(0xcafebabe);
		System.out.println(ConvertUtil.spliter(binHex, 4, " "));
	}

}
