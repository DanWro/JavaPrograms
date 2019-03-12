/**
 * @(#)NextKolos1.java
 *
 *
 * @author 
 * @version 1.00 2019/2/21
 */


public class NextKolos1 {

    public static void main(String[] args){
    	
    	String t = " dA12niel wrona da*(niel wrona d";
    		System.out.print(analizaTekstu(t,true));
    	
        }
    	
 /*   public static boolean analizaTekstu(int tekst){
    	
    	 return 5<=tekst.length() && tekst.length()<=30;
    
    }
    */
    public static boolean analizaTekstu(String tekst, char test){
    	
    	if(test=='S'){
    		return tekst.contains(" ");
    	}
    	if(test=='C'){
    		if(tekst.contains("0") || tekst.contains("1") || tekst.contains("2") || tekst.contains("3") || tekst.contains("4") || tekst.contains("5") || tekst.contains("6") || tekst.contains("7") || tekst.contains("8") || tekst.contains("9"))  {
    		   return false;
    		} 
    			return true;
    	}
    	
    	return false;
    }
    
    public static String analizaTekstu(String tekst, int N){
    	
    	String a = tekst.substring(N);
    	String b = "*";
    	for(int i=0; i<N; i++){
    	    a=b+a;
    	}
    	return a;
    	
    }
    
    public static String analizaTekstu(String tekst,boolean wspak) {
    	
            char[] t = new char[tekst.length()];
    	    if(wspak==true){
    	    
    		for(int i=tekst.length()-1,j=0; i>=0 && j<tekst.length(); i--,j++){
    		   t[j]=tekst.charAt(i);
    		  
    		}
    		String k = String.valueOf(t);
    		return k;
    	    }
    	    return "k";
    }
    
    
    
}