package filestream;
import java.io.Serializable;



import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Student implements Serializable
{
	
		public  String stdname,stdphone;
		public  int stdid,stdage;
		public  float stdfee;


		
			public String getstdname(String stdname)
			{
				return stdname;
				
			}
			public void setstdname(String stdname)
			{
				this.stdname=stdname;
			}

			public String getstdphone(String stdphone)
			{
				return stdphone;
				
			}
			public void setstdphone(String stdphone)
			{
				this.stdphone=stdphone;
			}
			

			public int getstdid(int stdid)
			{
				return stdid;
				
			}
			public void setstdid(int stdid)
			{
				this.stdid=stdid;
			}
			public int getstdage(int stdage)
			{
				return stdage;
				
			}
			public void setstdage(int stdage)
			{
				this.stdage=stdage;
			}
			public float getstdfee(float stdfee)
			{
				return stdfee;
				
			}
			public void setstdfee(float stdfee)
			{
				this.stdfee=stdfee;
				
				
			}

			
}	

			
			
				
				
				
				
				
			
			
		