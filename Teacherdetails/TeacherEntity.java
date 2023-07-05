package com.example.teacher;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TeacherEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TeacherId;
	private String TeacherName;
	private String TeacherAge;
	public TeacherEntity(){
		
	}
	public TeacherEntity(int teacherId) {
		super();
		TeacherId = teacherId;
	}
	public TeacherEntity(String teacherName, String teacherAge) {
		super();
		TeacherName = teacherName;
		TeacherAge = teacherAge;
	}
	public TeacherEntity(int teacherId, String teacherName, String teacherAge) {
		super();
		TeacherId = teacherId;
		TeacherName = teacherName;
		TeacherAge = teacherAge;
	}
	
	public int getTeacherId() {
		return TeacherId;
	}
	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String getTeacherAge() {
		return TeacherAge;
	}
	public void setTeacherAge(String teacherAge) {
		TeacherAge = teacherAge;
	}

	@Override
	public String toString() {
		return "TeacherEntity [TeacherId=" + TeacherId + ", TeacherName=" + TeacherName + ", TeacherAge=" + TeacherAge
				+ "]";
	}

}
