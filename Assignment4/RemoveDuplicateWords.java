package Assignment4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String txt = ("We learn Java basics as part of java sessions in java week1");
		
		//split the words as array
		String[] words = txt.split(" ");
		
		// Initialize count to keep track of duplicates
        @SuppressWarnings("unused")
		int count = 0;

        // Nested loops to compare words and remove duplicates
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        words[j] = "";
                        count++;
                    }
                }
            }
        }

        // Create the modified string without duplicates
        String modifiedText = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                modifiedText += word + " ";
            }
        }

       // Print the modified string
        System.out.println(modifiedText);

	}

}



