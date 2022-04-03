import java.util.*;
import java.util.Scanner;

class Character{
	public static int TABLESIZE = 9;
	private String firstName;
	private String lastName;

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
		k = k % 9;
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

		Scanner scan = new Scanner(System.in);

		int index = 0;

		for (int i = 0; i < TABLESIZE; i++){

			System.out.print("Last name: \n");
			String lastName = scan.nextLine();
			System.out.print("First name: \n");
			String firstName = scan.nextLine();
			Character s1 = new Character(firstName, lastName);
			index = s1.key();

			while (hashtable[index] != null){

				System.out.println("Error: index is already filled");

				System.out.print("Last name: \n");
				lastName = scan.nextLine();
				System.out.print("First name: \n");
				firstName = scan.nextLine();
				s1 = new Character(firstName, lastName);
				index = s1.key();
			}

			hashtable[index] = s1;

			System.out.println("Character added into table");
		}

		System.out.println("Finished filling hash table!");

		System.out.print("Person to find by last name: ");

		String searchPerson = scan.nextLine();

		Character search = new Character("", searchPerson);

		System.out.println("Using brute force");

		long startTime = System.nanoTime();

		for (int i = 0; i < TABLESIZE; i++){

			if (hashtable[i].getLastName().compareTo(search.getLastName()) == 0){

				System.out.println("Index: " + i);

				i = 8;
			}
		}

		long endTime = System.nanoTime();

		long duration = (endTime - startTime) / 1000000;

		System.out.println("Time: " + duration + "ms");

		System.out.println("Hashing");

		startTime = System.nanoTime();

		index = search.key();

		if (hashtable[index].getLastName().compareTo(search.getLastName()) == 0){

			System.out.println(hashtable[index]);
		}

		endTime = System.nanoTime();

		duration = (endTime - startTime) / 1000000;

		System.out.println("Time: " + duration + "ms");

		//use this to test part 2!!! If it works, comment or delete
		//Character s1 = new Character("Anakin", "Skywalker");
		//System.out.println(s1);

		//insert other code here!!!
	}
}
















