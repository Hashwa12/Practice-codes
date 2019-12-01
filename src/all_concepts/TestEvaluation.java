package all_concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEvaluation {

	public static void main(String[] args) throws FileNotFoundException
	{
//		File obj = new File("D:\\Hashwanth\\Programs\\1.Java\\Others\\Test\\doc.txt");
//		System.out.println("Read the text from the file");
//		Scanner in = new Scanner(obj);
//		while (in.hasNextLine()) {
//			System.out.println(in.nextLine());
//		}
//		List<Integer> in = new LinkedList<Integer>();
//		in.add(10);
//		in.add(20);
//		in.add(100);
//		in.add(200);
//		System.out.println(in);
//		System.out.println(in.remove(0));
//		in.add(0,1000);
//		System.out.println(in);
		
//		String str="java";
//		for(int i=0;i<str.length();i++)
//			System.out.println(str.charAt(i)+":"+i);
		
//		System.out.println("enter the string");
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		System.out.println(str.toLowerCase());
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.size());
		
		}

}
