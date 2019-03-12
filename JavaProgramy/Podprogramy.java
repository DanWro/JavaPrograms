import java.util.*;


public class Podprogramy {
	
	public static void main(String[] args) {
		
	    int r = 120;	
		System.out.print(Tavlica());
	
	}
	  
	public static String Tavlica() {
		
	   String dzien;
       
     Scanner odczyt = new Scanner(System.in);
     System.out.print("Wprowadz dzien w skrocie (dwie pierwsze litery) : ");
       
      dzien = odczyt.next();
       
       if("pn".equals(dzien)) 
       	return "poniedzialek";
       else
        return "0";
       }  
      
       
		
    
    
    
}