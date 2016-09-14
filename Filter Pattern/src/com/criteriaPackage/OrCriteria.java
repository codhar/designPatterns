package com.criteriaPackage;

import java.util.List;

import com.person.Person;

public class OrCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		List<Person> secondCriteriaPersons = otherCriteria.meetCriteria(persons);
		firstCriteriaPersons.addAll(secondCriteriaPersons);
		return firstCriteriaPersons;
	}

}
