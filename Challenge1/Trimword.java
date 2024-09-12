package Challenge1;

public class Trimword {
	 public static int lengthoflastword(String s) {
		int len=0;
		String x=s.trim();
		for(int i=0; i<x.length();i++) {
			if (x.charAt(i)==' ')
				len=0;
			else 
					len++;
				
			}
				
		 return len;
	}
	public static void main(String[] args) {
		String s= "I am a Software Tester";
		@SuppressWarnings("unused")
		Trimword trim=new Trimword();
		System.out.println("The Given Sentence is = "  +s);
		String lastWord = s.substring(s.lastIndexOf(" ")+1);
		System.out.println("Last word: "+lastWord); 
		System.out.println("The length of the word is "+Trimword.lengthoflastword(s));
	}

}
