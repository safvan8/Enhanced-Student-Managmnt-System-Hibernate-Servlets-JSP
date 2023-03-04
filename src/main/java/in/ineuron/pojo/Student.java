package in.ineuron.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_tab3")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;

	static
	{
		System.out.println("Student class loading.................");
	}

	public Student()
	{
		System.out.println("Student object creation...internally by hibernate..");
	}

	// getters
	public Integer getSid()
	{
		return sid;
	}

	public String getSname()
	{
		return sname;
	}

	public Integer getSage()
	{
		return sage;
	}

	public String getSadress()
	{
		return saddress;
	}

	// setters
	public void setSid(Integer sid)
	{
		this.sid = sid;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public void setSage(Integer sage)
	{
		this.sage = sage;
	}

	public void setSaddress(String saddress)
	{
		this.saddress = saddress;
	}

	@Override
	public String toString()
	{
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}

}
