package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.fabric.xmlrpc.base.Member;

public class SpringJdbcTest {

	public static void main(String[] args) {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://127.0.0.1:3306/database1");
		datasource.setUsername("root");
		datasource.setPassword("4321");
		
		JdbcTemplate jdbctemp = new JdbcTemplate(datasource);
		
//		String sql = "insert into member (sname, rollnum, dept, mail) values(?, ?, ?, ?)";
		String sql= "select * from member";
		
//		int result = jdbctemp.update(sql, "Saachein", "1", "Cricket", "scdhssdc@gmail.com");
//		
//		if(result>0)
//		{
//			System.out.println("data inserted");
//		}
		
		RowMapper<Fetchdata> rowmap = new RowMapper<Fetchdata>() {	
			public Fetchdata mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString("sname");
				String rollnum = rs.getString("rollnum");
				String dept = rs.getString("dept");
				String email = rs.getString("mail");
				
				return new Fetchdata(name, rollnum, dept, email);
			}
		};
		// list of data
		List<Fetchdata> listdata = jdbctemp.query(sql, rowmap);
		
		for (Fetchdata fdata : listdata) {
			System.out.println(fdata);
		}
		
		// single data
//		Fetchdata fdata = jdbctemp.queryForObject(sql, rowmap);
//		System.out.println(fdata);
	}

}
