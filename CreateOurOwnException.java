package javaprogramms.logics;

public class CreateOurOwnException extends Exception{

	String message;
	
	public CreateOurOwnException(String str)
	{
		message=str;
	}
	public String toString()
	{
		return ("CustomeException");
	}
	
	
}
class MainException
{
	public static void main(String[] args) {
		
		try {
				throw new CreateOurOwnException("This is custoM EXCEPTION");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
