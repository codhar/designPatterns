package com.criteriaPackage;

import java.util.ArrayList;
import java.util.List;

import com.person.Person;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePerson = new ArrayList<Person>();
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("feMale")){
				femalePerson.add(person);
			}
		}
		return femalePerson;
	}

}
