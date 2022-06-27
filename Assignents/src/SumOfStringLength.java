import java.util.Scanner;
public class SumOfStringLength {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      String A=sc.next();
	      String B=sc.next();
	  
	    System.out.println(A.length()+B.length());
	    if(A.compareTo(B)>0){
	    System.out.println("Yes");
	    }
	    else{
	    System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+Character.toUpperCase(B.charAt(0))+B.substring(1));
	    }
	}

}