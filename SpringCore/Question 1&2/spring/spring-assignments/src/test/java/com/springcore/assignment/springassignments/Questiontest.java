package com.springcore.assignment.springassignments;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springcore.assignment.springassignments.second.Question;
import java.util.List;
import java.util.Map;
@RunWith(SpringRunner.class)

@ContextConfiguration(locations="/setApplicationContext.xml")
public class Questiontest {
	@Autowired
	Question question;

	@Test
	public void testSet() {
		Set<String> expected= new HashSet<>();
		expected.add("1.Jack Fruit");
		expected.add("2.Mango");
		Set<String> actual=question.showAnswersUsingSet();
		boolean result=expected.equals(actual);
		assertEquals(expected,actual);
		
	}
	public void testList() {
		List<String> expected= new ArrayList<>();
		expected.add("Cherry");
		expected.add("Apple");
		
		List<String> actual=question.showAnswersUsingList();
		boolean result=expected.equals(actual);
		assertEquals(expected,actual);
		
	}
	public void testMap() {
		Map<Integer,String> expected= new HashMap<>();
		expected.put(1, "Coconut");
		expected.put(2, "mango");
		expected.put(3, "Apple");
		
		Map<Integer,String> actual=question.showAnswersUsingMap();
		boolean result=expected.equals(actual);
		assertEquals(expected,actual);
		
	}

}
