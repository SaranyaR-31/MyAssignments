package Assignment4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindIntersection {


public static void main(String[] args) {
		//Declare both arrays
		Integer[] array1 = {3, 2, 11, 4, 6, 7};
		Integer[] array2 = {1, 2, 8, 4, 9, 7};
		
		//convert the arrays as list
		List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
		
		//Compare
		List<Integer> intersectionNos = new ArrayList<>();
		for (Integer num : list1) {
			if (list2.contains(num)) {
				intersectionNos.add(num);
			}
			
		}
		
		System.out.println("Intersection numbers are "+intersectionNos);

	}

}


