package superKeyword;

public class childConstructor extends parentConstructor {
	public childConstructor()
	{
		super();
		System.out.println("i m in child constructor");
	}

	public static void main(String[] args) {
		childConstructor cc=new childConstructor();
		// TODO Auto-generated method stub

	}

}
