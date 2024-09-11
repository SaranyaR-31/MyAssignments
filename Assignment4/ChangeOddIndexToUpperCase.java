package Assignment4;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		
	String Text= "changeme";
	char[] charArray= Text.toCharArray();
	for (int i = charArray.length - 1; i >= 0; i--) {
		
		//check the odd index no
		if (i % 2!=0) {
			charArray[i] = Character.toUpperCase(charArray[i]);
		}
		
	}
	//convert the array to String back
	String finalText = new String(charArray);
	
	//print the finalText
	System.out.println(finalText);
}


}

