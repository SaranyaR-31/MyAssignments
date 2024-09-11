package Assignment4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortingUsingCollection {

public static void main(String[] args) {
		//Declare the array
		String[] softCompanies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		//Array to List
		List<String> companyList = new ArrayList<String>(Arrays.asList(softCompanies));
		
		//Sort the company names
		Collections.sort(companyList);
		//using for loop print reverse order
		for (int i = companyList.size() - 1; i >= 0; i--) {
			System.out.print(companyList.get(i));
			if (i > 0) {
				System.out.print(", ");
			}
		}

	}

}



