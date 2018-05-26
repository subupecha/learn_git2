package basic;

public class replaceVowels1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Susmita Prusti";
		System.out.println("input "+string);
		string=string.replaceAll("[AaEeIiOoUu]", "h");
		 String string1=string.replace( "s", "g"); 
		System.out.println("replaced String "+string);
		System.out.println("replaced String1 "+string1);
		

	}

}
