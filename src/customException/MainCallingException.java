package customException;

public class MainCallingException {

	public static void main(String[] args) 
	{
		try
		{
			throw new MyException("MK Exception");
		}
		
		catch(MyException ex)
		{	
			System.out.println("Exception is Caught");
			System.out.println(ex.getMessage());
		}
		

	}

}
