import java.util.*;

public class Pyton {

    public static void main(String[] args){
    	
    
        String pesel;
        int[] tab  = new int[11];
    	System.out.println("Podaj PESEL: ");
    	Scanner in = new Scanner(System.in);
    	pesel = in.next();
    	
    	int rok = Integer.parseInt(pesel.substring(0,2));
    	int plec = Integer.parseInt(pesel.substring(9,10));
    	
    	
    	int wiek = 2018 - (1900+rok);
    	System.out.println("Wiek : " + wiek);
    	if(plec%2==0){
    	
    	System.out.print("kobieta");
    	}
    	else{
    		System.out.print("mezczyzna");
    	}
    
    }
    	
    
    
}