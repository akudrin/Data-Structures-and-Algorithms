package con.akudrin.epi;

public class Chapter5 {

	public static void main(String[] args) {
		// bit wise
		System.out.println(6 & 4);
		System.out.println(1 | 2);
		System.out.println(8 >> 1);
		System.out.println(-16 >>> 2);
		System.out.println(1 << 10);
		// min max for numeric types
		System.out.println(Integer.BYTES);
		System.out.println("Integer max value: " + Integer.MAX_VALUE + " Integer min value: " + Integer.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.SIZE);

		// box-types
		System.out.println(Double.valueOf("1.23"));
		System.out.println(Float.toString(-1.23f));

		System.out.println(Double.compare(2.5, 3.5));

		// Math API
		System.out.println(Math.abs(-34.5));
		System.out.println(Math.ceil(2.17));
		System.out.println(Math.floor(3.14));
		System.out.println(Math.pow(2.71, 3.14));

		// interconvert integer
		System.out.println(Character.getNumericValue('\uFF21'));
		char c = 'A';
		System.out.println();
		int value = (int) c;

		System.out.println(value);

		System.out.println('\u04FC');
		System.out.println('\u6771');
		System.out.println('\u1040');
		System.out.println('\uD801');

	}

}
