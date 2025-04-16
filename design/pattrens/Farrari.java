package design.pattrens;

public abstract class Farrari implements ICar {

	@Override
	public void charr() {
		System.out.println(" CHAR Urus:\r\n " + "A mechanic and a Ferrari fan, voiced by Tony Shalhoub. \r\n"
				+ "He is a yellow Fiat 500, known for his Italian accent and his passion for Ferrari. \r\n"
				+ "He is also a character in the movie Cars. ");

	}

	@Override
	public void engine() {
		System.out.println("ENGINE DETAILS:\r\n " + "Ferrari engines, renowned for their power and precision,\r\n"
				+ " feature a variety of configurations, including naturally aspirated V12 and V8,\n\r"
				+ " as well as turbocharged V8 and V6 engines, with some models incorporating hybrid technology");
	}
	@Override
	public void newFeatures() {
		System.out.println("Ferrari cars are known for their performance and luxury,\r\n"
				+ "and recent models like the 296 GTB and F80 feature advanced technologies,\r\n"
				+ " including hybrid systems, active suspension, and aerodynamic enhancements,\r\n "
				+ "all contributing to a unique driving experience. ");
		ICar.super.newFeatures();
	}

}
