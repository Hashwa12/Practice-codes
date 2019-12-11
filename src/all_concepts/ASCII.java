package all_concepts;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ASCII {

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		String[] name= {"I", "EE"};
		int a=name.length;
				int ascii = 0;
				int b=0;//int temp,temp1;
char character;
		for(int i=0;i<a;i++)
		{
			String ch=(String) name[i];
			System.out.println(ch);
			int le=ch.length();
			for (int j = 0; j < le; j++)
			{
				character = ch.charAt(j);
				ascii=(int)character;
				
				b=b+ascii;
				System.out.println(ascii);
			}
			System.out.print(b);
//			System.out.println("");
//		int i=100;
//		char  ascii = (char)i;
//		System.out.println(ascii);
//		String text = "ABCDEFGHIJKLMNOP"; 
//byte[] bytes = text.getBytes("US-ASCII"); 
//System.out.println("ASCII value of " + text + " is following"); 
//System.out.println(Arrays.toString(bytes));

		}
	}

}
