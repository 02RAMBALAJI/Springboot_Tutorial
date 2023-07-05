package com.example.teacher;

import java.util.Collection;
import java.io.Serializable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins="*")
public class TeacherController implements Serializable{
//	@JsonManagedReference
//	@JsonIgnore
	@Autowired
	private TeacherService teacherservice;
	
	@GetMapping(path="/createteacher/{TeacherName}/{TeacherAge}") 
	public TeacherEntity createTeacher(@PathVariable String TeacherName, @PathVariable String TeacherAge)
	{
		return teacherservice.createTeacher(TeacherName,TeacherAge);
		}
	
	@GetMapping(path="/showteachers")
	public Collection<TeacherEntity> showTeachers(){
		return teacherservice.showTeachers();
	}
	
	@GetMapping(path="/deleteteachers/{TeacherId}")
	public String deleteteacher(@PathVariable int TeacherId) {
		teacherservice.deleteteacher(TeacherId);
		return TeacherId+" is deleted";
	}
	
	@PutMapping(path="/updateteacher")
	public TeacherEntity updateTeacher(@RequestBody TeacherEntity Teacher) 
	{
		return teacherservice.updateTeacher(Teacher);
	}
	
	
	
	
	
}
