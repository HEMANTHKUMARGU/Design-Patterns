package design.pattrens;
interface Shap
{
	void draw();
}

class Circle implements Shap
{
	@Override
	public void draw()
	{
		System.out.println("Its Circle object");
	}
}
class Rectangle implements Shap
{
	@Override
	public void draw()
	{
		System.out.println("Its Rectangle object");
	}
}
class Square implements Shap
{   @Override
	public void draw()
	{
		System.out.println("Its Square object");
	}
}

class FactoryObjects
{
	public static Shap getShap(String shaptype)
	{
		if(shaptype ==null)
		{
			return null;
		}
		if(shaptype.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		else if(shaptype.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		else if(shaptype.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		return null;
	}
}

public class Factorypatternexample {

	public static void main(String[] args) {
		try
		{
			FactoryObjects factory=new FactoryObjects();
			Shap shap1=factory.getShap("circle");
			if(shap1 !=null)
			shap1.draw();
			Shap shap2=factory.getShap("Rectangle");
			if(shap2 !=null)
			shap2.draw();
			Shap shap3=factory.getShap("Square");
			if(shap3 !=null)
			shap3.draw();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
