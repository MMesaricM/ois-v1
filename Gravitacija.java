import java.util.*;

public class Gravitacija{
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		System.out.println("OIS je zakon!");
	}
		
	private static void izpis(double n) {
		System.out.printf("%f, %f", n, izracun(n));
	}
}