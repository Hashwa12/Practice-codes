package numbers;

public class PhoneNumber {

	public static void main(String[] args) {

		String num = "8122103121";
		char[] str = num.toCharArray();
		String even = null, odd = null;

		for (int i = 0; i < num.length(); i++) {
			if (str[i] % 2 == 0) {
				if (even == null)
					even = Character.toString(str[i]);
				else
					even += Character.toString(str[i]);
			} else {
				if (odd == null)
					odd = Character.toString(str[i]);
				else
					odd += Character.toString(str[i]);
			}
		}

		System.out.println("Odd digits in the given phone numbers are :" + odd);
		System.out.println("Even digits in the given phone numbers are :" + even);
	}

}
