
import java.util.*;

public class Tablice {

    public static void main(String[] args){
    	
    	Random los = new Random();
    	int[][] t1 = new int[10][10];
    
    	
    	for(int i=0; i<5; i++) {
    	
    	    for(int j=0; j<5; j++) {
    	        t1[i][j]=(i+1) * (j+1);
    			System.out.printf("%2d ",t1[i][j]);
    	    }		
    	    System.out.println();
    	 
    	}
    }  
}
    	
//tab[new Random().nextInt(tab.length)]);