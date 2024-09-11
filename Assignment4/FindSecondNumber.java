package Assignment4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FindSecondNumber {
	
	public static void main(String[] args) {
			//declare the array
			Integer[] nums = {3, 2, 11, 4, 6, 7};
			
			//convert to list and sort
			List<Integer> numlist = new ArrayList<>(Arrays.asList(nums));
			numlist.sort(null);
			
			//logic to find the second largest from the numlist
			int seclarge = numlist.get(numlist.size()-2);
			System.out.println("The second largest number in the list is " + seclarge);
			

		}

	}


