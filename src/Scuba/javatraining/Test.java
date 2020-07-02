package Scuba.javatraining;

public class Test {

	public static void main(String[] args) {
		//Hello he= new Hello();
		//System.out.println(he.pf);
		//System.out.print(he.foo());
	Hello he2 = new Hello (10000,2200);
	
	System.out.println(Hello.name);
	
	Hello he3 = new Hello ("Sindhuja", "SCUBA");
	
	
	he3.showDetails();
	//error need to check System.out.println("This is an instance variable:" +he3.count);
	System.out.println("This is a static variable:"+he3.club);
	
	
	}

	
}
