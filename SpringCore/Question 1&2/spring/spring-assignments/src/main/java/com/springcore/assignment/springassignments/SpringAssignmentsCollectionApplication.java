package com.springcore.assignment.springassignments;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.assignment.springassignments.second.Question;

public class SpringAssignmentsCollectionApplication {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(
				"setapplicationContext.xml")){
			Question question= applicationContext.getBean(Question.class);
			question.showAnswersUsingSet();
			question.showAnswersUsingList();
			question.showAnswersUsingMap();
			
		}
	}

}
