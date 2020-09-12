package all_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Schooll {
	int stu_id;
	protected static String name;
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int Social;
	private int Totalmarks;

	public static int tot;
	static String gradecode;
	private ArrayList<String> hmap;
	static float per;
	static String k;
	static int ii;
	static Schooll a = new Schooll();

	static ArrayList<String> al1 = new ArrayList<>();
	static TreeMap<Float, String> tm = new TreeMap<Float, String>();
	static Scanner in = new Scanner(System.in);
	static ArrayList<String> g_A = new ArrayList<>();
	static ArrayList<String> g_B = new ArrayList<>();
	static ArrayList<String> g_C = new ArrayList<>();
	static ArrayList<String> g_D = new ArrayList<>();
	static Map.Entry<Float, String> pairs;
	static Set set;
	static Iterator i1;

	public void Schooll1(String name, int tot) {

		float avg = tot / 5;

		if (avg >= 75.00) {
			gradecode = "A";
			g_A.add(name);
			System.out.println("Maths-Bio group students:");
			System.out.println(name + "'s grade " + gradecode);
		} else if (74.00 >= avg && avg >= 60.00) {
			gradecode = "B";
			g_B.add(name);
			System.out.println("Biology:");

			System.out.println(name + "'s grade " + gradecode);
		} else if (59.00 >= avg && avg >= 40.00) {
			gradecode = "C";
			g_C.add(name);
			System.out.println("Computer Science:");
			System.out.println(name + "'s grade " + gradecode);
		} else {
			gradecode = "D";
			g_D.add(name);
			System.out.println("Commerce:");
			System.out.println(name + "'s grade " + gradecode);
		}
	}

	public void attend(String name) {

		System.out.println("Enter the number of working days: 250");
		System.out.println("enter the present days of " + name);

		int work = in.nextInt();

		per = (float) (work * 100 / 250);

		System.out.println("perecentage of  " + name + "=" + per);
		tm.put(per, name);

	}

	public void exam(String name, float perr) {

		if (perr > 75) {
			System.out.println("Enter the 11th mark of " + name);
			int tot1 = in.nextInt();
			float avg1 = tot1 / 6;

			if (avg1 > 75.00) {
				gradecode = "A";
				System.out.println(name + "got A grade in XI");
			} else if (75.00 <= avg1 && avg1 > 60.00) {
				gradecode = "B";
				System.out.println(name + "got B grade in XI");
			} else if (60.00 <= avg1 && avg1 > 40.00) {
				gradecode = "C";
				System.out.println(name + "got C grade in XI");
			} else {
				gradecode = "D";
				System.out.println(name + "got D grade in XI");
			}
		} else {
			System.out.println(name + " not eligible");
		}

	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// using arraylist for admission page

		System.out.println(
				"Our school is the best C.B.S.E private school, under Top 10. We provide best facilities and best Results with Top class Infrastructure and also we have boardings available for Students.");
		System.out.println("OUR BEST SERVICE FOR YOUR KIDS");
		System.out.println("******************************");
		al.add("LIBRARY");
		al.add("DIGITAL CLASSROOM");
		al.add("COMPUTER LAB");
		al.add("SCIENCE LAB");
		al.add("SPORTS FACILITIES");
		al.add("ARTS AND CRAFTS");
		al.add("BUS FACILITIES");
		System.out.println(al);
		System.out.println("ADMISSION OPEN");

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		for (int j = 0; j <= 3; j++) {
			System.out.println("Enter the Student ID");
			int a = in.nextInt();
			System.out.println("Enter the Student name");
			String b = in.next();
			hmap.put(a, b);
		}
		System.out.println(hmap);

		for (int k1 = 1001; k1 < 1005; k1++) {
			k = hmap.get(k1);

			System.out.println("\nEnter the 10th marks of " + k);
			int total = in.nextInt();

			a.Schooll1(k, total);
		}

		gradeMethod(g_A, "a");
		gradeMethod(g_B, "b");
		gradeMethod(g_C, "c");
		gradeMethod(g_D, "d");

		set = tm.entrySet();
		i1 = set.iterator();
		while (i1.hasNext()) {
			pairs = (Map.Entry) i1.next();
			if (pairs.getKey() < 75.0) {
				System.out.println(pairs.getKey() + "\t" + pairs.getValue() + "\t (Not Eligible)");
			} else {
				System.out.println(pairs.getKey() + "\t" + pairs.getValue());
			}
		}
		Set set1 = tm.entrySet();
		Iterator i2 = set1.iterator();
		while (i2.hasNext()) {
			pairs = (Map.Entry) i2.next();
			if (pairs.getKey() >= 75.0) {
				a.exam(pairs.getValue(), pairs.getKey());
			}
		}
	}

	public static void gradeMethod(ArrayList<String> list, String val) {
		if (!(list.isEmpty())) {
			switch (val) {
			case "a":
				System.out.println("Attandance for Students in Grade \"A\"");
				break;
			case "b":
				System.out.println("Attandance for Students in Grade \"B\"");
				break;
			case "c":
				System.out.println("Attandance for Students in Grade \"C\"");
				break;
			case "d":
				System.out.println("Attandance for Students in Grade \"D\"");
				break;
			}
			for (int ind = 0; ind < list.size(); ind++) {
				a.attend(list.get(ind));
			}
		}
	}
}
