import java.util.Scanner;
public class Three
{
     public static void main(String[] args) {
     	
     	Scanner roznica = new Scanner(System.in);
     	System.out.println("Wprowaadz roznice ciagu ");
     	int r = roznica.nextInt();
     	
     		
     	Scanner wyrazy = new Scanner(System.in);
     	System.out.println("ile wyrazow obliczyc? ");
     	int w = wyrazy.nextInt();
     	int ilosc = 0;
     	for(int i=0; i <= w; i++) {
     		ilosc = (ilosc += r);
     		System.out.println("Wyraz nr " + i + " ciagu o roznicy " + r + " wynosi " + ilosc);
     		
     		}	
     	}
     	
     }	
     	

