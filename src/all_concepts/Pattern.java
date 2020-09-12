package all_concepts;

public class Pattern {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		System.out.println("______________________________");
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j >i; j--) {
				System.out.print("*");
			}System.out.println("");
		}
		System.out.println("______________________________");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <=3-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("* ");
			}System.out.println("");
		}
		System.out.println("______________________________");
		int num =0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <=3-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print(num+++" ");
			}System.out.println("");
		}
		System.out.println("______________________________");
		

	}

}
