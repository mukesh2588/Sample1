package customException;

public class MainCallingException2 
{
	static void validateAge(int age) throws MyException
	{
		if(age<18)
			throw new MyException("Under Age");
		else
			System.out.println("Valid Age");
	}

	public static void main(String[] args) 
	{
		try {
			validateAge(12);

		}
		catch (MyException e)
		{
			System.out.println("Exception occured: "+e);
			//e.printStackTrace();
		}

	}

}
