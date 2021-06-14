package aiti.kace.com.gh.csd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aiti.kace.com.gh.entities.Csd1_1Info;
import aiti.kace.com.gh.entities.Csd1_1Results;
import aiti.kace.com.gh.entities.Csd1_2Info;
import aiti.kace.com.gh.entities.Csd1_2Results;
import aiti.kace.com.gh.entities.Csd1_3Info;
import aiti.kace.com.gh.entities.Csd1_3Results;
import aiti.kace.com.gh.entities.Csd1_4Info;
import aiti.kace.com.gh.entities.Csd1_4Results;
import aiti.kace.com.gh.entities.Csd1_5Info;
import aiti.kace.com.gh.entities.Csd1_5Results;
import aiti.kace.com.gh.entities.Csd1_6Info;
import aiti.kace.com.gh.entities.Csd1_6Results;
import aiti.kace.com.gh.entities.Csd1_7Info;
import aiti.kace.com.gh.entities.Csd1_7Results;
import aiti.kace.com.gh.repositories.Csd1_1Repository;
import aiti.kace.com.gh.repositories.Csd1_1ResultsRepository;
import aiti.kace.com.gh.repositories.Csd1_2Repository;
import aiti.kace.com.gh.repositories.Csd1_2ResultsRepository;
import aiti.kace.com.gh.repositories.Csd1_3Repository;
import aiti.kace.com.gh.repositories.Csd1_3ResultsRepository;
import aiti.kace.com.gh.repositories.Csd1_4Repository;
import aiti.kace.com.gh.repositories.Csd1_4ResultsRepository;
import aiti.kace.com.gh.repositories.Csd1_5Repository;
import aiti.kace.com.gh.repositories.Csd1_5ResultsRepository;
import aiti.kace.com.gh.repositories.Csd1_6Repository;
import aiti.kace.com.gh.repositories.Csd1_6ResultsRepository;
import aiti.kace.com.gh.repositories.Csd1_7Repository;
import aiti.kace.com.gh.repositories.Csd1_7ResultsRepository;

@RestController
@RequestMapping("/aitiCsdStudentsAPI")
public class CsdStudentsController {
	
	//CSD1.1
	@Autowired
	Csd1_1Repository csd1_1Repository;
	
	@Autowired
	Csd1_1ResultsRepository csd1_1ResultsRepository;
	
	//CSD1.2
	@Autowired
	Csd1_2ResultsRepository csd1_2ResultsRepository;
	
	@Autowired
	Csd1_2Repository csd1_2Repository;
	
	//CSD1.3
	@Autowired
	Csd1_3ResultsRepository csd1_3ResultsRepository;
	
	@Autowired
	Csd1_3Repository csd1_3Repository;
	
	//CSD1.4
	@Autowired
	Csd1_4ResultsRepository csd1_4ResultsRepository;
	
	@Autowired
	Csd1_4Repository csd1_4Repository;
	
	//CSD1.5
	@Autowired
	Csd1_5ResultsRepository csd1_5ResultsRepository;
	
	@Autowired
	Csd1_5Repository csd1_5Repository;
	
	//CSD1.6
	@Autowired
	Csd1_6ResultsRepository csd1_6ResultsRepository;
	
	@Autowired
	Csd1_6Repository csd1_6Repository;
	
	//CSD1.7
	@Autowired
	Csd1_7ResultsRepository csd1_7ResultsRepository;
	
	@Autowired
	Csd1_7Repository csd1_7Repository;
	
	
	
	
//  CSD FIND ALL STDUENTS METHODS
	
	@GetMapping("/getAllCsd1_1Students")
	public List<Csd1_1Info> getAllCsd1_1Students(){
		
		return csd1_1Repository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_2Students")
	public List<Csd1_2Info> getAllCsd1_2Students(){
		
		return csd1_2Repository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_3Students")
	public List<Csd1_3Info> getAllCsd1_3Students(){
		
		return csd1_3Repository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_4Students")
	public List<Csd1_4Info> getAllCsd1_4Students(){
		
		return csd1_4Repository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_5Students")
	public List<Csd1_5Info> getAllCsd1_5Students(){
		
		return csd1_5Repository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_6Students")
	public List<Csd1_6Info> getAllCsd1_6Students(){
		
		return csd1_6Repository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_7Students")
	public List<Csd1_7Info> getAllCsd1_7Students(){
		
		return csd1_7Repository.findAll();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//  CSD STDUENTS FIND A SINGLE STUDENT ID METHODS
	@GetMapping("/getCsd1_1StudentId")
	public String getCsd1_1StudentId(String csd1_1StudentId) {
		
		
		return csd1_1Repository.csd1_1StudentIdRetrival(csd1_1StudentId);
		
	}
	
	
	
	
	
	
//  CSD STDUENTS FIND A SINGLE STUDENT ID METHODS
	@GetMapping("/getCsd1_1Student")
	public Csd1_1Info findCsd1_1Student(Csd1_1Info csd1_1student) {
		
		
		return csd1_1Repository.findCsd1_1Student(csd1_1student);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
			//  CSD STDUENTS FIND A SINGLE STUDENT METHODS
	
	
	@GetMapping("/getCsd1_1Student/{student_id}")
	public Csd1_1Info getCsd1_1Student(@PathVariable("student_id") String student_id) {
		
		return csd1_1Repository.findById(student_id).get();
	}
	
	@GetMapping("/getCsd1_2Student/{student_id}")
	public Csd1_2Info getCsd1_2Student(@PathVariable("student_id") String student_id) {
		
		return csd1_2Repository.findById(student_id).get();
	}
	
	
	@GetMapping("/getCsd1_3Student/{student_id}")
	public Csd1_3Info getCsd1_3Student(@PathVariable("student_id") String student_id) {
		
		return csd1_3Repository.findById(student_id).get();
	}
	
	
	@GetMapping("/getCsd1_4Student/{student_id}")
	public Csd1_4Info getCsd1_4Student(@PathVariable("student_id") String student_id) {
		
		return csd1_4Repository.findById(student_id).get();
	}
	
	
	@GetMapping("/getCsd1_5Student/{student_id}")
	public Csd1_5Info getCsd1_5Student(@PathVariable("student_id") String student_id) {
		
		return csd1_5Repository.findById(student_id).get();
	}
	
	
	@GetMapping("/getCsd1_6Student/{student_id}")
	public Csd1_6Info getCsd1_6Student(@PathVariable("student_id") String student_id) {
		
		return csd1_6Repository.findById(student_id).get();
	}
	
	
	@GetMapping("/getCsd1_7Student/{student_id}")
	public Csd1_7Info getCsd1_7Student(@PathVariable("student_id") String student_id) {
		
		return csd1_7Repository.findById(student_id).get();
	}
	
	
	
	
	
	//  CSD STUDENTS CREATE METHODS
	
	
	
	@PostMapping("/createCsd1_1Student")
	public Csd1_1Info createCsd1_1Student(@RequestBody Csd1_1Info csd1_1Info) {
		
		return csd1_1Repository.save(csd1_1Info);
	}
	
	@PostMapping("/createCsd1_2Student")
	public Csd1_2Info createCsd1_2Student(@RequestBody Csd1_2Info csd1_2Info) {
		
		return csd1_2Repository.save(csd1_2Info);
	}
	
	@PostMapping("/createCsd1_3Student")
	public Csd1_3Info createCsd1_3Student(@RequestBody Csd1_3Info csd1_3Info) {
		
		return csd1_3Repository.save(csd1_3Info);
	}
	
	@PostMapping("/createCsd1_4Student")
	public Csd1_4Info createCsd1_4Student(@RequestBody Csd1_4Info csd1_4Info) {
		
		return csd1_4Repository.save(csd1_4Info);
	}
	
	@PostMapping("/createCsd1_5Student")
	public Csd1_5Info createCsd1_5Student(@RequestBody Csd1_5Info csd1_5Info) {
		
		return csd1_5Repository.save(csd1_5Info);
	}
	
	@PostMapping("/createCsd1_6Student")
	public Csd1_6Info createCsd1_6Student(@RequestBody Csd1_6Info csd1_6Info) {
		
		return csd1_6Repository.save(csd1_6Info);
	}
	
	@PostMapping("/createCsd1_7Student")
	public Csd1_7Info createCsd1_7Student(@RequestBody Csd1_7Info csd1_7Info) {
		
		return csd1_7Repository.save(csd1_7Info);
	}
	
	
	
	
	
	
	
				//  CSD STUDENTS UPDATE METHODS
	
	
	@PutMapping("/updateCsd1_1Student")
	public Csd1_1Info updateCsd1_1Student(@RequestBody Csd1_1Info csd1_1Info) {
		
		return csd1_1Repository.save(csd1_1Info);
	}
	
	@PutMapping("/updateCsd1_2Student")
	public Csd1_2Info updateCsd1_2Student(@RequestBody Csd1_2Info csd1_2Info) {
		
		return csd1_2Repository.save(csd1_2Info);
	}
	
	@PutMapping("/updateCsd1_3Student")
	public Csd1_3Info updateCsd1_3Student(@RequestBody Csd1_3Info csd1_3Info) {
		
		return csd1_3Repository.save(csd1_3Info);
	}
	
	@PutMapping("/updateCsd1_4Student")
	public Csd1_4Info updateCsd1_4Student(@RequestBody Csd1_4Info csd1_4Info) {
		
		return csd1_4Repository.save(csd1_4Info);
	}
	
	@PutMapping("/updateCsd1_5Student")
	public Csd1_5Info updateCsd1_5Student(@RequestBody Csd1_5Info csd1_5Info) {
		
		return csd1_5Repository.save(csd1_5Info);
	}
	
	@PutMapping("/updateCsd1_6Student")
	public Csd1_6Info updateCsd1_6Student(@RequestBody Csd1_6Info csd1_6Info) {
		
		return csd1_6Repository.save(csd1_6Info);
	}
	
	@PutMapping("/updateCsd1_7Student")
	public Csd1_7Info updateCsd1_7Student(@RequestBody Csd1_7Info csd1_7Info) {
		
		return csd1_7Repository.save(csd1_7Info);
	}
	
	
	
	
	
	
	
	
	
	
			//  CSD STUDENTS DELETE METHODS
	
	
	@DeleteMapping("/deleteCsd1_1Student/{student_id}")
	public void deleteCsd1_1Student(@PathVariable("student_id") String student_id) {
		
		csd1_1Repository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_2Student/{student_id}")
	public void deleteCsd1_2Student(@PathVariable("student_id") String student_id) {
		
		csd1_2Repository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_3Student/{student_id}")
	public void deleteCsd1_3Student(@PathVariable("student_id") String student_id) {
		
		csd1_3Repository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_4Student/{student_id}")
	public void deleteCsd1_4Student(@PathVariable("student_id") String student_id) {
		
		csd1_4Repository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_5Student/{student_id}")
	public void deleteCsd1_5Student(@PathVariable("student_id") String student_id) {
		
		csd1_5Repository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_6Student/{student_id}")
	public void deleteCsd1_6Student(@PathVariable("student_id") String student_id) {
		
		csd1_6Repository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_7Student/{student_id}")
	public void deleteCsd1_7Student(@PathVariable("student_id") String student_id) {
		
		csd1_7Repository.deleteById(student_id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
					// CSD GET ALL STUDENTS RESULTS MEHTODS
	
	
	
	@GetMapping("/getAllCsd1_1StudentResults")
	public List<Csd1_1Results> getAllCsd1_1StudentResults(){
		
		return csd1_1ResultsRepository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_2StudentResults")
	public List<Csd1_2Results> getAllCsd1_2StudentResults(){
		
		return csd1_2ResultsRepository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_3StudentResults")
	public List<Csd1_3Results> getAllCsd1_3StudentResults(){
		
		return csd1_3ResultsRepository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_4StudentResults")
	public List<Csd1_4Results> getAllCsd1_4StudentResults(){
		
		return csd1_4ResultsRepository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_5StudentResults")
	public List<Csd1_5Results> getAllCsd1_5StudentResults(){
		
		return csd1_5ResultsRepository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_6StudentResults")
	public List<Csd1_6Results> getAllCsd1_6StudentResults(){
		
		return csd1_6ResultsRepository.findAll();
		
	}
	
	@GetMapping("/getAllCsd1_7StudentResults")
	public List<Csd1_7Results> getAllCsd1_7StudentResults(){
		
		return csd1_7ResultsRepository.findAll();
		
	}

	
	
	
	
	
	
	
	
	// CSD GET A SINGLE STUDENT RESULTS MEHTODS
	
	
	@GetMapping("/getCsd1_1StudentResult/{student_id}")
	public Csd1_1Results getCsd1_1StudentResult(@PathVariable("student_id") String student_id) {
		
		return csd1_1ResultsRepository.findById(student_id).get();
	}
	
	@GetMapping("/getCsd1_2StudentResult/{student_id}")
	public Csd1_2Results getCsd1_2StudentResult(@PathVariable("student_id") String student_id) {
		
		return csd1_2ResultsRepository.findById(student_id).get();
	}
	
	@GetMapping("/getCsd1_3StudentResult/{student_id}")
	public Csd1_3Results getCsd1_3StudentResult(@PathVariable("student_id") String student_id) {
		
		return csd1_3ResultsRepository.findById(student_id).get();
	}
	
	@GetMapping("/getCsd1_4StudentResult/{student_id}")
	public Csd1_4Results getCsd1_4StudentResult(@PathVariable("student_id") String student_id) {
		
		return csd1_4ResultsRepository.findById(student_id).get();
	}
	
	@GetMapping("/getCsd1_5StudentResult/{student_id}")
	public Csd1_5Results getCsd1_5StudentResult(@PathVariable("student_id") String student_id) {
		
		return csd1_5ResultsRepository.findById(student_id).get();
	}
	
	@GetMapping("/getCsd1_6StudentResult/{student_id}")
	public Csd1_6Results getCsd1_6StudentResult(@PathVariable("student_id") String student_id) {
		
		return csd1_6ResultsRepository.findById(student_id).get();
	}
	
	@GetMapping("/getCsd1_7StudentResult/{student_id}")
	public Csd1_7Results getCsd1_7StudentResult(@PathVariable("student_id") String student_id) {
		
		return csd1_7ResultsRepository.findById(student_id).get();
	}
	
	
	
	
	
	
	
	
	
	
	// CSD CREATE STUDENT RESULTS MEHTODS
	
	
	@PostMapping("/createCsd1_1StudentResult")
	public Csd1_1Results createCsd1_1StudentResult(@RequestBody Csd1_1Results csd1_1Results) {
		
		return csd1_1ResultsRepository.save(csd1_1Results);
	}
	
	@PostMapping("/createCsd1_2StudentResult")
	public Csd1_2Results createCsd1_2StudentResult(@RequestBody Csd1_2Results csd1_2Results) {
		
		return csd1_2ResultsRepository.save(csd1_2Results);
	}
	
	@PostMapping("/createCsd1_3StudentResult")
	public Csd1_3Results createCsd1_3StudentResult(@RequestBody Csd1_3Results csd1_3Results) {
		
		return csd1_3ResultsRepository.save(csd1_3Results);
	}
	
	@PostMapping("/createCsd1_4StudentResult")
	public Csd1_4Results createCsd1_4StudentResult(@RequestBody Csd1_4Results csd1_4Results) {
		
		return csd1_4ResultsRepository.save(csd1_4Results);
	}
	
	@PostMapping("/createCsd1_5StudentResult")
	public Csd1_5Results createCsd1_5StudentResult(@RequestBody Csd1_5Results csd1_5Results) {
		
		return csd1_5ResultsRepository.save(csd1_5Results);
	}
	
	@PostMapping("/createCsd1_6StudentResult")
	public Csd1_6Results createCsd1_6StudentResult(@RequestBody Csd1_6Results csd1_6Results) {
		
		return csd1_6ResultsRepository.save(csd1_6Results);
	}
	
	@PostMapping("/createCsd1_7StudentResult")
	public Csd1_7Results createCsd1_7StudentResult(@RequestBody Csd1_7Results csd1_7Results) {
		
		return csd1_7ResultsRepository.save(csd1_7Results);
	}
	
	
	
	
	
	
	// CSD STUDENTS UPDATE RESULTS MEHTODS
	
	@PutMapping("/updateCsd1_1StudentResult")
	public Csd1_1Results updateCsd1_1StudentResult(@RequestBody Csd1_1Results csd1_1Results) {
		
		return csd1_1ResultsRepository.save(csd1_1Results);
	}
	
	@PutMapping("/updateCsd1_2StudentResult")
	public Csd1_2Results updateCsd1_2StudentResult(@RequestBody Csd1_2Results csd1_2Results) {
		
		return csd1_2ResultsRepository.save(csd1_2Results);
	}
	
	@PutMapping("/updateCsd1_3StudentResult")
	public Csd1_3Results updateCsd1_3StudentResult(@RequestBody Csd1_3Results csd1_3Results) {
		
		return csd1_3ResultsRepository.save(csd1_3Results);
	}
	
	@PutMapping("/updateCsd1_4StudentResult")
	public Csd1_4Results updateCsd1_4StudentResult(@RequestBody Csd1_4Results csd1_4Results) {
		
		return csd1_4ResultsRepository.save(csd1_4Results);
	}
	
	@PutMapping("/updateCsd1_5StudentResult")
	public Csd1_5Results updateCsd1_5StudentResult(@RequestBody Csd1_5Results csd1_5Results) {
		
		return csd1_5ResultsRepository.save(csd1_5Results);
	}
	
	@PutMapping("/updateCsd1_6StudentResult")
	public Csd1_6Results updateCsd1_6StudentResult(@RequestBody Csd1_6Results csd1_6Results) {
		
		return csd1_6ResultsRepository.save(csd1_6Results);
	}
	
	@PutMapping("/updateCsd1_7StudentResult")
	public Csd1_7Results updateCsd1_7StudentResult(@RequestBody Csd1_7Results csd1_7Results) {
		
		return csd1_7ResultsRepository.save(csd1_7Results);
	}
	
	
	
	
	
	
	
	// CSD STUDENTS DELETE RESULTS MEHTODS
	
	@DeleteMapping("/deleteCsd1_1StudentResult/{student_id}")
	public void deleteCsd1_1StudentResult(@PathVariable("student_id") String student_id) {
		
		csd1_1ResultsRepository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_2StudentResult/{student_id}")
	public void deleteCsd1_2StudentResult(@PathVariable("student_id") String student_id) {
		
		csd1_2ResultsRepository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_3StudentResult/{student_id}")
	public void deleteCsd1_3StudentResult(@PathVariable("student_id") String student_id) {
		
		csd1_3ResultsRepository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_4StudentResult/{student_id}")
	public void deleteCsd1_4StudentResult(@PathVariable("student_id") String student_id) {
		
		csd1_4ResultsRepository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_5StudentResult/{student_id}")
	public void deleteCsd1_5StudentResult(@PathVariable("student_id") String student_id) {
		
		csd1_5ResultsRepository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_6StudentResult/{student_id}")
	public void deleteCsd1_6StudentResult(@PathVariable("student_id") String student_id) {
		
		csd1_6ResultsRepository.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteCsd1_7StudentResult/{student_id}")
	public void deleteCsd1_7StudentResult(@PathVariable("student_id") String student_id) {
		
		csd1_7ResultsRepository.deleteById(student_id);
	}
	
	
	
	
	
}
