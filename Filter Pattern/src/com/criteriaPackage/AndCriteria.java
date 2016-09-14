package com.criteriaPackage;

import java.util.List;

import com.person.Person;

public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPerson = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPerson);
	}

}
