package com.actorClasses;

public class CompositePatternDemo {
	
	public static void main(String args[]){
		
		Employee ceo = new Employee("CEO", "Head", 12345);
		
		Employee salesHead = new Employee("SalesHead", "Sales", 12345);
		
		Employee marketHead = new Employee("MarketHead", "Marketing", 3456);
		
		Employee salesExecutive1 = new Employee("SalesExecutive1", "sales", 12344);
		
		Employee salesExecutive2 = new Employee("SalesExecutive2", "sales", 12344);
		
		Employee clark1 = new Employee("Clark1", "Marketing", 1234);
		
		Employee clark2 = new Employee("Clark2", "Marketing", 1234);
		
		ceo.add(marketHead);
		ceo.add(salesHead);
		
		marketHead.add(clark1);
		marketHead.add(clark2);
		
		salesHead.add(salesExecutive1);
		salesHead.add(salesExecutive2);
		
		System.out.println(ceo);
		
		for(Employee headEmployee : ceo.getSubordinates()){
			System.out.println(headEmployee);
			for(Employee employee : headEmployee.getSubordinates()){
				System.out.println(employee);
			}
		}
		
	}

}
