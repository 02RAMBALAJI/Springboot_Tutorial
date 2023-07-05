package com.example.teacher;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherrepository;
	public TeacherEntity createTeacher(String TeacherName, String TeacherAge) {
		TeacherEntity teacher=new TeacherEntity(TeacherName,TeacherAge);
		teacherrepository.save(teacher);
		return teacher;
	}
	
	public Collection<TeacherEntity> showTeachers(){
		return teacherrepository.findAll();
	}
	
	public String deleteteacher(int teacherId) {
		TeacherEntity teacher=new TeacherEntity(teacherId);
		teacherrepository.delete(teacher);
		return "The given teacher id for "+teacherId+ " is deleted";	
	}
	
	public TeacherEntity updateTeacher(TeacherEntity Teacher) {
		TeacherEntity teacher = teacherrepository.getById(Teacher.getTeacherId());
		teacher.setTeacherName(Teacher.getTeacherName());
		teacher.setTeacherAge(Teacher.getTeacherAge());
		teacherrepository.save(teacher);
		return teacher;	
	}
}
