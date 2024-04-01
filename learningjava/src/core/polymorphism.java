package core;

public class polymorphism  extends gavevalue{
	
	public void wetalk(gavevalue speakingstyle) {
		System.out.println("we are polite!");
	}
	public void wetalk(constru speakingstyle) {
		System.out.println("we are dis...!");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		polymorphism talk=new polymorphism();
		gavevalue gavevalue=new gavevalue();
		talk.wetalk(gavevalue);

		constru constru=new constru();
		talk.wetalk(constru);

		//override//
		
		gavevalue son=new polymorphism();
		son.gavetome();
		
	}

}

//static ,compile,early binding (overloading)//
//dynamic ,run time,late binding (overriding)//