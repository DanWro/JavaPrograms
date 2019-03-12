

public class Gwiazdki {

    public static void main(String[] args) {
    	
    	System.out.print(analizaTekstu("UEK Krakow", "Rozstrzelony"));
    	
    }
    
    public static String analizaTekstu(String tekst, String format ) {
    	 
    	 
    	   if(format=="Rozstrzelony"){
    	   	  String a=tekst.replace(""," ").trim().replace("  ", " ");
                return a;
    	   }
    	   else
           return "èle";
    }
}
