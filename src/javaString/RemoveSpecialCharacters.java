package javaString;

public class RemoveSpecialCharacters {
public static void main(String[] args) {
	

	String s="!@#$Babu %^12345&*!@#4Greens123#$%^";
	
	s=s.replaceAll("[\\w\\s]","");
	System.out.println(s);
}
}