import java.util.*;

class Character{
	public static int TABLESIZE = 9;
	private String firstName;
	private String lastName;
	private int age;

	// Constructor: Do not touch
	public Character(String fn, String ln){
		firstName = fn;
		lastName = ln;
	}

	// Function key()
	// Should return the proper index to place the specific Character
	// into the hash table
	// Use the first letter of the last name and modulus to find the proper index
	public int key(){
		// for now, returns the ascii value of first character of last name
		int k = lastName.charAt(0);
		return k;
	}

	// the details of the specific Character when you print it. Do not touch
	public String toString(){
		String str = "Last name: " + lastName;
		str += "\nFirst name: " + firstName;
		str += "\nHash Table Key: " + key();
		return str;
	}
	
	public String getLastName(){
		return lastName;
	}




	public static void main(String[] args){
		Character[] hashtable = new Character[TABLESIZE]; // empty hashtable


		//use this to test part 2!!! If it works, comment or delete
		Character s1 = new Character("Anakin", "Skywalker");
		System.out.println(s1);


		//insert other code here!!!
		
		
	}


}















