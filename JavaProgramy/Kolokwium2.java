/**
 * @(#)Kolokwium2.java
 *
 *
 * @author 
 * @version 1.00 2019/1/25
 */


public class Kolokwium2 {

    public static void main(String[] args) {
    	
    	int[] t1 = {1,2,4,5,4,10,4};
    	int[] t2 = {1,2,3,5,10};
    	System.out.print(analizaDanych(t1,4));
        
    }
    
    public static boolean analizaDanych(int[] arr) {
    	
    	return 5<arr.length && arr.length<11;
    	
    }
    
   public static boolean analizaDanych(int[] arr, char test) {
   	   
   	  int min=arr[0];
   	  if(test=='N'){
   	     for(int i=0; i<arr.length; i++)
   	  		if(arr[i]<min)
   	  			min=arr[i];
   	  			return min>0;
   	  }
   	  if(test=='S'){
   	  	int suma=0;
   	  	for(int i=0; i<arr.length; i++)
   	  		suma = suma + arr[i];
   	  		return suma<100;
   	  }
      return false;	
   }
   
  public static boolean analizaDanych(int[] arr1, int[] arr2) {
  	
         for(int i=0; i<arr1.length; i++){
  	     	 if(arr1[i]!=arr2[i])
  			   return false;
  	    }
  	    return true;
   }
   
   public static int[] analizaDanych(int[] arr, boolean wspak) {
   	
   	int[] reverse = new int[arr.length];
   	
   	if(wspak==true)
   		for(int i=arr.length-1; i>=0; i--){
         	reverse[i]=arr[i];
        }
    return reverse;          
   	
   }
   
   public static int analizaDanych(int[] arr, int liczba){
   	
   	int N = 0;
   	for(int i=0; i<arr.length; i++) {
   		if(arr[i]==liczba)
   			N++;
    }
   	 
   	return N;
   }
   
   
}