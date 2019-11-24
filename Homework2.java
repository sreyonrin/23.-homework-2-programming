package chapter4;
import java.util.*;
public class Homework2 {

	public static void main(String[] args) {

		
		
		String[] employee = {"Doung","Chan","Minea","Mesa","Romdoul","Veha","Por","Kanika"};
		int[] salary = { 700, 990, 500, 700, 190, 190, 990,700};
		
		System.out.println("............................");
		//get all employees who have the same salary
		Set duplicate = new HashSet();
		for (int i = 0; i < salary.length; i++) {
			for(int j = i + 1; j < salary.length; j++) {
				if (salary[i] == salary[j]) {
					if (!duplicate.contains(salary[j])) {
						duplicate.add(salary[j]);
						for(int k = 0; k <salary.length; k++) {
							if (salary[j] == salary[k]) {
								System.out.println(employee[k] + " : " + salary[k]);
							}
						}
					}
				}
			}
				
		}
		
		
	}

}
