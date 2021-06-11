import java.util.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n ;
		System.out.println("Ingrese n");
		n =scanner.nextInt();
		int lo=1, hi=n;
		while(lo < hi){
			int mi=(lo + hi + 1) / 2;
			if(mi * mi <= n){
				lo=mi;
			}else{
				hi=mi - 1;
			}
		}
		System.out.println("La raiz cuadrada de "+""+n+""+" es "+""+lo);
	}
}
