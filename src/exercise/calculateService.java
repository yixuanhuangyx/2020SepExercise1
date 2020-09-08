package exercise;

import java.math.BigDecimal;
import java.util.List;

public class calculateService {

	public static BigDecimal calculate(final List<Employee> employees) {
		 
		return employees.stream()
		.filter(employee -> !employee.isIntern()) // check if the employee is non-intern
		.map(employee -> calculeValidatedEarningSum(employee.getEarnings())) // calculate the sum of employee's validated earnings
		.map(earningsSumFloat -> new BigDecimal(Float.toString(earningsSumFloat)))
		.filter(earningsSum -> earningsSum.multiply(new BigDecimal("2.5")).compareTo(new BigDecimal("1014.00")) > 0)
//		.filter(earningsSum -> earningsSum * 2.5f > 1014.00f) // check if the earning amount pass the min wage limit
//		.map(validatedSum -> new BigDecimal(Float.toString(validatedSum * 0.06f))) // convert the validated sum to BigDecimal and multiply by 6%
		.map(validateSum -> validateSum.multiply(new BigDecimal("0.06")))
		.reduce(BigDecimal.ZERO, BigDecimal::add); // calculate the result for all employees	
	}
	
	private static float calculeValidatedEarningSum(List<Earning> earnings) {
		return earnings.stream()
				.filter(earning -> earning.getType().isValidatedType()) // check the type of the earning
				.map(validatedEarning -> validatedEarning.getAmount())
				.reduce(0.0f, (res,amount) -> res + amount); // calculate the sum
	}
}
