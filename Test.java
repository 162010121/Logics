package javaprogramms.logics;

public final  class Test{
	
	final String userName;
	
	public Test(String userName)
	{
		this.userName=userName;
	}

	public String getUserName() {
		return userName;
	}
	
}
class Demo
{
	public static void main(String[] args) {
		
		Test im=new Test("FPQPP6012H");
		String s=im.getUserName();
		System.out.println("PanCardNumber:"+s);
	}
}
