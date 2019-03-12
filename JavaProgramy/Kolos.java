


public class Kolos {
	
	public static void main(String[] args){
		
		int[] arr = {1,2,3,0,10};
		System.out.print(analizaTablicy(arr,10));
		}
		

	

    public static boolean analizaTablicy(int[] arr) {
    	
    	return arr[arr.length-2]<100;
    	
    	
    }
    
    public static boolean analizaTablicy(int[] arr, char test) {
    
    	if(test=='Z'){
    		for(int i=0; i<arr.length; i++)
    			if(arr[i]==0)
    				return false;
    	}
        if(test=='S'){
    		int a = 0;
    		for(int i=0; i<arr.length; i++)
    			a+=arr[i];
    			if(a<10)
    				return false;
    	}
    	return true; 
    }
   

    public static int analizaTablicy(int[] arr, boolean najwieksza){
    	
    	int a=arr[0];
    	if(najwieksza==true)
    	
    		for(int i=0; i<arr.length; i++)
    			if(arr[i]>a)
    				a=arr[i];
    			      return a;
    }


   public static boolean analizaTablicy(int[] arr, double liczba){
   	
   	    int a = 0;
   	    for(int i=0; i<arr.length; i++){
   	    
   	    	a+=arr[i];
   	    	if(a/arr.length>liczba)
   	    		return true;
   	    }
   	
   	        return false;
   } 

}