import java.util.*;

public class SortowanieTablicy {
        
    public static void main(String[] args) {
        
        int a;
        int t;
        int[] tab = new int[10];
        Random los = new Random();
        for(int i=0; i<10; i++){
        
        	tab[i]=los.nextInt(100)+1;
        }		
         for(int i=1; i<=10; i++){
         
         	for(int j=0; j<10-i; j++){
         	
         	 	tab[j]=los.nextInt(100)+1;
         	 	
         	 	{
         	 	
        	       if(tab[j]>tab[j+1]){
                       t=tab[j];
                         tab[j]=tab[j+1];
                            tab[j+1]=t;
        	       }
               }
         	}
         }
              
          for(int i=0; i<10; i++)
          System.out.print(tab[i]+" ");
        
    }
}
