import java.util.*;
public class Huff {

	    	 public static void main(String args[]){
	    	        Scanner sc= new Scanner(System.in);
	    	        System.out.println("Enter a sentence");
	    	        String s= sc.nextLine();
	    	        String[] array= new String[s.length()];
	    	        int[] asciiArray = new int[256];
	    	       
	    	        for(int x=0;x<s.length();x++){
	    	             array[x]=Integer.toBinaryString((int)s.charAt(x));
	    	             int n= (int)s.charAt(x);
	    	             asciiArray[n]=asciiArray[n]+1;
	    	             
	    	             while(array[x].length()!=7){
	    	                 array[x]="0"+array[x];
	    	             }
	    	             System.out.print(array[x]+" ");
	    	        }
	    	         System.out.println("\n");
	    	       
	    	        for(int x=0; x<256;x++){
	    	            if(asciiArray[x]!=0){
	    	                char c= (char)x;
	    	                System.out.println("'"+c+"' appeared "+asciiArray[x]+" times" );
	    	            }
	    	            
	    	        
	    	        System.out.println(asciiArray[x]/s.length() );
	    	        }

	    }

	}


