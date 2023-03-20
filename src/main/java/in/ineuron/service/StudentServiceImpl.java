package in.ineuron.service;

import java.util.List;

import in.ineuron.dao.IStudentDao;
import in.ineuron.factory.StudentDaoFactory;
import in.ineuron.factory.StudentServiceFactory;
import in.ineuron.pojo.Student;

public class StudentServiceImpl implements IStudentService
{

	private IStudentDao studentDao;

	@Override
	public Integer save(Student student)
	{
		System.out.println("StudentServiceImpl.save()............\n");

		// creating object of Dao and passing to Dao
		studentDao = StudentDaoFactory.getStudentDao();

		return studentDao.save(student);
	}

	@Override
	public Student findById(Integer sid)
	{

		System.out.println("StudentServiceImpl.findById()..................../n");

		// passing to Dao
		studentDao = StudentDaoFactory.getStudentDao();

		return studentDao.findById(sid);

	}

	@Override
	public String updateById(Student student)
	{
		System.out.println("StudentServiceImpl.updateById()................../n");

		// passing to dao layer
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.updateById(student);
	}

	@Override
	public String deleteById(Student student)
	{
		System.out.println("StudentServiceImpl.deleteById()................../n");
		// passing to dao layer
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.deleteById(student);
	}

	@Override
	public List<Student> viewAllStudentsDetils()
	{
		System.out.println("StudentServiceImpl.viewAllStudentsDetils().........\n");
		// passing to dao layer
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.viewAllStudentsDetils();
	}

}