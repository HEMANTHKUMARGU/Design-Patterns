package design.pattrens;

public interface ICar {

	void charr();

	void engine();
	
	default void newFeatures() {
		System.out.println("Lamborghini cars feature stunning design, exceptional performance,\r\n"
				+ " advanced technology, and exquisite interiors, with options for customization and \r\n"
				+ " limited editions.");
		
	}
	
	
	

}
