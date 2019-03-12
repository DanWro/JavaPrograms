/**
 * @(#)PotegiPyton.java
 *
 *
 * @author 
 * @version 1.00 2019/2/18
 */


public class PotegiPyton {

    public static void main(String[] args){
    	
    int[] arr = {6,4,5,2,2,3,6,2,2,4,4,4,4};
    int M=0;
    int T=0;	
   // int n = arr.length; 
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
      
      System.out.print(dominanta+ " " + maks);
    }
}