/**
 * @(#)kolos5.java
 *
 *
 * @author 
 * @version 1.00 2019/2/18
 */


public class kolos5 {

    public static void main(String[] args) {
    	
    	int[] i = {1,3,32,455,5,625};
    	int[] j = {2,3,5,7,8,6,1};
    	int k = 2;
    	int h = 6;
    
    	
    	System.out.print(analizaLiczby(k,h,j));
    	
    }
    
    public static boolean analizaImion(String imie){
    	
    	return imie.length()>3;
    	
    }
    
    public static boolean analizaImion(String imie, char poprawnosc){
    	
    	if(poprawnosc=='S'){
    		if(imie.contains(" ")){
               return false;
    	    }
    	    return true;
    	 }
    	 return false;
    }
    
    public static String analizaImion(String imie1, String imie2, String imie3){
    	
    	int a,b,c;
    	a=imie1.length();
    	b=imie2.length();
    	c=imie3.length();
    	if(a>b && a>c){
    	
    		return imie1;
    	}
    	if(b>a && b>c){
    	
    		return imie2;
    	}
     	if(c>a && c>b){
     	
     		return imie3;
     	}	
    	return "zle";		
    	}
    	
    public static int analizaImion(String imie, String[] imiona){
    	
    	int a=0;
    	for(int i=0; i<imiona.length; i++){
    		if(imie==imiona[i])
    			a++;
    	}  
    	return a;	  	
    }
    
    public static char[] analizaImion(String imie, int N){
    	
    	char[] ch = new char[N];
    	for(int i=0; i<N; i++){
    	    ch[i]=imie.charAt(i);
    	    
    	}
    	return ch;
    }
    
    public static int analizaImion(String[] imiona1, String[] imiona2){
    	
    	int ile=0;
    	for(int i=0,j=0; i<imiona1.length && j<imiona2.length; i++,j++){
    		if(imiona1[i]==imiona2[j])
    			ile++;
    		
    	}
    	return ile;
    	
    }
    
    public static String analizaImion(String imie, String separator){
    	
    	String a,c,B,P,C,R,K,K1;
    	a = imie.substring(0,1);
    	c = imie.substring(1);
    	B=a.toUpperCase();
    	R=c.toLowerCase();
    	P=B.concat(R);
    	K=P.replace("",separator);
    	K1=K.substring(separator.length(),K.length()-separator.length());
    	return K1;
    	
    }


 /*   public static int[] analizaTablicy(int[] arr1, int[] arr2) {
    	
    	int[] arr3 = new int[arr1.length];
    	for(int i=0; i<arr1.length; i++){
    		if()
    			arr3[i]=arr1[i];
    			System.out.println(arr3[i]);
    			
    		}
    		
    		
    	}   
    		return arr3;
    }
    */
    public static int[] analizaTablicy(int[] arr, int cyfra){
    	
    	int s=0;
    	int[] arr1 = new int[arr.length];
    	for(int i=0; i<arr.length; i++){
    		while(arr[i]>0) {
    		s=s+(arr[i]%10);
    		arr[i]=arr[i]/10;
    		if(arr[i]!=cyfra){
    			arr1[i]=arr[i];
    			System.out.println(arr1[i]);
    		}
    		}
    	}
    	return arr1;
    	
    }
    
    public static int[] analizaLiczby(int liczba1, int liczba2, int[] arr){
   	
   	
   
   	for(int i=0; i<arr.length; i++){
        if(liczba1<=arr[i] && arr[i]<=liczba2){
   		    arr[i]
   		
   		}
   	}
   	int[] tab2 = new int[j];
   	    j=0;
   		for(int i=0; i<tab.length; i++){
   			if(liczba1<=tab[i] && tab[i]<=liczba2){
   				tab2[j]=tab[i];
   				j++;
   		}
   
   	}  
   	 
   		return tab2;
   		
    
    }
    	
 }

    	
   
