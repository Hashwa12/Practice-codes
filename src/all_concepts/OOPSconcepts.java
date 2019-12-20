package all_concepts;

public class OOPSconcepts {

	public static void main(String[] args) 
	{
		OOPSconcepts o1=new OOPSconcepts();
		OOPSconcepts o2=new OOPSconcepts();
		
		o1=null;
		o1=null;
		System.gc();
	}

	public void finalize() {
		
		System.out.println("Inside test1 method");
	}
}
