package basic;

public class replaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Selenium"; //Input String
		System.out.println("Input String "+string);	//Displaying Input String
		string = string.replaceAll("[AaEeIiOoUu]", "h"); //Replace vowels with star
		System.out.println(string);	//Display the word after replacement
		

	}

}
