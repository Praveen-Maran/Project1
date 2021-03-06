package com.spring.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import com.spring.api.Student;
import com.spring.rowmapper.StudentRowMapper;

@Repository
public class DataDAOImpl implements DataDAO {
	

	@Autowired
	JdbcTemplate jdbcTemp;

	public List<Student> loadData() {	

		// write db code here
		String sql = "select * from member";
		List<Student> theListofStudent = jdbcTemp.query(sql, new StudentRowMapper());
		
		return theListofStudent;
	}
	@Override
	public void savedStudent(Student student) {
		
		Object[] sqlParameters = {student.getSname(), student.getRollnum(), student.getDept(), student.getMail()};
		String sql = "insert into member(sname, rollnum, dept, mail) values(?, ?, ?, ?)";
		jdbcTemp.update(sql, sqlParameters);
		
		System.out.println("Data entered successfully...");
		
	}


}
