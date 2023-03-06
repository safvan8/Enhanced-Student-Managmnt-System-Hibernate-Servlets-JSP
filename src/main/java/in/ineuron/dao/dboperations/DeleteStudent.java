package in.ineuron.dao.dboperations;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.pojo.Student;
import in.ineuron.util.HibernateUtil;

// class to perform insert operations
public class DeleteStudent
{
	private static DeleteStudent insertStudent = null;

	// making class singleton
	private DeleteStudent()
	{
	}

	public static DeleteStudent getDeleteStudent()
	{
		System.out.println("InsertStudent.getInsertStudent()...........\n");
		if (insertStudent == null)
			insertStudent = new DeleteStudent();
		return insertStudent;
	}

	// to delete student using id
	public String deleteById(Student student)
	{
		System.out.println("ProductDaoImpl.deleteProduct()........................\n");

		// creating session object by calling utility method
		// getting session from utility class
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		boolean isOperationSuceess = false;
		String deleteStatus = null;

		try
		{
			transaction = session.beginTransaction();

			// deleting database record
			session.delete(student);

			transaction.commit();

			isOperationSuceess = true;

		} catch (HibernateException e)
		{
			e.printStackTrace();
			isOperationSuceess = false;

		} finally
		{
			if (isOperationSuceess)
				deleteStatus = "success";
			else
				deleteStatus = "failed";

			// closing session
			session.close();
		}

		// updating

		return deleteStatus;
	}

}
