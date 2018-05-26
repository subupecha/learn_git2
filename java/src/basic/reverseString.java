package basic;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="rahul";
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
        	t=t+s.charAt(i);
        }
        System.out.println(t);
        
	
	 if(s==t)
     {
     	System.out.println("its a palindrome");
     }
	 else
	 {
		 System.out.println("its not a palindrome");
	 }
		 	
	

	
}
}