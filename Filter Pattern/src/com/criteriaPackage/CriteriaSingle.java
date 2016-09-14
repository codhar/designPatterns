package com.criteriaPackage;

import java.util.ArrayList;
import java.util.List;

import com.person.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePerson = new ArrayList<Person>();
		for(Person person : persons){
			if(person.getMaritalSatus().equalsIgnoreCase("single")){
				singlePerson.add(person);
			}
		}
		return singlePerson;
	}

}
