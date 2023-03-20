package in.ineuron.service;

import java.util.List;

import in.ineuron.pojo.Student;

public interface IStudentService
{
	public abstract Integer save(Student student); // INSERT new student record

	public abstract Student findById(Integer sid); // select one student details and display to end user

	public abstract String updateById(Student student); // Update existing students details
	
	public abstract String deleteById(Student student); // delete existing student details
	
	public abstract List<Student> viewAllStudentsDetils(); // to view all student details  
}
