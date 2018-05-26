package superKeyword;

public class childVariable extends parentVariable {
	String name="QAclickAcademy";
	public void getData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childVariable cv=new childVariable();
		cv.getData();
				
				
		

	}

}
