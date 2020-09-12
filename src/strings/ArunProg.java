package strings;

import java.util.Scanner;

public class ArunProg {

	public static void main(String[] args) {

		System.out.println("Enter the input string...");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] ch = str.toCharArray();
		int num = 0;
		if (str.length() == 12) {
			if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
				if (str.charAt(str.length() - 1) == '$') {
					for (int i = 0; i < str.length(); i++) {
						if (Character.isDigit(ch[i]))
							num += 1;
					}
					if (num == 3) {
						System.out.println("Entered string is valid...");
					}
				}
			}
		} else {
			System.out.println("Please enter a valid string...");
		}
	}
}
