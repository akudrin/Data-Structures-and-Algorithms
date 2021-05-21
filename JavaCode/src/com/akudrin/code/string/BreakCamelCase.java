package com.akudrin.code.string;

public class BreakCamelCase {

	public static String camelCase(String input) {

		int cnt = 0;
		int n = input.length();
		char ch[] = input.toCharArray();
		int res_ind = 0;
		int mid = 0;

		for (int i = 0; i < n; i++) {
			if (Character.toUpperCase(ch[i]) == ch[i]) {
				cnt++;
			}
		}

		char chArr[] = new char[input.length() + cnt];

		for (int i = 0; i < n; i++) {
			if (Character.toUpperCase(ch[i]) == ch[i]) {
				chArr[i + mid] = ' ';
				chArr[i + mid + 1] = ch[i];
				mid++;
				res_ind += 2;

			} else {
				chArr[res_ind++] = ch[i];
			}
		}

		return String.valueOf(chArr);

	}

	public static String camelCase2(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
		}
		return output;
	}

	public static String camelCase3(String input) {
		return input.replaceAll("([A-Z])", " $1");
	}

	public static void main(String[] args) {

		System.out.println(camelCase("camelCasingTest"));
		System.out.println(camelCase("caCasTest"));

	}

}
