

public class AnalizaTekstu {
    
    


public static boolean analizaTekstu(String tekst) {
    	
    	int a=tekst.length();
       
    	return 5<a & a<30;
    		
    	
    }  
    	public static boolean analizaTekstu(String tekst, char test) {
    		
    		
    		if(test=='S') {
    	      if(tekst.contains(" "))
    		    return true;
    		   else 
    		   	return false; 
    		}
    		if(test=='C') {
    	      if(tekst.contains("0") || tekst.contains("1")||tekst.contains("2") || tekst.contains("3")||tekst.contains("4") || tekst.contains("5")||tekst.contains("6") || tekst.contains("7")||tekst.contains("8") || tekst.contains("9"))
    				return false; 
    		else 
    			return true;			
    					}	
            return false;    	 }
    		
  public static String analizaTekstu(String tekst, int N) {
   
        
      String str="";
      String[] a = tekst.split("");
        for(int i=0;i<N;i++){
            a[i]="*";
        }
        for(int j=0;j<a.length;j++){
            str+=a[j];
        }
        return str;
 }
    	
    	
    
    public static String analizaTekstu(String tekst, boolean wspak) {
    		
    			String [] tab = new String[13];
        tab[0]=tekst;
        if(wspak==true)
           for(int i=tab.length-1;i>=0;i--)
           {
//            String wynik = tab[0].charAt(i);
 
            
	       }      
	       	return "wynik";
    }
     
    public static String analizaTekstu(String tekst, String format) {
    	 
    	 
    	   if(format=="Rozstrzelony"){
    	   	  String a=tekst.replace(""," ").trim().replace("  ", " ");
                return a;
    	   }
    	   else
           return "èle";
    
 
    }
}	