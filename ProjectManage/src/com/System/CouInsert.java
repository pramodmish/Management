package com.System;
import java.sql.*;
public class CouInsert {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public String InsCourse(String e,String f,String g,String h)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="insert into CourseT values(?,?,?,?)";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			ps.setString(2, f);
			ps.setString(3, g);
			ps.setString(4, h);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Saved";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
		
	}
	public String DelCourse(String e)
	{
		try {
			int h;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="delete from CourseT where CourseId=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			h=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Delete";
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String FinCourse(String e)
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from CourseT where CourseId=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>CourseId</td>";
			str=str+"<td>CName</td>";
			str=str+"<td>Duration</td>";
			str=str+"<td>Fees</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}

	public String UpdateCourse(String e,String f,String g,String h)
	{
		try {
			int h1;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="update CourseT set CName=?,Duration=?,Fees=? where CourseId='"+e+"'";
			ps=con.prepareStatement(st);
			ps.setString(1, f);
			ps.setString(2, g);
			ps.setString(3, h);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1>Record update";
			
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String ShowCourse()
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from CourseT";
			ps=con.prepareStatement(st);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>CourseId</td>";
			str=str+"<td>CName</td>";
			str=str+"<td>Duration</td>";
			str=str+"<td>Fees</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String InsAdmission(String e,String f,String g,String h,String i,String j,String k)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="insert into AdmissionT values(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			ps.setString(2, f);
			ps.setString(3, g);
			ps.setString(4, h);
			ps.setString(5, i);
			ps.setString(6, j);
			ps.setString(7, k);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Saved";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
	}
	public String DelAdmission(String e)
	{
		try {
			int h;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="delete from AdmissionT where RollNo=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			h=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Delete";
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String FinAdmission(String e)
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from AdmissionT where RollNo=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>RollNo</td>";
			str=str+"<td>Name</td>";
			str=str+"<td>Address</td>";
			str=str+"<td>Phone</td>";
			str=str+"<td>CourseId</td>";
			str=str+"<td>DateofAdm</td>";
			str=str+"<td>Remarks</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"<td>"+rs.getString(5)+"</td>";
				str=str+"<td>"+rs.getString(6)+"</td>";
				str=str+"<td>"+rs.getString(7)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String ShowAdmission()
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from AdmissionT";
			ps=con.prepareStatement(st);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>RollNo</td>";
			str=str+"<td>Name</td>";
			str=str+"<td>Address</td>";
			str=str+"<td>Phone</td>";
			str=str+"<td>CourseId</td>";
			str=str+"<td>DateofAdm</td>";
			str=str+"<td>Remarks</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"<td>"+rs.getString(5)+"</td>";
				str=str+"<td>"+rs.getString(6)+"</td>";
				str=str+"<td>"+rs.getString(7)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String UpdAdmission(String e,String f,String g,String h,String i,String j,String k)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="update AdmissionT set Name=?,Address=?,Phone=?,CourseId=?,DateofAdm=?,Remarks=? where RollNo='"+e+"'";
			ps=con.prepareStatement(st);
			ps.setString(1, f);
			ps.setString(2, g);
			ps.setString(3, h);
			ps.setString(4, i);
			ps.setString(5, j);
			ps.setString(6, k);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Update";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
	}
	public String InsEnquiry(String e,String f,String g,String h,String i,String j,String k)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="insert into EnquiryT values(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			ps.setString(2, f);
			ps.setString(3, g);
			ps.setString(4, h);
			ps.setString(5, i);
			ps.setString(6, j);
			ps.setString(7, k);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Saved";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
	}
	public String DelEnquiry(String e)
	{
		try {
			int h;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="delete from EnquiryT where EnquiryId=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			h=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Delete";
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String FinEnquiry(String e)
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from EnquiryT where EnquiryId=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>EnquiryId</td>";
			str=str+"<td>EName</td>";
			str=str+"<td>EAdd</td>";
			str=str+"<td>Email</td>";
			str=str+"<td>Phone</td>";
			str=str+"<td>CourseId</td>";
			str=str+"<td>DateofEnquiry</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"<td>"+rs.getString(5)+"</td>";
				str=str+"<td>"+rs.getString(6)+"</td>";
				str=str+"<td>"+rs.getString(7)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String ShowEnquiry()
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from EnquiryT";
			ps=con.prepareStatement(st);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>EnquiryId</td>";
			str=str+"<td>EName</td>";
			str=str+"<td>EAdd</td>";
			str=str+"<td>Email</td>";
			str=str+"<td>Phone</td>";
			str=str+"<td>CourseId</td>";
			str=str+"<td>DateofEnquiry</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"<td>"+rs.getString(5)+"</td>";
				str=str+"<td>"+rs.getString(6)+"</td>";
				str=str+"<td>"+rs.getString(7)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String UpdEnquiry(String e,String f,String g,String h,String i,String j,String k)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="update EnquiryT set EName=?,EAdd=?,Email=?,Phone=?,CourseId=?,DateofEnquiry=? where EnquiryId='"+e+"'";
			ps=con.prepareStatement(st);
			ps.setString(1, f);
			ps.setString(2, g);
			ps.setString(3, h);
			ps.setString(4, i);
			ps.setString(5, j);
			ps.setString(6, k);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Update";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
	}
	public String InsTeacher(String e,String f,String g,String h,String i,String j)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="insert into TeacherT values(?,?,?,?,?,?)";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			ps.setString(2, f);
			ps.setString(3, g);
			ps.setString(4, h);
			ps.setString(5, i);
			ps.setString(6, j);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Saved";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
	}
	public String DelTeacher(String e)
	{
		try {
			int h;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="delete from TeacherT where TeacherId=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			h=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Delete";
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String FinTeacher(String e)
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from TeacherT where TeacherId=?";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>TeacherId</td>";
			str=str+"<td>TName</td>";
			str=str+"<td>TAdd</td>";
			str=str+"<td>TPhone</td>";
			str=str+"<td>TEmail</td>";
			str=str+"<td>CourseId</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"<td>"+rs.getString(5)+"</td>";
				str=str+"<td>"+rs.getString(6)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String ShowTeachers()
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from TeacherT";
			ps=con.prepareStatement(st);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>TeacherId</td>";
			str=str+"<td>TName</td>";
			str=str+"<td>TAdd</td>";
			str=str+"<td>TPhone</td>";
			str=str+"<td>TEmail</td>";
			str=str+"<td>CourseId</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"<td>"+rs.getString(5)+"</td>";
				str=str+"<td>"+rs.getString(6)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String UpdTeacher(String e,String f,String g,String h,String i,String j)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="update TeacherT set TName=?,TAdd=?,TPhone=?,TEmail=?,CourseId=? where TeacherId='"+e+"'";
			ps=con.prepareStatement(st);
			ps.setString(1, f);
			ps.setString(2, g);
			ps.setString(3, h);
			ps.setString(4, i);
			ps.setString(5, j);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Update";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
	}
	public String InsFees(String e,String f,String g, String h)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="insert into FeeEntryT values(?,?,?,?)";
			ps=con.prepareStatement(st);
			ps.setString(1, e);
			ps.setString(2, f);
			ps.setString(3, g);
			ps.setString(4, h);
			h1=ps.executeUpdate();
			con.commit();
			con.close();
			return "<h1> Record Saved";
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
	}
	public String ShowFees()
	{
		try {
			int h;
			String str;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from FeeEntryT";
			ps=con.prepareStatement(st);
			rs=ps.executeQuery();
			str="<table width='100%' border='2'>";
			str=str+"<tr>";
			str=str+"<td>RollNo</td>";
			str=str+"<td>CourseId</td>";
			str=str+"<td>Month</td>";
			str=str+"<td>Installment</td>";
			str=str+"</tr>";
			while(rs.next())
			{
				str=str+"<tr>";
				str=str+"<td>"+rs.getString(1)+"</td>";
				str=str+"<td>"+rs.getString(2)+"</td>";
				str=str+"<td>"+rs.getString(3)+"</td>";
				str=str+"<td>"+rs.getString(4)+"</td>";
				str=str+"</tr>";
			}
			str=str+"</table>";
			return str;
		}
		catch(Exception ec)
		{
			return ec.toString();
		}
	}
	public String AdmiLogin(String e, String f)
	{
		try {
			int h1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String st="select *from Adminlogin where UserId=? and Pass=?";
			PreparedStatement ps=con.prepareStatement(st);
			ps.setString(1, e);
			ps.setString(2, f);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return "<h1> Login success";
			}
			else {
				return "<h1> Login Failed";
			}
			
			
		}
		catch(Exception ec) {return ec.toString();
			
		}
		
	}
	
}
