package Scuba.javatraining;

//Class is a blueprint, without object no use for Class
public class Hello {

	static String name = "scuba"; //no object needs to use it only classname
	
	public String ResourceName;
	static String program;
	
	
	static String club  = "Maveric";

	public Hello (String name, String program) {
		this.name = name;
		this.program = program;
		
	
	}
	
	public void showDetails()
	{
		int count = 1;
		System.out.println("The name is:"+name);
		System.out.println("The program is:"+program);
		System.out.println("This is local variable under showDetails"+count);
	}		
//		
//		int salary = 100;
//		int pf = 20;
//		
//		void foo()
//		{
//			int number = 100;
//			System.out.println(number);
//			
//		}
		
//Constructor
	
	public Hello (int salary, int pf)
	{
		System.out.println("Salary:"+salary);
		System.out.println("pf:"+pf);
		
		
	}
	//Primitive: byte, short, int, long, float, double, char,
	
	//variables types: local, static, instance
	
	//Modifiers: Static,public, private
	
	//Operators: Arithmetic, relational, bitwise( & |), logical, assignment,
		//miscellaneous (eg: b = (a == 1) ? 20: 30), precendence (based on rules)
	
	
	
	}

