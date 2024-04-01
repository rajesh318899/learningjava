package core;

public class stringneed {
	
public static	String name="rajeshtony";
	int number=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(name.charAt(3));
		
		System.out.println(name.length());
		
		System.out.println(name.equals("dinesh"));
		
		System.out.println(name.equals("rajeshtony"));

		System.out.println(name.isEmpty());
		
		System.out.println(name.contains("a"));
		
		System.out.println(name.indexOf("e"));
		
		System.out.println(name.trim());
		
		System.out.println(name.concat("marvel"));
		
		System.out.println(name.replace("e","E"));
		
		String lowercase="rajeshtony";
		System.out.println(name.toUpperCase());
		
		System.out.println(String.join("/","31" ,"08","1999"));
		
		
	}

}
