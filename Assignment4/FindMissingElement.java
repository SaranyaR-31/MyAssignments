package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FindMissingElement {


	public static void main(String[] args) {
		
		//declare the array
		Integer[] nums = {1, 2, 3, 4, 10, 6, 8};
		
		//Convert the array to list and sort
		List<Integer> numlist = new ArrayList<>(Arrays.asList(nums));
		numlist.sort(null);
		
		//List to store missing nos
		List<Integer> mislist = new ArrayList<>();
		
		//For loop
		for (int i = 0; i < numlist.size()-1; i++) {
			if (numlist.get(i) + 1 != numlist.get(i + 1)) {
				//There is the gap, add the missing number in mislist
				for (int j = numlist.get(i) + 1; j < numlist.get(i + 1); j++) {
					mislist.add(j);
				}
				
				
			}
			
		}
		System.out.println("Missing no.s are "+mislist);
		
	
	}

}

