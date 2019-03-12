import java.util.*;

public class RzutKostkaProcenty {
        
    public static void main(String[] args) {
        
        Random los = new Random();
        int a;
        double sn=0;
        double sp=0;
      
        for(int i=0; i<1000; i++){
        	a=los.nextInt(50)+1;
        	
        	if(a%2==0){
        		sp++;
        	}
        	if(a%2!=0){
        		sn++;
        	}
        	 
        }
       
        System.out.println("Liczby parzyste: " + sp/10 + "%");
        System.out.println("Liczby nieparzyste: " + sn/10 + "%");
      
    }
}
