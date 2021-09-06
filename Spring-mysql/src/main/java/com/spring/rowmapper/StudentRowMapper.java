package com.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.api.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
				
		student.setSname(rs.getString("sname"));
		student.setRollnum(rs.getString("rollnum"));
		student.setDept(rs.getString("dept"));
		student.setMail(rs.getString("mail"));
		
		return student;
	}

}
