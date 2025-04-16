package design.pattrens;

public abstract class Lamborghini implements ICar {
	@Override
	public void charr() {
		System.out.println("They pay attention to even the finest of details to streamline each model \r\n "
				+ "and make them incredibly aerodynamic. One of the best and fastest Lamborghinis ever produced is the Veneno,\r\n"
				+ " which can accelerate from 0-60 mph in just 2.8 seconds");

	}

	@Override
	public void engine() {
		System.out.println("New Lamborghini models like the Lamborghini Aventador offer a pure,\r\n"
				+ "naturally aspirated V12 engine that pays homage to the rich history of this\r\n"
				+ " iconic powertrain. Whether you're interested in an Aventador coupe or roadster,\r\n"
				+ " you can find a V12-equipped vehicle that perfectly matches your wildest driving desire");

	}
	
	

}
