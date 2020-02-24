package utils;

public final class ConvertUtil {
	public static String spliter(String s, int len, String delimiter) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int count = sb.length() - len;
		while(0 < count) {
			sb.insert(count, delimiter);
			count = count - len;
		}
		sb.reverse();
		return sb.toString();
	}
	
	public static <T extends Number> String binaryFormatter(T num) {
		Long number = 0L;
		if (num instanceof Integer) {
			number = Long.valueOf((Integer) num); 
		}
		if (num instanceof Long) {
			number = Long.valueOf((Long)num); 
		}
		return String.format("%32s", Long.toBinaryString(number)).replace(" ", "0");
	}
}
