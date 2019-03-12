import java.util.*;

public class zad24 {
        

    public static void main(String[] args) {
    	
      System.out.println("Symulacja 100 rzutów kostk¹ oraz wyliczenie ile razy wypadla ilosc oczek");
      Random los = new Random();
      int a = 0;
      int j = 0;
      int d = 0;
      int t = 0;
      int c = 0;
      int p = 0;
      int s = 0;
      for(int i=1; i<101; i++){
      	a = los.nextInt(6)+1;
      if(a==1){
        j++;
      } 
      if(a==2){
        d++;
       
      } if(a==3){
        t++;
        
      } if(a==4){
        c++;
       
      } if(a==5){
        p++;
      
      } if(a==6){
        s++;
       
      }
       	
      }
      System.out.println("Jedynka : " + j);
      System.out.println("Dwojka : " + d);
      System.out.println("Trojka : " + t);
      System.out.println("Czworka : " + c);
      System.out.println("Piatka : " + p);
      System.out.println("Szostka : " + s);
     } 
}
