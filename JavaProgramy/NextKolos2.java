/**
 * @(#)NextKolos2.java
 *
 *
 * @author 
 * @version 1.00 2019/2/21
 */


public class NextKolos2 {

    public static void main(String[] args){
    	
    	int[] arr1 = {1,6,5,3,3,4};
    	int[] arr2 = {-1,2,33,3,4};
    	System.out.print(analizaDanych(arr1,"N"));
    }
    
    public static boolean analizaDanych(int[] arr){
    	
    	return 5<=arr.length && arr.length<=30;
    	
    }
    
    public static boolean analizaDanych(int[] arr, char test){
    	
    	if(test=='N'){
    		int min=arr[0];
    		for(int i=0; i<arr.length; i++){
    			if(arr[i]<=0){
    				return false;
    			}
    			return true;
    		}
    		
    	}
    	double s=0;
    	if(test=='S'){
    		for(int i=0; i<arr.length; i++){
    			s+=arr[i];
    		}
    			if(s<100)
    				return true;
    		}
    	
    	return false;
    	
    }
    
    
    public static boolean analizaDanych(int[] arr1, int[] arr2){
    	
    	
    	for(int i=0; i<arr1.length; i++){
    		
    		if(arr1[i]!=arr2[i]){
    			return false;
    		}
    	}
    	return true;
    }
    
    public static int[] analizaDanych(int[] arr, boolean wspak){
    	
    	int[] odw = new int[arr.length];
    	for(int i=arr.length-1; i>=0; i--){
    		odw[i]=arr[arr.length - 1 - i];
    	}
    	
    	return odw;
    	
    }
    
    public static int analizaDanych(int[] arr, int liczba){
    	
    	int s = 0;
    	for(int i=0; i<arr.length; i++){
    		if(arr[i]==liczba){
    			s++;
    		}
    	}	
    		return s;
    }
    
    public static int analizaDanych(int[] arr, String najczesciej){
    	
    	int t = 0;
    	if(najczesciej=="N")
    	
    	
    	for(int i=0; i<arr.length; i++){
    		for(int j=0; j<arr.length-1; j++){
    			if(arr[j]>arr[j+1]){
    			
    				t=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=t;
    			}
    				
    		}
    		
    	}
    
    	int d = 0;
    	int l = 0;
    	int m = 0;
    	for(int i=0; i<arr.length; i++){
    		l=0;
    		for(int j=0; j<arr.length; j++){
    			if(arr[i]==arr[j]){
    				l++;
    			     if(l > m){
    			     	d=arr[i];
    			     	m=l;
    			     }		
    			}
    		}
    	}
    
    	
    	
    	return d;
    	
    	
    }
}