package puzzle;

public class Puzzle03 {

	public static void main(String[] args) {
		/*
		 * MICROS_PER_DAY �̹� ���� �������� �����÷ο찡 �߻��� ���� �߸��� ���� ��´�. 
		 * �׷��� ����� �߸��� ���� longŸ�� ������ MICROS_PER_DAY�� �����ع����� �ȴ�.
		 * ù��° ���ڸ� longŸ������ ��ȯ�ϰԵǸ� ������ ���ڵ���� ������ longŸ������ �����ϰ� �ǹǷ� �����÷ο츦 ������ �� �ִ�.
		 * (long) �Ǵ� L�� �ٿ��� longŸ������ ��ȯ�ϰ� ������ �ϸ� �ȴ�.
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
