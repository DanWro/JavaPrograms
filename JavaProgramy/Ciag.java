import java.util.Scanner;

public class Ciag {
	
        public static void main(String[] args) {
 
 
        Scanner sc = new Scanner(System.in);
        System.out.print("wprowadz ciag 5 cyfr ");
          
            
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           int d = sc.nextInt();
           int e = sc.nextInt();
           int i1,i2,i3,i4,i5;
         
           
           i1 = a-3;
           i2 = b-3;
           i3 = c-3;
           i4 = d-3;
           i5 = e-3;
           System.out.println("ciag cyfr - 3 : " + i1 + " "  + i2 + " " + i3 + " " + i4 + " " + i5);
           
 }
}