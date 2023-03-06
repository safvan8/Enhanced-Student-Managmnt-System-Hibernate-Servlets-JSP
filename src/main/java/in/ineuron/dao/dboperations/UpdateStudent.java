package in.ineuron.dao.dboperations;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.pojo.Student;
import in.ineuron.util.HibernateUtil;

// to update existing student details
public class UpdateStudent
{
	private static UpdateStudent updateStudent = null;
	
	// restrict student creation outside object
	private UpdateStudent()
	{
	}

	public static UpdateStudent getUpdateStudent()
	{
		if (updateStudent == null)
			updateStudent = new UpdateStudent();
		return updateStudent;
	}

	public String updateById(Student student)
	{
		System.out.println("UpdateStudent.updateById()......................");

		// getting session from utility class
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		String updateExecutionResult = null;
		boolean flag = false;

		try
		{ // updating student details
			transaction = session.beginTransaction();
			session.update(student);
			flag = true;

		} catch (HibernateException he)
		{
			he.printStackTrace();

		} finally
		{ // commmit only , if operation is success
			if (flag)
				transaction.commit();
			else
				transaction.rollback();

			session.close();
		}

		if (flag)
			updateExecutionResult = "success";
		else
			updateExecutionResult = "failed";

		return updateExecutionResult;
	}
}
