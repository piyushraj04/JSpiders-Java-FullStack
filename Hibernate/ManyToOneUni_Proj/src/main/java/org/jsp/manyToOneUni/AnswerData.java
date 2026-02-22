package org.jsp.manyToOneUni;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answer;
	private String answeredBy;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private QuestionData q;

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

	public String getAnsweredBy() {
		return answeredBy;
	}

	public void setAnsweredBy(String answeredBy) {
		this.answeredBy = answeredBy;
	}

	public QuestionData getQ() {
		return q;
	}

	public void setQ(QuestionData q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return "AnswerData [id=" + id + ", answer=" + answer + ", answeredBy=" + answeredBy + ", q=" + q + "]";
	}
	
	
	

}
