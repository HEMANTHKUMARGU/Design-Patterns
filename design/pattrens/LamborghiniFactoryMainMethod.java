package design.pattrens;

public class LamborghiniFactoryMainMethod {

	public static void main(String[] args) {
		Lamborghinifactory factory = new Lamborghinifactory();
		ICar factoryBase = factory.objects("LamborghiniBaseCarclass");
		System.out.println("----------*****-----------");
		factoryBase.charr();
		System.out.println("-----------");
		factoryBase.engine();
		((LamborghiniBaseCarclass)factoryBase).baseVerent();
		System.out.println("----------*****-----------");

		ICar factoryTop = factory.objects("LamborghiniTopVerentClass");
		System.out.println("----------*****-----------");
		factoryTop.charr();
		System.out.println("------------");
		factoryTop.engine();
		System.out.println("----------*****-----------");

	}

}
