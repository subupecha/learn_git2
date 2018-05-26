package superKeyword;

public class childMethod extends parentMethod {
	public void getData()
	{
		super.getData();
		System.out.println("i m in child calss");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childMethod cm=new childMethod();
		cm.getData();

	}

}
