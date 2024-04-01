package core;

public class Switchstatements {
	
	public static String hero="captain";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch(hero){
			case "iron man":
			    System.out.println ("guess my hero " +hero );
			    break;
			case "super man":
				System.out.println ("guess my hero" +hero);
				break;
			case "bat man":
				System.out.println ("guess my hero "+hero);
				break;
		    case "captain":
			    System.out.println ("guess my hero "+hero);
			    break;
			    default:
			    
					System.out.println ("guess my hero Not found ");
					break;
			}
	}
	}
	


