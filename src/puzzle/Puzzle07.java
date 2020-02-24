package puzzle;

import utils.ConvertUtil;

public class Puzzle07 {

	public static void main(String[] args) {
		int x = 1984;
		int y = 2001;
		
		System.out.println("x bin: " + Integer.toBinaryString(x));
		System.out.println("y bin: " + Integer.toBinaryString(y));
		
		System.out.println(x);
		x ^= y ^= x;
		System.out.println(x);
		System.out.println("result bin: " + Integer.toBinaryString(x));
		System.out.println(ConvertUtil.binaryFormatter(x));
	}

}
