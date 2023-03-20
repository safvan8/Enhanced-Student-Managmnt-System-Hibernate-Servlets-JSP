package in.ineuron.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.dao.dboperations.DeleteStudent;
import in.ineuron.dao.dboperations.InsertStudent;
import in.ineuron.dao.dboperations.SelectStudent;
import in.ineuron.dao.dboperations.UpdateStudent;
import in.ineuron.pojo.Student;
import in.ineuron.util.HibernateUtil;

public class StudentDaoImpl implements IStudentDao
{

	// Object to insert student details
	private InsertStudent insertStudent;

	// Object to select existing student details
	private SelectStudent selectStudent;

	@Override
	public Integer save(Student student)
	{
		System.out.println("StudentDaoImpl.save().............\n");

		insertStudent = InsertStudent.getInsertStudent();

		return insertStudent.save(student);
	}

	@Override
	public Student findById(Integer sid)
	{
		System.out.println("StudentDaoImpl.findById().............\n");
		selectStudent = SelectStudent.getSelectStudent();
		return selectStudent.findById(sid);
	}

	@Override
	public String updateById(Student student)
	{
		System.out.println("StudentDaoImpl.updateById()................/n");

		// passing to UpdateStudent module
		UpdateStudent updateStudent = UpdateStudent.getUpdateStudent();
		return updateStudent.updateById(student);
	}

	@Override
	public String deleteById(Student student)
	{
		System.out.println("StudentDaoImpl.deleteById()..................../n");

		// passing to delete Student module
		DeleteStudent deleteStudent = DeleteStudent.getDeleteStudent();
		return deleteStudent.deleteById(student);
	}

	@Override
	public List<Student> viewAllStudentsDetils()
	{
		System.out.println("StudentDaoImpl.viewAllStudentsDetils().................\n");

		
		// getting session from utility class
		Session session = HibernateUtil.getSessionFactory().openSession();

		// Creating a query collection whcih can hold employee objects
		Query<Student> studentQuery = session.createQuery("FROM in.ineuron.pojo.Student");
		
		List<Student> allStudentsList = studentQuery.getResultList();
		
		return allStudentsList;
	}

}
