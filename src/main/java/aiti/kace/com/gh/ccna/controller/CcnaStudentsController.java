package aiti.kace.com.gh.ccna.controller;

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

import aiti.kace.com.gh.entities.Ccna1_1Info;
import aiti.kace.com.gh.entities.Ccna1_1Results;
import aiti.kace.com.gh.entities.Ccna1_2Info;
import aiti.kace.com.gh.entities.Ccna1_2Results;
import aiti.kace.com.gh.entities.Ccna1_3Info;
import aiti.kace.com.gh.entities.Ccna1_3Results;
import aiti.kace.com.gh.entities.Ccna1_4Info;
import aiti.kace.com.gh.entities.Ccna1_4Results;
import aiti.kace.com.gh.entities.Ccna1_5Info;
import aiti.kace.com.gh.entities.Ccna1_5Results;
import aiti.kace.com.gh.entities.Ccna1_6Info;
import aiti.kace.com.gh.entities.Ccna1_6Results;
import aiti.kace.com.gh.entities.Ccna1_7Info;
import aiti.kace.com.gh.entities.Ccna1_7Results;
import aiti.kace.com.gh.repositories.Ccna1_1Repository;
import aiti.kace.com.gh.repositories.Ccna1_1ResultsRepository;
import aiti.kace.com.gh.repositories.Ccna1_2Repository;
import aiti.kace.com.gh.repositories.Ccna1_2ResultsRepository;
import aiti.kace.com.gh.repositories.Ccna1_3Repository;
import aiti.kace.com.gh.repositories.Ccna1_3ResultsRepository;
import aiti.kace.com.gh.repositories.Ccna1_4Repository;
import aiti.kace.com.gh.repositories.Ccna1_4ResultsRepository;
import aiti.kace.com.gh.repositories.Ccna1_5Repository;
import aiti.kace.com.gh.repositories.Ccna1_5ResultsRepository;
import aiti.kace.com.gh.repositories.Ccna1_6Repository;
import aiti.kace.com.gh.repositories.Ccna1_6ResultsRepository;
import aiti.kace.com.gh.repositories.Ccna1_7Repository;
import aiti.kace.com.gh.repositories.Ccna1_7ResultsRepository;

@RestController
@RequestMapping("/aitiCcnaStudentsAPI")
public class CcnaStudentsController {
	
	
	
	
	
	
	//CCNA1.1
		@Autowired
		Ccna1_1Repository ccna1_1Repository;
		
		@Autowired
		Ccna1_1ResultsRepository ccna1_1ResultsRepository;
		
		//CCNA1.2
		@Autowired
		Ccna1_2ResultsRepository ccna1_2ResultsRepository;
		
		@Autowired
		Ccna1_2Repository ccna1_2Repository;
		
		//CCNA1.3
		@Autowired
		Ccna1_3ResultsRepository ccna1_3ResultsRepository;
		
		@Autowired
		Ccna1_3Repository ccna1_3Repository;
		
		//CCNA1.4
		@Autowired
		Ccna1_4ResultsRepository ccna1_4ResultsRepository;
		
		@Autowired
		Ccna1_4Repository ccna1_4Repository;
		
		//CCNA1.5
		@Autowired
		Ccna1_5ResultsRepository ccna1_5ResultsRepository;
		
		@Autowired
		Ccna1_5Repository ccna1_5Repository;
		
		//CCNA1.6
		@Autowired
		Ccna1_6ResultsRepository ccna1_6ResultsRepository;
		
		@Autowired
		Ccna1_6Repository ccna1_6Repository;
		
		//CCNA1.7
		@Autowired
		Ccna1_7ResultsRepository ccna1_7ResultsRepository;
		
		@Autowired
		Ccna1_7Repository ccna1_7Repository;
		
		
		
		
	//  CCNA FIND ALL STDUENTS METHODS
		
		@GetMapping("/getAllCcna1_1Students")
		public List<Ccna1_1Info> getAllCcna1_1Students(){
			
			return ccna1_1Repository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_2Students")
		public List<Ccna1_2Info> getAllCcna1_2Students(){
			
			return ccna1_2Repository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_3Students")
		public List<Ccna1_3Info> getAllCcna1_3Students(){
			
			return ccna1_3Repository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_4Students")
		public List<Ccna1_4Info> getAllCcna1_4Students(){
			
			return ccna1_4Repository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_5Students")
		public List<Ccna1_5Info> getAllCcna1_5Students(){
			
			return ccna1_5Repository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_6Students")
		public List<Ccna1_6Info> getAllCcna1_6Students(){
			
			return ccna1_6Repository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_7Students")
		public List<Ccna1_7Info> getAllCcna1_7Students(){
			
			return ccna1_7Repository.findAll();
			
		}

		
		
				//  CSD STDUENTS FIND A SINGLE STUDENT METHODS
		
		
		@GetMapping("/getCcna1_1Student/{student_id}")
		public Ccna1_1Info getCcna1_1Student(@PathVariable("student_id") String student_id) {
			
			return ccna1_1Repository.findById(student_id).get();
		}
		
		@GetMapping("/getCcna1_2Student/{student_id}")
		public Ccna1_2Info getCcna1_2Student(@PathVariable("student_id") String student_id) {
			
			return ccna1_2Repository.findById(student_id).get();
		}
		
		
		@GetMapping("/getCcna1_3Student/{student_id}")
		public Ccna1_3Info getCcna1_3Student(@PathVariable("student_id") String student_id) {
			
			return ccna1_3Repository.findById(student_id).get();
		}
		
		
		@GetMapping("/getCcna1_4Student/{student_id}")
		public Ccna1_4Info getCcna1_4Student(@PathVariable("student_id") String student_id) {
			
			return ccna1_4Repository.findById(student_id).get();
		}
		
		
		@GetMapping("/getCcna1_5Student/{student_id}")
		public Ccna1_5Info getCcna1_5Student(@PathVariable("student_id") String student_id) {
			
			return ccna1_5Repository.findById(student_id).get();
		}
		
		
		@GetMapping("/getCcna1_6Student/{student_id}")
		public Ccna1_6Info getCcna1_6Student(@PathVariable("student_id") String student_id) {
			
			return ccna1_6Repository.findById(student_id).get();
		}
		
		
		@GetMapping("/getCcna1_7Student/{student_id}")
		public Ccna1_7Info getCcna1_7Student(@PathVariable("student_id") String student_id) {
			
			return ccna1_7Repository.findById(student_id).get();
		}
		
		
		
		
		
		//  CCNA STUDENTS CREATE METHODS
		
		
		
		@PostMapping("/createCcna1_1Student")
		public Ccna1_1Info createCcna1_1Student(@RequestBody Ccna1_1Info ccna1_1Info) {
			
			return ccna1_1Repository.save(ccna1_1Info);
		}
		
		@PostMapping("/createCcna1_2Student")
		public Ccna1_2Info createCcna1_2Student(@RequestBody Ccna1_2Info ccna1_2Info) {
			
			return ccna1_2Repository.save(ccna1_2Info);
		}
		
		@PostMapping("/createCcna1_3Student")
		public Ccna1_3Info creatCcna1_3Student(@RequestBody Ccna1_3Info ccna1_3Info) {
			
			return ccna1_3Repository.save(ccna1_3Info);
		}
		
		@PostMapping("/createCcna1_4Student")
		public Ccna1_4Info createCcna1_4Student(@RequestBody Ccna1_4Info ccna1_4Info) {
			
			return ccna1_4Repository.save(ccna1_4Info);
		}
		
		@PostMapping("/createCcna1_5Student")
		public Ccna1_5Info createCcna1_5Student(@RequestBody Ccna1_5Info ccna1_5Info) {
			
			return ccna1_5Repository.save(ccna1_5Info);
		}
		
		@PostMapping("/createCcna1_6Student")
		public Ccna1_6Info createCcna1_6Student(@RequestBody Ccna1_6Info ccna1_6Info) {
			
			return ccna1_6Repository.save(ccna1_6Info);
		}
		
		@PostMapping("/createCcna1_7Student")
		public Ccna1_7Info createCcna1_7Student(@RequestBody Ccna1_7Info ccna1_7Info) {
			
			return ccna1_7Repository.save(ccna1_7Info);
		}
		
		
		
		
		
		
		
					//  CSD STUDENTS UPDATE METHODS
		
		
		@PutMapping("/updateCcna1_1Student")
		public Ccna1_1Info updateCcna1_1Student(@RequestBody Ccna1_1Info ccna1_1Info) {
			
			return ccna1_1Repository.save(ccna1_1Info);
		}
		
		@PutMapping("/updateCcna1_2Student")
		public Ccna1_2Info updateCcna1_2Student(@RequestBody Ccna1_2Info ccna1_2Info) {
			
			return ccna1_2Repository.save(ccna1_2Info);
		}
		
		@PutMapping("/updateCcna1_3Student")
		public Ccna1_3Info updateCcna1_3Student(@RequestBody Ccna1_3Info ccna1_3Info) {
			
			return ccna1_3Repository.save(ccna1_3Info);
		}
		
		@PutMapping("/updateCcna1_4Student")
		public Ccna1_4Info updateCcna1_4Student(@RequestBody Ccna1_4Info ccna1_4Info) {
			
			return ccna1_4Repository.save(ccna1_4Info);
		}
		
		@PutMapping("/updateCcna1_5Student")
		public Ccna1_5Info updateCcna1_5Student(@RequestBody Ccna1_5Info ccna1_5Info) {
			
			return ccna1_5Repository.save(ccna1_5Info);
		}
		
		@PutMapping("/updateCcna1_6Student")
		public Ccna1_6Info updateCcna1_6Student(@RequestBody Ccna1_6Info ccna1_6Info) {
			
			return ccna1_6Repository.save(ccna1_6Info);
		}
		
		@PutMapping("/updateCcna1_7Student")
		public Ccna1_7Info updateCcna1_7Student(@RequestBody Ccna1_7Info ccna1_7Info) {
			
			return ccna1_7Repository.save(ccna1_7Info);
		}
		
		
		
		
		
		
		
		
		
		
				//  CCNA STUDENTS DELETE METHODS
		
		
		@DeleteMapping("/deleteCcna1_1Student/{student_id}")
		public void deleteCcna1_1Student(@PathVariable("student_id") String student_id) {
			
			ccna1_1Repository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_2Student/{student_id}")
		public void deleteCcna1_2Student(@PathVariable("student_id") String student_id) {
			
			ccna1_2Repository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_3Student/{student_id}")
		public void deleteCcna1_3Student(@PathVariable("student_id") String student_id) {
			
			ccna1_3Repository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_4Student/{student_id}")
		public void deleteCcna1_4Student(@PathVariable("student_id") String student_id) {
			
			ccna1_4Repository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_5Student/{student_id}")
		public void deleteCcna1_5Student(@PathVariable("student_id") String student_id) {
			
			ccna1_5Repository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_6Student/{student_id}")
		public void deleteCcna1_6Student(@PathVariable("student_id") String student_id) {
			
			ccna1_6Repository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_7Student/{student_id}")
		public void deleteCcna1_7Student(@PathVariable("student_id") String student_id) {
			
			ccna1_7Repository.deleteById(student_id);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
						// CCNA GET ALL STUDENTS RESULTS MEHTODS
		
		
		
		@GetMapping("/getAllCcna1_1StudentResults")
		public List<Ccna1_1Results> getAllCcna1_1StudentResults(){
			
			return ccna1_1ResultsRepository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_2StudentResults")
		public List<Ccna1_2Results> getAllCcna1_2StudentResults(){
			
			return ccna1_2ResultsRepository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_3StudentResults")
		public List<Ccna1_3Results> getAllCcna1_3StudentResults(){
			
			return ccna1_3ResultsRepository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_4StudentResults")
		public List<Ccna1_4Results> getAllCcna1_4StudentResults(){
			
			return ccna1_4ResultsRepository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_5StudentResults")
		public List<Ccna1_5Results> getAllCcna1_5StudentResults(){
			
			return ccna1_5ResultsRepository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_6StudentResults")
		public List<Ccna1_6Results> getAllCcna1_6StudentResults(){
			
			return ccna1_6ResultsRepository.findAll();
			
		}
		
		@GetMapping("/getAllCcna1_7StudentResults")
		public List<Ccna1_7Results> getAllCcna1_7StudentResults(){
			
			return ccna1_7ResultsRepository.findAll();
			
		}

		
		
		
		
		
		
		
		
		// CCNA GET A SINGLE STUDENT RESULTS MEHTODS
		
		
		@GetMapping("/getCcna1_1StudentResult/{student_id}")
		public Ccna1_1Results getCcna1_1StudentResult(@PathVariable("student_id") String student_id) {
			
			return ccna1_1ResultsRepository.findById(student_id).get();
		}
		
		@GetMapping("/getCcna1_2StudentResult/{student_id}")
		public Ccna1_2Results getCcna1_2StudentResult(@PathVariable("student_id") String student_id) {
			
			return ccna1_2ResultsRepository.findById(student_id).get();
		}
		
		@GetMapping("/getCcna1_3StudentResult/{student_id}")
		public Ccna1_3Results getCcna1_3StudentResult(@PathVariable("student_id") String student_id) {
			
			return ccna1_3ResultsRepository.findById(student_id).get();
		}
		
		@GetMapping("/getCcna1_4StudentResult/{student_id}")
		public Ccna1_4Results getCcna1_4StudentResult(@PathVariable("student_id") String student_id) {
			
			return ccna1_4ResultsRepository.findById(student_id).get();
		}
		
		@GetMapping("/getCcna1_5StudentResult/{student_id}")
		public Ccna1_5Results getCcna1_5StudentResult(@PathVariable("student_id") String student_id) {
			
			return ccna1_5ResultsRepository.findById(student_id).get();
		}
		
		@GetMapping("/getCcna1_6StudentResult/{student_id}")
		public Ccna1_6Results getCcna1_6StudentResult(@PathVariable("student_id") String student_id) {
			
			return ccna1_6ResultsRepository.findById(student_id).get();
		}
		
		@GetMapping("/getCcna1_7StudentResult/{student_id}")
		public Ccna1_7Results getCcna1_7StudentResult(@PathVariable("student_id") String student_id) {
			
			return ccna1_7ResultsRepository.findById(student_id).get();
		}
		
		
		
		
		
		
		
		
		
		
		// CCNA CREATE STUDENT RESULTS MEHTODS
		
		
		@PostMapping("/createCcna1_1StudentResult")
		public Ccna1_1Results createCcna1_1StudentResult(@RequestBody Ccna1_1Results ccna1_1Results) {
			
			return ccna1_1ResultsRepository.save(ccna1_1Results);
		}
		
		@PostMapping("/createCcna1_2StudentResult")
		public Ccna1_2Results createCcna1_2StudentResult(@RequestBody Ccna1_2Results ccna1_2Results) {
			
			return ccna1_2ResultsRepository.save(ccna1_2Results);
		}
		
		@PostMapping("/createCcna1_3StudentResult")
		public Ccna1_3Results createCcna1_3StudentResult(@RequestBody Ccna1_3Results ccna1_3Results) {
			
			return ccna1_3ResultsRepository.save(ccna1_3Results);
		}
		
		@PostMapping("/createCcna1_4StudentResult")
		public Ccna1_4Results createCcna1_4StudentResult(@RequestBody Ccna1_4Results ccna1_4Results) {
			
			return ccna1_4ResultsRepository.save(ccna1_4Results);
		}
		
		@PostMapping("/createCcna1_5StudentResult")
		public Ccna1_5Results createCcna1_5StudentResult(@RequestBody Ccna1_5Results ccna1_5Results) {
			
			return ccna1_5ResultsRepository.save(ccna1_5Results);
		}
		
		@PostMapping("/createCcna1_6StudentResult")
		public Ccna1_6Results createCcna1_6StudentResult(@RequestBody Ccna1_6Results ccna1_6Results) {
			
			return ccna1_6ResultsRepository.save(ccna1_6Results);
		}
		
		@PostMapping("/createCcna1_7StudentResult")
		public Ccna1_7Results createCcna1_7StudentResult(@RequestBody Ccna1_7Results ccna1_7Results) {
			
			return ccna1_7ResultsRepository.save(ccna1_7Results);
		}
		
		
		
		
		
		
		// CCNA STUDENTS UPDATE RESULTS MEHTODS
		
		@PutMapping("/updateCcna1_1StudentResult")
		public Ccna1_1Results updateCcna1_1StudentResult(@RequestBody Ccna1_1Results ccna1_1Results) {
			
			return ccna1_1ResultsRepository.save(ccna1_1Results);
		}
		
		@PutMapping("/updateCcna1_2StudentResult")
		public Ccna1_2Results updateCcna1_2StudentResult(@RequestBody Ccna1_2Results ccna1_2Results) {
			
			return ccna1_2ResultsRepository.save(ccna1_2Results);
		}
		
		@PutMapping("/updateCcna1_3StudentResult")
		public Ccna1_3Results updateCcna1_3StudentResult(@RequestBody Ccna1_3Results ccna1_3Results) {
			
			return ccna1_3ResultsRepository.save(ccna1_3Results);
		}
		
		@PutMapping("/updateCcna1_4StudentResult")
		public Ccna1_4Results updateCcna1_4StudentResult(@RequestBody Ccna1_4Results ccna1_4Results) {
			
			return ccna1_4ResultsRepository.save(ccna1_4Results);
		}
		
		@PutMapping("/updateCcna1_5StudentResult")
		public Ccna1_5Results updateCcna1_5StudentResult(@RequestBody Ccna1_5Results ccna1_5Results) {
			
			return ccna1_5ResultsRepository.save(ccna1_5Results);
		}
		
		@PutMapping("/updateCcna1_6StudentResult")
		public Ccna1_6Results updateCcna1_6StudentResult(@RequestBody Ccna1_6Results ccna1_6Results) {
			
			return ccna1_6ResultsRepository.save(ccna1_6Results);
		}
		
		@PutMapping("/updateCcna1_7StudentResult")
		public Ccna1_7Results updateCcna1_7StudentResult(@RequestBody Ccna1_7Results ccna1_7Results) {
			
			return ccna1_7ResultsRepository.save(ccna1_7Results);
		}
		
		
		
		
		
		
		
		// CCNA STUDENTS DELETE RESULTS MEHTODS
		
		@DeleteMapping("/deleteCcna1_1StudentResult/{student_id}")
		public void deleteCcna1_1StudentResult(@PathVariable("student_id") String student_id) {
			
			ccna1_1ResultsRepository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_2StudentResult/{student_id}")
		public void deleteCcna1_2StudentResult(@PathVariable("student_id") String student_id) {
			
			ccna1_2ResultsRepository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_3StudentResult/{student_id}")
		public void deleteCcna1_3StudentResult(@PathVariable("student_id") String student_id) {
			
			ccna1_3ResultsRepository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_4StudentResult/{student_id}")
		public void deleteCcna1_4StudentResult(@PathVariable("student_id") String student_id) {
			
			ccna1_4ResultsRepository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_5StudentResult/{student_id}")
		public void deleteCcna1_5StudentResult(@PathVariable("student_id") String student_id) {
			
			ccna1_5ResultsRepository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_6StudentResult/{student_id}")
		public void deleteCcna1_6StudentResult(@PathVariable("student_id") String student_id) {
			
			ccna1_6ResultsRepository.deleteById(student_id);
		}
		
		@DeleteMapping("/deleteCcna1_7StudentResult/{student_id}")
		public void deleteCcna1_7StudentResult(@PathVariable("student_id") String student_id) {
			
			ccna1_7ResultsRepository.deleteById(student_id);
		}
		
	
	
	
}
