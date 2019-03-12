import java.util.*;


public class Four {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile wyrazow ciagu podac ? " );
		int ilosc = sc.nextInt();
		int[] liczby = new int[ilosc];
		liczby[0] = 0;
		liczby[1] = 1;
		for(int i=2; i<ilosc; i++) {
			liczby[i] = liczby[i-2]+liczby[i-1];
		}
		for(int liczba:liczby) {
		
			System.out.print(liczba + " , ");
	}
	}
	
}