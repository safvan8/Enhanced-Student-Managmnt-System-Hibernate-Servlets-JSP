package in.ineuron.service;

import in.ineuron.pojo.Student;

public interface IStudentService
{
	public abstract Integer save(Student student); // INSERT new student record

	public abstract Student findById(Integer sid); // select one student details and display to end user

	public abstract String updateById(Student student); // Update existing students details
	
	public abstract String deleteById(Integer sid); // delete existing student details
}
