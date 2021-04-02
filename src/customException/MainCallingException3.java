package customException;

public class MainCallingException3 
{
	static void validateAge(int age) throws MyException
	{
		if(age<18)
			throw new MyException("Under Age");
		else
			System.out.println("Valid Age");
	}
	
	public static void main(String[] args) throws MyException 
	{
		
			validateAge(12);
			validateAge(19);
		
	}

}
