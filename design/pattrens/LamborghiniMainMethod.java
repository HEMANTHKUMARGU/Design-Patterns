package design.pattrens;

public class LamborghiniMainMethod {

	public static void main(String[] args) {
		LamborghiniBaseCarclass	lamborghinibaseclass=new LamborghiniBaseCarclass();
		System.out.println("--------------*********------------");
		lamborghinibaseclass.baseVerent();
		System.out.println("-------");
		lamborghinibaseclass.charr();
		System.out.println("-------");
		lamborghinibaseclass.engine();
		System.out.println("-------");
		lamborghinibaseclass.newFeatures();
		System.out.println("--------------*******------------");
		
		LamborghiniTopVerentClass lamborghinitopverentclass=new LamborghiniTopVerentClass();
		System.out.println("-------------*******-------------");
		lamborghinitopverentclass.topEndFeturs();
		System.out.println("-------");
		lamborghinitopverentclass.charr();
		System.out.println("-------");
		lamborghinibaseclass.engine();
		System.out.println("-------");
		lamborghinitopverentclass.newFeatures();
		System.out.println("-------------*******-------------");
		
		 LamborghiniAutomaticClass lanborghiniauttomaticclass=new LamborghiniAutomaticClass();
		 System.out.println("--------------******------------");
		 lanborghiniauttomaticclass.charr();
		 System.out.println("-------");
		 lanborghiniauttomaticclass.engine();
		 System.out.println("-------");
		 lanborghiniauttomaticclass.newFeatures();
		 System.out.println("-------------******-------------");

	}

}
