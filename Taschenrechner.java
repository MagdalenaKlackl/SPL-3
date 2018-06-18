
public class Taschenrechner {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		int zahl = Integer.parseInt(args[0]);
		int zahl1 = Integer.parseInt(args[2]);
		
		if (args[1].equals("+")) {
			System.out.println(zahl + " + " + zahl1 + " = " +(zahl + zahl1));
		} else if (args[1].equals("-")) {
			System.out.println(zahl + " - " + zahl1 + " = " +(zahl - zahl1));
		} else if (args[1].equals("*")) {
			System.out.println(zahl + " * " + zahl1 + " = " +(zahl * zahl1));
		} else if (args[1].equals("/")) {
			System.out.println(zahl + " / " + zahl1 + " = " +(zahl / zahl1));
		}
	}
}