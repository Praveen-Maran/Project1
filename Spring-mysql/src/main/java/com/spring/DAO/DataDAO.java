package com.spring.DAO;

import java.util.List;
import com.spring.api.Student;

public interface DataDAO {
		
	List<Student> loadData();
}
