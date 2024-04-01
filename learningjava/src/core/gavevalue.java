package core;

public class gavevalue {
	
	int collected=200;
	
	public int gavetome() {
		System.out.println("daddy have collected rupee " +collected );
		return collected;
	}
	
	//return value//
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gavevalue myson=new gavevalue();
		int amount=myson.gavetome();
		System.out.println("daddy have collected rupee " +amount );	

	}

}
