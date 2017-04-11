package exceptions;

public class userexception {
	public static void validateAge(int age)throws Invalidageexception
	{
		if(age<18)
		{
			throw new Invalidageexception("Invalid Age::age less than 18 is not eligible for voting");
		}
		}
	public static void main(String[] args)
	{
		try
		{
			validateAge(13);
		}
		catch(Invalidageexception ex)
		{
			System.out.println("Exception Occured::"+ex.getMessage());
		}
	}

}
