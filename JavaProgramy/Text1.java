/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2019/2/18
 */


public class Text1 {

    public static void main(String[] args) {
    	
    	int N = 3;
    	String B,P,C,R,K,K1;
    	String separator = "!";
    	// b = pierwsza litera, c = pozostale litery, B = pierwsza litera Du¿a, R = reszte liter malych, P - poloczany wyraz
    	char[] ch = new char[N];
    	String a = "daNielwrOna";
    	String b = a.substring(0,1);
    	String c = a.substring(1);
    	B=b.toUpperCase();
    	R=c.toLowerCase();
    	P=B.concat(R);
    	K=P.replace("",separator);
    	K1=K.substring(1);
    	
    	System.out.print(K1);
       
    }
}