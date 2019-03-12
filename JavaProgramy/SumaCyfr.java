/**
 * @(#)SumaCyfr.java
 *
 *
 * @author 
 * @version 1.00 2019/1/26
 */


public class SumaCyfr {

    public static void main(String[] args) {
    	
    	int a=1398;
    	int s=0;
    	
    	while(a>0){
    	
    		s=s+a%10;
    	    a=a/10;
    	}  	
    	
    	System.out.print(s);
    }
    
    
}

     public static boolean analizaDanych(int[] arr) {
    	
    	if(5<=arr.length && arr.length<=10)
    		return true;
    	else
    		return false;	
    	
    }
    
      public static boolean analizaDanych(int[] arr,char test) {
    	
          if(test=='N'){
          
          	int min=arr[0]; 
          	for(int i=0; i<arr.length; i++)
          	    if(arr[i]<min)
          	    	min=arr[i];
          	    	return min>0;
          }	
          if(test=='S') {
          
          	double suma = 0;
            for (int i = 0; i < arr.length; i++) {
            	suma += arr[i];
            }
            
            if(suma<100)
            	return true; 
          }	
          	
          return false;	
          	
    }  
    	
  public static boolean analizaDanych(int[] arr1, int[] arr2) {
    	
        
         for(int i=0;i<arr1.length; i++) {
             
             	if(arr1[i]!=arr2[i])
                     return false;
             
         }   return true;
    }
          
    
    public static int[] analizaDanych(int[] arr, boolean wspak) {
    	
    int[] reverse = new int[arr.length];
   	
   	if(wspak==true)
   	for(int i=arr.length-1; i>=0; i--){
            reverse[i] = arr[arr.length - 1 - i];
        }
        
        return reverse;
	}        
   	
    
    public static int analizaDanych(int[] arr, int liczba){
    
          int I=0;
          for(int i=0;i<arr.length; i++) {
              if(liczba==arr[i])
              	I++;
           }
           return I;
     }
     
     public static int analizaDanych(int[] arr, String najczesciej) {
     	
     	if(najczesciej=="N")
     	
     		for (int i = 0; i < arr.length; i++) {
        
            for (int j = 0; j < arr.length-1; j++) {
            
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    	
                }
            }
            }
    
        int dominanta = 0;
		int maks = 0;
		int licznik = 0;

		for (int i = 0; i < arr.length; i++) {
			licznik = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					licznik++;
					if (licznik > maks) {
						dominanta = arr[i];
						maks = licznik;
					}
				}

			}
   
      }
      
      return dominanta;
    }