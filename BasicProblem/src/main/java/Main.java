public class Main {
    public static void main(String[] args) {
      //  String output = removeDuplicates(input);
       // System.out.println(output); // Output: qwerttrewq
        aa();
        removeDuplicates();
    }

    public static void removeDuplicates() {
        String input = "qwerttrewqwerew";
        String ii="ttrae";
        System.out.println(input.contains(ii));
        StringBuilder result = new StringBuilder();
        int consecutiveCount = 0;
result.append(input.charAt(0));

    for(int i=1;i<input.length();i++) {
    	consecutiveCount = 0;
    	 for (int j = result.length()-1; j>=0; j--) {
    		
   		 if(input.charAt(i)==result.charAt(j))
    		 {
  			 consecutiveCount++;	}   	 
   	 
   }if(consecutiveCount<2) {
		 result.append(input.charAt(i));
	 }
    }
        System.out.println(result.toString());
    }
    static void aa() {
    	String a="sasskkdjjkgjkgjjhggkjgcvbaasb";
    	StringBuffer r=new StringBuffer();
    	r.append(a.charAt(0));
    	int count=0;
    	for (int i = 1; i < a.length(); i++) {
    		count=0;
    		
    		for (int j =r.length()-1; j>=0; j--) {
    			if(a.charAt(i)==r.charAt(j)) {
    				count++;
    				
    			}	
    			
			
    		}if(count<2) {
				r.append(a.charAt(i));	
		}
		}
    System.out.println(r.toString());	
    }
    }
