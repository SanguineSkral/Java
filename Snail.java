public class Snail {
	int snailAge;
	
	public Snail(String name) {
	
		System.out.println("name chosen is :" + name );
	}
	
	public void setAge( int age ) {
		snailAge = age;
	}
	
	public int getAge( ) {
		System.out.println("Eagan's age is :" + snailAge );
		return snailAge;
	}
	
	public static void main(String []a) {
		
		Snail mySnail = new Snail( "Eagan" );
		
		
		mySnail.setAge( 1 );
		
		
		mySnail.getAge();
		
		
		System.out.println("Variable Value :" + mySnail.snailAge );
	}
}
