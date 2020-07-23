package all_concepts;

import java.util.Iterator;

public class SystemDate {

	public static void main(String[] args) {
//		System.out.println("Current time : "+java.time.LocalDateTime.now());

		String time = java.time.LocalTime.now().toString();
		String[] t = time.split(":");
		for (String string : t) {
			System.out.println(string);

		}
	}

}
