package _06_minion;


public class TeaParty {
	
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		
		
		if(isWoman==false && isKnighted==false) {
    	   return "Hello Mr. " + name;
       }
       
       else if(isWoman==true && isKnighted==false) {
    	   return "Hello Ms. " + name;
       }
		
       else if(isWoman==false && isKnighted==true) {
    	   return "Hello Sir " + name;
       }
       
       else if(isWoman==true && isKnighted==true) {
    	   return "Hello Lady " + name;
       }
       
		return "";
    }
    
	public static void main(String[] args) {
		
	}
	
	
	}




	    
