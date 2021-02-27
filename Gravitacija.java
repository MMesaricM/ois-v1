import java.util.*;

public class Gravitacija{
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		System.out.println("OIS je zakon!");
	}
		
	private static double izracun(double nadmorska) {
		double a = ((6.674 * Math.pow(10, -11)) * (5.972 * Math.pow(10, 24))) / (Math.pow(((6.371 * Math.pow(10, 5)) + nadmorska), 2));
		return (a);
	}
	
	private static void izpis (double nadmorska){
		System.out.printf("%f, %f", nadmorska, izracun(nadmorska));
	}
		
}