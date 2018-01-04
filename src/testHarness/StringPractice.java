package testHarness;

public class StringPractice {

	public static void main(String[] args) {
		String s = "chicken";
		System.out.println(s.trim());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("ck"));
		System.out.println(s.replace("k", "r"));
		System.out.println(s.replace("ch", "ai"));
		System.out.println(s.replaceAll("c", "s"));
		System.out.println(s.replaceFirst("n", "m"));
	}
}
