package c_control;

public class Ex04_for연습3 {

      public static void main(String [] args) {
    	  
    	  for(int i = 0 ; i < 26; i++) {
    		  for(char yo = 'Z'; yo >= 'A'+i; yo --) {
    			  System.out.print(yo);
    		  }
    		  System.out.println();
    	}
    		
      }
}