package com.criteriaDemo;

import java.util.ArrayList;
import java.util.List;

import com.criteriaPackage.AndCriteria;
import com.criteriaPackage.Criteria;
import com.criteriaPackage.CriteriaFemale;
import com.criteriaPackage.CriteriaMale;
import com.criteriaPackage.CriteriaSingle;
import com.criteriaPackage.OrCriteria;
import com.person.Person;

public class CriteriaDemoMain {
	
	public static void main(String args[]){
		List<Person> persons = new ArrayList<Person>();

	     persons.add(new Person("Robert","Male", "Single"));
	     persons.add(new Person("John", "Male", "Married"));
	     persons.add(new Person("Laura", "Female", "Married"));
	     persons.add(new Person("Diana", "Female", "Single"));
	     persons.add(new Person("Mike", "Male", "Single"));
	     persons.add(new Person("Bobby", "Male", "Single"));
	     
	     Criteria male = new CriteriaMale();
	     Criteria female = new CriteriaFemale();
	     Criteria single = new CriteriaSingle();
	     Criteria singleMale = new AndCriteria(male, single);
	     Criteria singleOrFemale = new OrCriteria(single, female);
	     
	     System.out.println("Male : ");
	     printPerson(male.meetCriteria(persons));
	     
	     System.out.println("Female : ");
	     printPerson(female.meetCriteria(persons));
	     
	     System.out.println("Single Person : ");
	     printPerson(single.meetCriteria(persons));
	     
	     System.out.println("Single Male : ");
	     printPerson(singleMale.meetCriteria(persons));
	     
	     System.out.println("Single Or Women : ");
	     printPerson(singleOrFemale.meetCriteria(persons));
	     
	     
	}
	
	public static void printPerson(List<Person> persons){
		for(Person person : persons){
			System.out.println(" Person Name : "+person.getName()+" Gender : " +person.getGender()+ " MaritalStatus : "+person.getMaritalSatus());
		}
	}

}
