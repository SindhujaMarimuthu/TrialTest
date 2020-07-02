package Scuba.javatraining;

public class InnerAndOuterClass {
private int age= 30;

private void outerMethod() {
	System.out.println(age++);
	System.out.println(++age);
}
	
class Inner{
	void innerMethod() {
		String name= "SCUBA";
		outerMethod();
		System.out.println("name is"+name+ "age is"+age);
		
	}
}
	public static void main(String args[]) {
		
	InnerAndOuterClass out = new InnerAndOuterClass();
	InnerAndOuterClass.Inner in = out.new Inner();
	
	in.innerMethod();
	
		
	}
}
