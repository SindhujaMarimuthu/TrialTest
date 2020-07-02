package Scuba.javatraining;

public class StringFunction {

	public static void main(String[] args) {
		String str = "India is";
		str= str.concat("my country");
		
		//System.out.println(str);
		//System.out.println(str.equals("Scuba training"));
		
		String[] newString= str.split(" ");
		
		System.out.println(newString[0]); //Index starts with zero, space or special character is taken for inde
		
		System.out.println(str.length());
		
		System.out.println(str.contains("Se")); // This function is case sensitive
		
		System.out.println(str.indexOf('n'));
		
		
	}

}
