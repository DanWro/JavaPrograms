import java.util.*;


public class tabele {
	public static void main(String[] Args) {
	
                Random r = new Random();
                int[] suma = new int[11];
                    for(int i=0; i<100; i++) {
                     int random = r.nextInt(11) +20 ;
                     suma[random-20] += 1;
                    } 
                    for(int i=20,x=0;i<=30;i++,x++) {
                    	System.out.println("Wartoœæ : " + i + " : wyst¹pi³a " + suma[x] + " razy ");
                          
                   }
                        
   }
}