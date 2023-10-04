package com.iranna.dependencyinjection;

public class Answers {
private int id;
private String answer;
private String by;
public Answers() {
	super();
}
public Answers(int id, String answer, String by) {
	super();
	this.id = id;
	this.answer = answer;
	this.by = by;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public String getBy() {
	return by;
}
public void setBy(String by) {
	this.by = by;
}
@Override
public String toString() {
	return "Answers [id=" + id + ", answer=" + answer + ", by=" + by + "]";
}

}
