package design.pattrens;
interface Button
{
	public void  render();
}
class WindowsButton implements Button
{
	@Override
	public void render() {
		System.out.println("Rendring the windows Button");
		
	}
}
class MackButton implements Button
{
	@Override
	public void render() {
		System.out.println("Rendring the Mack Button");
		
	}
}

interface ButtonFactorys
{
	public Button CreateButton();
}

class WindowsFactory implements ButtonFactorys
{
	@Override
	public Button CreateButton() {
		return new WindowsButton();
		
		
	}
}
class MacFactory implements ButtonFactorys
{
	@Override
	public Button CreateButton() {
		
		return new MackButton();
	}
}
public class Abstractfactorypattrenexample {

	public static void main(String[] args) {
		
	ButtonFactorys factory=new WindowsFactory();
	Button Wbutton=factory.CreateButton();
	Wbutton.render();
	
    ButtonFactorys Mfactory=new MacFactory();
   Button Mbutton=Mfactory.CreateButton();
   Mbutton.render();
	

	}

}
