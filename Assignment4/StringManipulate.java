package Assignment4;

  
public class StringManipulate {
	
	public static void main(String[] args) {
		//input the String
		String test = "I am a software tester";
		
		String[] eachWords = test.split(" ");
		
		//result String
		String result = "";
		
		//traverse each word with for loop
		for (int i = 0; i < eachWords.length; i++) {
			
			//find the odd index within the loop
			if (i % 2 != 0) {
				//convert the odd index as a new String
				char[] charArray = eachWords[i].toCharArray();
				
				//reverse the that particular array
				for (int j = charArray.length-1; j >= 0; j--) {
					result += charArray[j];
				}
			
			}
			else {
				//print the even position words as they are
				result += eachWords[i];
			}
			
			result += " ";			
			
		}
		System.out.println(result);
	}

}


	
	


