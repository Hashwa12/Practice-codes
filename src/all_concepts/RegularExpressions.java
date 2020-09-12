package all_concepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
//		System.out.println("Enter values: ");
//		Scanner in = new Scanner(System.in);
//		String str = "ABC abc 123 !@#";
//		String email = "hashwa1992@gmail.com";//[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+
		String password = "@Thimena19";
		String phno = "8122103121";

//		str = str.replaceAll("[^a-zA-Z0-9\\s]", "");
//		System.out.println(str);
//		
//		int num = 0;
//		num = Integer.parseInt(str.replaceAll("[^0-9]", ""));
//		System.out.println(num);
//		
//		String caps = null;
//		caps=str.replaceAll("[^A-Z]", "");
//		System.out.println(caps);
//		
//		String small = null;
//		System.out.println(small=str.replaceAll("[^a-z]", ""));
//		
//		if(email.equals("[a-zA-Z0-9]+@gmail.com"))
//		{
//			System.out.println("Matches");
//		}
//		else {
//			System.out.println("Enter valid email....");
//		}
		regexphone(phno);
		regexpassword(password);
	}

	public static void regexphone(String str) {
		boolean flag = false;
		String phoneregx = "\\d";
		Pattern pMatch = Pattern.compile(phoneregx);

		Matcher m = pMatch.matcher(str);

		if (m.find()) {
			System.out.println("Mobile number is Valid...");
		} else {
			System.out.println("Enter valid Mobile number!!!");
		}
	}

	public static void regexpassword(String str) {
		String passregex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		Pattern p = Pattern.compile(passregex);

		Matcher m = p.matcher(str);
		if (m.find()) {
			System.out.println("Password is Valid...");
		} else {
			System.out.println("Please enter valid Password!!!");
		}
	}

}
