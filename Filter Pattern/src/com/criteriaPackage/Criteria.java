package com.criteriaPackage;

import java.util.List;

import com.person.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
