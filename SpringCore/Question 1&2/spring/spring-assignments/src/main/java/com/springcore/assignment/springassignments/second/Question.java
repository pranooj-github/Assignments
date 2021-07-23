package com.springcore.assignment.springassignments.second;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
 int qustion_id;
 String question;
 Set<String> setAnswers;
 
 List<String> listAnswers;
 
 Map<Integer,String> mapAnswer;
 
public Question(int qustion_id, String question, Set<String> setAnswers,List<String> listAnswers,Map<Integer,String> mapAnswer) {
	super();
	this.qustion_id = qustion_id;
	this.question = question;
	this.setAnswers = setAnswers;
	this.listAnswers=listAnswers;
	this.mapAnswer=mapAnswer;
}
 public Set<String> showAnswersUsingSet()
 {
	 System.out.println("!***using set***!");
	 System.out.println(qustion_id+ " Q: "+question);
	 System.out.println("***************************");
	 System.out.println("Answers = "+setAnswers);
	 return setAnswers;
 }
 public List<String> showAnswersUsingList()
 {
	 System.out.println("!***using list***!");
	 System.out.println(qustion_id+ " Q: "+question);
	 System.out.println("***************************");
	 for (String string : listAnswers) {
		 System.out.println(string);
	}
	 return listAnswers;
 }
	 public Map<Integer,String> showAnswersUsingMap()
	 {
		 System.out.println("!***using Map***!");
		 System.out.println(qustion_id+ " Q: "+question);
		 System.out.println("***************************");
		 for (Map.Entry<Integer,String> entry: mapAnswer.entrySet()) {
			 System.out.println("Sequence Number: "+entry.getKey()+" answer : "+entry.getValue());
		}
		 return mapAnswer;
	 } 
 
@Override
public String toString() {
	return "Question [qustion_id=" + qustion_id + ", question=" + question + ", answers=" + setAnswers + "]";
}
 
 
}
