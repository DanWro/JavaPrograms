


public class tablica {

    public static void main(String[] args) {
    	
    	int liczba1 = -4;
    	int liczba2 = 6;
    	int[] arr = new int[(liczba2-liczba1)+1];
    	for(int i=0,j=liczba1; i<arr.length && j<=liczba2; i++,j++){
    		
    		arr[i]=j;
    		System.out.print(arr[i]+" ");
    		
    	}
    	
    }
    
}
