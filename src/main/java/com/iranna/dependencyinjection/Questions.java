package com.iranna.dependencyinjection;

import java.util.List;

public class Questions {
	private int id;
	private String question;
	private List<Answers> answers;
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(int id, String question, List<Answers> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", question=" + question + ", answers=" + answers + "]";
	}
	

}
