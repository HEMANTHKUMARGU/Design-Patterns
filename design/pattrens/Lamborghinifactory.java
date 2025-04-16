package design.pattrens;

public class Lamborghinifactory {
	
	public ICar objects(String Name)
	{
		if(Name.equalsIgnoreCase("Null"))
		{
			return null;
		}
		if(Name.equalsIgnoreCase("LamborghiniBaseCarclass"))
		{
			return new LamborghiniBaseCarclass();
		}
		else if(Name.equalsIgnoreCase("LamborghiniTopVerentClass"))
		{
			return new LamborghiniTopVerentClass();
		}
		else if(Name.equalsIgnoreCase("LamborghiniAutomaticClass"))
		{
			return new LamborghiniAutomaticClass();
		}
		
		return null;
	}

}
