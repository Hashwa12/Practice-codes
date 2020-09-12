package numbers;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random ran = new Random();
		int x = ran.nextInt(6) + 5;//range between 5-10
		System.out.println(x);

		double rand = Math.random();

		int x1 = (int) (rand * 10.0);//range between 0-9
		System.out.println(x1);
	}

}
