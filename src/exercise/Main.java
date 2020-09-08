package exercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Earning e1 = new Earning(typeEnum.type1, 1000.00f);
		Earning e2 = new Earning(typeEnum.type2, 101.00f);
		Earning e3 = new Earning(typeEnum.type3, 302.00f);
		Earning e4 = new Earning(typeEnum.type4, 1003.00f);
		Earning e5 = new Earning(typeEnum.type5, 1004.00f);
		Earning e6 = new Earning(typeEnum.type6, 1005.00f);
		Earning e7 = new Earning(typeEnum.type7, 1006.00f);

		List<Earning> listEarning1 = new ArrayList<>();
		listEarning1.add(e1);		
		listEarning1.add(e4);
		listEarning1.add(e5);
		listEarning1.add(e6);

		List<Earning> listEarning2 = new ArrayList<>();
		listEarning2.add(e2);
		listEarning2.add(e3);
		listEarning2.add(e7);
		
		Employee employee1 = new Employee(listEarning1, false);
		Employee employee2 = new Employee(listEarning2, false);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		BigDecimal res = calculateService.calculate(employees);
		System.out.println("The result expected: 120.18; The result obtained: " + res);

	}
	
}
