package javaString;

public class RemovespecialChar {
public static	String s="!@#$%qwesdf2345$#%^&";

public static void sample() {
String t="";
	for (int i = 0; i <s.length(); i++) {
		char c = s.charAt(i);
		if (!(c>='a'&&c<='z'||c>='0'&&c<='9'||c>='A'&&c<='Z')) {
			t=t+c;
		}
		
	}
	System.out.println(t);

}

public static void main(String[] args) {
	sample();

}
}
