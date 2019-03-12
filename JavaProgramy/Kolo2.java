

public class Kolo2 {

    public static void main(String[] args) {
    	
    	int[] r={5,4,5,1,2,6,7,9,1,2,3,4,1,1,2,4,6,7,8,4,4,1,10};
    	int[] p={5,2,1,11};
    	System.out.print(analizaDanych(r, "N"));
   
    }
    
 /*   public static boolean analizaDanych(int[] arr1, int[] arr2) {
    	
        
         for(int i=0;i<arr1.length; i++) {
             
             	if(arr1[i]!=arr2[i])
                     return false;
             
         }   return true;
    }
    
 */           	 
    
 /*   public static int[] analizaDanych(int[] arr, boolean wspak) {
    	
    	int[] reversedArray = new int[arr.length];
    	if(wspak==true)
    	
        for(int i = 0; i < arr.length; i++){
        reversedArray[i] = arr[arr.length - i - 1];
        }
        
        return reversedArray;
    	
    }
    */
    
 /*  public static int analizaDanych(int[] arr, int liczba) {
   	
   	      int suma=0;                     
          for (int i=0; i<arr.length; i++){
               if (liczba==arr[i]){
               suma++;
               }
          }
          return suma;
   }
   */
   
  public static int analizaDanych(int[] arr, String najczesciej) {
   	
   	   int temp;
         for (int i = 1; i < arr.length; i++) {
              for (int j = i; j > 0; j--) {
                   if (arr[j] < arr[j - 1]) {
                      temp = arr[j];
                        arr[j] = arr[j - 1];
                             arr[j - 1] = temp;
                     }
               }
          }
   	
   	
    int [] results = new int [40]; //Tablica w licznoœciami
    int licznik = 1;
    
   	if(najczesciej=="N")
 
        for (int i = 1; i < arr.length; i++) { //Zliczanie wyst¹pieñ
            if (arr[i] == arr[i-1]) {
                licznik = licznik + 1;
            } else {
                results [i-1] = licznik;
                licznik = 1;
            }
        }
        results [arr.length - 1] = licznik;
 
       
   	
   	
   	    
 /*  public static boolean analizaDanych(int[] arr) {
    	
    	if(5<=arr.length && arr.length<=10)
    		return true;
    	else
    		return false;	
    	
    }
    
  */
  
 /*   public static boolean analizaDanych(int[] arr,char test) {
    	
          if(test=='N') {
            int min=arr[0];
          	for(int i=0; i<arr.length; i++)
          		if(arr[i]<min)
          			min=arr[i];
          			return min>0;
          	      
          		   
          }	
          if(test=='S') {
          
          	int suma = 0;
            for (int i = 0; i < arr.length; i++) {
            	suma += arr[i];
            }
            
            if(suma<=100)
            	return true;
           	
          }	
          	
          return false;	
          	
    }  
    */
}