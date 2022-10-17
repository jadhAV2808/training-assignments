package com.second.springcore;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	
	int questionId;
	String question;
	List<String>answers;
	Set<String> ansSet;
	Map<Integer, String>ansMap;
	
	
	
	public int getQuestionId() {
		return questionId;
	}



	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public List<String> getAnswers() {
		return answers;
	}



	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}



	public Set<String> getAnsSet() {
		return ansSet;
	}



	public void setAnsSet(Set<String> ansSet) {
		this.ansSet = ansSet;
	}



	public Map<Integer, String> getAnsMap() {
		return ansMap;
	}



	public void setAnsMap(Map<Integer, String> ansMap) {
		this.ansMap = ansMap;
	}



	public void displayAnswerList() {
		System.out.println("answers in list:");
		System.out.println(answers);
	}
	
	public void displayAnswerSet() {
		System.out.println("answers in set:");
		System.out.println(ansSet);
	}
	
	public void displayAnswerMap() {
		System.out.println("id "+"------"+"ans");
		
		for(Map.Entry mp: ansMap.entrySet())
		{  
			System.out.println(mp.getKey()+ "------- "+mp.getValue());  
			}
		
	}
	
	
	public void displayQuestionAnswer() {
		
		System.out.print(questionId +"]  ");
		System.out.println(question);
		System.out.println("ans list: "+answers);
	}
	
	

}
