package design.pattrens;



class Singleton{
	private static Singleton instance;
	
private Singleton() {}
	public static Singleton getInstance()
	{
		if (instance == null)
		{
			instance =new Singleton();
		}
		return instance;
	}
	public void showMessage()
	{
		System.out.println("hello from Singleton!");
	}
	}
public class Singletonexam {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		
		singleton.showMessage();
		
		
	}

}
