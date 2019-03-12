
import java.util.Random;


public class InstrukcjeSterujace {
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,4,5};
		System.out.print(Tab(arr));
	}
	
	public static int[] Tab(int[] arr){
		
		int[] reversedArray = new int[arr.length];
    	
        for(int i=0; i<arr.length; i++){
            reversedArray[i] = arr[arr.length - i - 1];
            System.out.print(reversedArray[i]);
        }
        
      return reversedArray;
	}
		
		
}
	