package puzzle;

import utils.ConvertUtil;

public class Puzzle07 {

	public static void main(String[] args) {
		int x = 1984;
		int y = 2001;
		System.out.println("x before value: " + x);
		System.out.println("y before value: " + y);
		x ^= y ^= x ^= y;
		System.out.println("x after value: " + x);
		System.out.println("y after value: " + y);
		System.out.println("x bin: " + Integer.toBinaryString(x));
		System.out.println("y bin: " + Integer.toBinaryString(y));
		
		int x1 = 1984;
		int y1 = 2001;
		x1 = x1 ^ y1;
		y1 = y1 ^ x1;
		x1 = y1 ^ x1;
		System.out.println("change x1: " + x1);
		System.out.println("change y1: " + y1);
		
		int x2 = 1000;
		System.out.println(x2 ^ x2);
//		x ^= y ^= x;
//		System.out.println(x);
//		System.out.println("result bin: " + Integer.toBinaryString(x));
//		System.out.println(ConvertUtil.binaryFormatter(x));
	}

}
