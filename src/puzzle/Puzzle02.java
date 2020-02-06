package puzzle;

public class Puzzle02 {

	public static void main(String[] args) {
		
		System.out.println(2.00 - 1.10);
		/*0.90을 반환해서 정확한 값을 반환하는것 처럼 보이지만 
		 * 실제로는 값을 반올림하는것이기에 정확한 계산이라 볼 수 없다.
		 * */
		System.out.printf("%.2f", 2.00 - 1.10);		
	}	

}
