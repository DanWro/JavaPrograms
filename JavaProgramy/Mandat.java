import java.util.*;

public class Mandat {
        
    public static void main(String[] args) {
    	
       int l;
       int p;
       int m,M;
       int m1,M1;
       
       System.out.println("Podaj limit oraz predkosc : ");
       Scanner odczyt = new Scanner(System.in);
       
       l = odczyt.nextInt();
       p = odczyt.nextInt();
      
       m1=(p-l)*5;
       M1=((10*5)+(p-(l+10))*15);
       
       
       if( p - l < 10){
       	System.out.print("Mandat wynosi : " + m1 + "zl");
       }
       else{
       	System.out.print("Mandat wynosi : " + M1 + "zl");
       }	
       	 
       
       
    }
}
