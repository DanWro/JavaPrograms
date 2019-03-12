

public class Samogloski {
	
	 public static void main(String[] args) {
	 	
	 	
	 	
	 	System.out.print(wl("D¹saæ"));
	 	
	 }
	 

   public static boolean wl(String slowo)
   	
   	
  {   
  	  boolean tak = slowo > 0;
      
      char znak_z_napisu; // zmienna do pobierania kolejnych liter z napisu
      for (int i = 0 ; i < slowo.length() ; i++) // przejœcie po napisie
      {
         
         if(slowo.charAt(i)=='a'||slowo.charAt(i)=='¹'||slowo.charAt(i)=='e'||slowo.charAt(i)=='ê'||slowo.charAt(i)=='i'||slowo.charAt(i)=='o')
          {                           // przekazywanym jako parametr
              System.out.print("Tak"); // zwiêkszamy wartoœæ zmiennej
          }
      }   
      return tak;
   }
}