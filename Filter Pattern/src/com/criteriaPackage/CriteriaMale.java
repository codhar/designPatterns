package com.criteriaPackage;

import java.util.ArrayList;
import java.util.List;

import com.person.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePerson = new ArrayList<Person>();
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("Male")){
				malePerson.add(person);
			}
		}
		return malePerson;
	}

}
