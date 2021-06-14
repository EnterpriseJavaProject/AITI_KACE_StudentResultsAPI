package aiti.kace.com.gh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import aiti.kace.com.gh.entities.Csd1_1Info;

public interface Csd1_1Repository extends JpaRepository<Csd1_1Info, String >{
	
	
	@Query(value="select student_id from csd1_1students order by student_id desc limit 1;" , nativeQuery = true )
	String csd1_1StudentIdRetrival(String csd1_1StudentId);
	
	
	
	@Query(value="select student_id,student_name,course,email,phone,gender from csd1_1students order by student_id desc limit 1;" , nativeQuery = true)
	Csd1_1Info findCsd1_1Student(Csd1_1Info csd1_1student);
	

}
