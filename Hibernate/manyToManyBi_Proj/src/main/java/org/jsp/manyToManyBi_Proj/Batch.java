package org.jsp.manyToManyBi_Proj;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false,unique = true)
	private String batch_Code;
	@Column(nullable=false,unique = true)
	private String subject;
	@Column(nullable=false)
	private String trainer;
	
	@JoinColumn
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Student> students;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatch_Code() {
		return batch_Code;
	}
	public void setBatch_Code(String batch_Code) {
		this.batch_Code = batch_Code;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "Batch [id=" + id + ", batch_Code=" + batch_Code + ", subject=" + subject + ", trainer=" + trainer + "]";
	}
	

}
