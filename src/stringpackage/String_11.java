package stringpackage;

public class String_11 {

	public static void main(String[] arg) {
		char[] c = {'A','M','A','N','U','L','L','A','H'};
		String s = new String(c);
		System.out.println(s);
		String name = "Aman Ullah Khalid";
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('A'));
		System.out.println(name.indexOf('z'));
		System.out.println(name.trim());
		boolean b = name.startsWith("A");
		System.out.println(b);
	}
}
