
public class InsertionSort {

	public static void insertionSort(char[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) {
			char cur = data[k];
			int j = k;
			while (j > 0 && data[j - 1] > cur) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = cur;
		}
	}

	public static int points(String[] games) {
		int sum = 0;

		for (String s : games) {
			char x = s.charAt(0), y = s.charAt(2);

			sum += x > y ? 3 : x == y ? 1 : 0;
		}

		return sum;
	}

	public static void main(String[] args) {
		char[] arr = { 'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F' };
		insertionSort(arr);
		System.out.println(arr);

		int r = points(new String[] { "3:1", "2:2", "0:1" });
		System.out.println(r);

	}

}
