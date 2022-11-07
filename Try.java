package javaprogramms.logics;

public class Try {
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("Try");
			//System.exit(100);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Catch");
		}
		finally
		{
			System.out.println("Finals");
		}
	}

}
