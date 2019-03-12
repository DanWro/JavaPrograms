public class MyClass {
    
   public static void main(String[] args){
	    
	    int[] tablica1 = {1, 2, 3}, tablica2 = {1, 2, 4};
	    tab([1, 2, 3],  [1, 2, 3]);
	    System.out.println(tab(tablica1, tablica2));

	}
	public static boolean tab(int[] a, int[] b) {
	    
		if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
			return true;
			
		} else {
			return false;
		}
	}	
}