/**
 * @(#)TablicePo.java
 *
 *
 * @author 
 * @version 1.00 2019/1/25
 */


public class TablicePo {

    public static void main(String[] args) {
    
    	System.out.print(Od(3,10));
    	}
    
    
 public static int[] Od(int liczba1, int liczba2){
      
      
      int[] t1 = new int[100];
  	  for(int i=liczba1; i<=liczba2; i++){
    	    t1[i] = i ;	
         	}
         	
         	return t1;
     }
  
   
}