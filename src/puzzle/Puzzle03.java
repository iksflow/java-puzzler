package puzzle;

public class Puzzle03 {

	public static void main(String[] args) {
		/*
		 * MICROS_PER_DAY 이미 연산 과정에서 오버플로우가 발생한 다음 잘못된 값을 얻는다. 
		 * 그렇게 얻어진 잘못된 값을 long타입 변수인 MICROS_PER_DAY에 저장해버리게 된다.
		 * 첫번째 숫자를 long타입으로 변환하게되면 나머지 숫자들과의 연산을 long타입으로 수행하게 되므로 오버플로우를 방지할 수 있다.
		 * (long) 또는 L을 붙여서 long타입으로 변환하고 연산을 하면 된다.
		 */
//		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
//		final long MICROS_PER_DAY = (long)24 * 60 * 60 * 1000 * 1000;
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println("MICROS_PER_DAY : " + MICROS_PER_DAY);
		System.out.println("MILLIS_PER_DAY : " + MILLIS_PER_DAY);
		System.out.println("INTEGER_MAX : " + Integer.MAX_VALUE);
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
	}

}
