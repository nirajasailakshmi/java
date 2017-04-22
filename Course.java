package filestream;


import java.util.List;
import java.io.*;
import java.io.Serializable;

public class Course implements Serializable
	
	{
		String CrsName;
		List<Student> stdDetails;
		
		public String getCrsName()
		{
			return CrsName;
		}
		
		public void setCrsName(String CrsName)
		{
			this.CrsName = CrsName;
		}
	
	public List<Student>stdDetails()
	{
		return stdDetails;
	}
	
	public void setstdDetails(List<Student>l)
	{
		this.stdDetails=l;
	}
	}

	
		
		
		