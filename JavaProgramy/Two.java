import java.util.*;
 
public class Two{
  public static void main(String[] args){
  	
  	             
                 	
                Random r = new Random();
                int[] suma = new int[11];
                    for(int i=0; i<100; i++) {
                     int random = r.nextInt(10) + 21;
                     suma[random-20] += 1;
                    }  
                       for(int i=20,x=0;i<=30;i++) {
                       	        x++ ;
                       	
                    	System.out.println("Warto�� : " + i + " : wyst�pi�a " + suma[x] + " razy ");
                          
                        }
                       }
                     
  }

