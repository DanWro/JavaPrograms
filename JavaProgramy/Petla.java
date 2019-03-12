import java.util.*;

public class Petla {
        
    public static void main(String[] args) {
        
        String[] tab =  new String[1];
        System.out.print("Wpisz wyraz : ");
        Scanner wczytaj = new Scanner(System.in);
        String tekst = wczytaj.next();
        
	       tab[0]=tekst;
	       for(int i=tekst.length()-1; i>=0; i--){
	           
	           
               System.out.print(tekst.charAt(i));
           
	       }
    }
}
