package customexception;

public class Method {
	public static void validate(int age,int weight)throws InvalidbloodDonateException {
		if(age<18 && weight<55)
			throw new InvalidbloodDonateException("not eligible");
		else
			System.out.println("can donate blood");
	}

}
