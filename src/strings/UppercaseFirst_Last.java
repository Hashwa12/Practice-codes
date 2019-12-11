package strings;

public class UppercaseFirst_Last {

	public static void main(String[] args) {
		
		String str = "abcde";
		
		String newstring = str.substring(0,1).toUpperCase()+str.substring(1, str.length()-1)+str.substring(str.length()-1).toUpperCase();
		
		System.out.println(newstring);
	}

}
