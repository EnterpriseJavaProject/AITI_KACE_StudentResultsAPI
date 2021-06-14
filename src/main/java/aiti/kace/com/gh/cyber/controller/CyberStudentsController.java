package aiti.kace.com.gh.cyber.controller;

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

import aiti.kace.com.gh.entities.CyberSecurity1_1Info;
import aiti.kace.com.gh.entities.CyberSecurity1_1Results;
import aiti.kace.com.gh.entities.CyberSecurity1_2Info;
import aiti.kace.com.gh.entities.CyberSecurity1_2Results;
import aiti.kace.com.gh.entities.CyberSecurity1_3Info;
import aiti.kace.com.gh.entities.CyberSecurity1_3Results;
import aiti.kace.com.gh.entities.CyberSecurity1_4Info;
import aiti.kace.com.gh.entities.CyberSecurity1_4Results;
import aiti.kace.com.gh.entities.CyberSecurity1_5Info;
import aiti.kace.com.gh.entities.CyberSecurity1_5Results;
import aiti.kace.com.gh.entities.CyberSecurity1_6Info;
import aiti.kace.com.gh.entities.CyberSecurity1_6Results;
import aiti.kace.com.gh.entities.CyberSecurity1_7Info;
import aiti.kace.com.gh.entities.CyberSecurity1_7Results;
import aiti.kace.com.gh.repositories.CyberSecurity1_1Repository;
import aiti.kace.com.gh.repositories.CyberSecurity1_1ResultsRepository;
import aiti.kace.com.gh.repositories.CyberSecurity1_2Repository;
import aiti.kace.com.gh.repositories.CyberSecurity1_2ResultsRepository;
import aiti.kace.com.gh.repositories.CyberSecurity1_3Repository;
import aiti.kace.com.gh.repositories.CyberSecurity1_3ResultsRepository;
import aiti.kace.com.gh.repositories.CyberSecurity1_4Repository;
import aiti.kace.com.gh.repositories.CyberSecurity1_4ResultsRepository;
import aiti.kace.com.gh.repositories.CyberSecurity1_5Repository;
import aiti.kace.com.gh.repositories.CyberSecurity1_5ResultsRepository;
import aiti.kace.com.gh.repositories.CyberSecurity1_6Repository;
import aiti.kace.com.gh.repositories.CyberSecurity1_6ResultsRepository;
import aiti.kace.com.gh.repositories.CyberSecurity1_7Repository;
import aiti.kace.com.gh.repositories.CyberSecurity1_7ResultsRepository;

@RestController
@RequestMapping("/aitiCyberSecurityStudentsAPI")
public class CyberStudentsController {
	
	
	
	
	
			//CYBER_SECURITY1.1
			@Autowired
			CyberSecurity1_1Repository cyberSecurity1_1Repository;
			
			@Autowired
			CyberSecurity1_1ResultsRepository cyberSecurity1_1ResultsRepository;
			
			//CYBER_SECURITY1.2
			@Autowired
			CyberSecurity1_2ResultsRepository cyberSecurity1_2ResultsRepository;
			
			@Autowired
			CyberSecurity1_2Repository cyberSecurity1_2Repository;
			
			//CYBER_SECURITY1.3
			@Autowired
			CyberSecurity1_3ResultsRepository cyberSecurity1_3ResultsRepository;
			
			@Autowired
			CyberSecurity1_3Repository cyberSecurity1_3Repository;
			
			//CYBER_SECURITY1.4
			@Autowired
			CyberSecurity1_4ResultsRepository cyberSecurity1_4ResultsRepository;
			
			@Autowired
			CyberSecurity1_4Repository cyberSecurity1_4Repository;
			
			//CCNA1.5
			@Autowired
			CyberSecurity1_5ResultsRepository cyberSecurity1_5ResultsRepository;
			
			@Autowired
			CyberSecurity1_5Repository cyberSecurity1_5Repository;
			
			//CYBER_SECURITY1.6
			@Autowired
			CyberSecurity1_6ResultsRepository cyberSecurity1_6ResultsRepository;
			
			@Autowired
			CyberSecurity1_6Repository cyberSecurity1_6Repository;
			
			//CYBER_SECURITY1.7
			@Autowired
			CyberSecurity1_7ResultsRepository cyberSecurity1_7ResultsRepository;
			
			@Autowired
			CyberSecurity1_7Repository cyberSecurity1_7Repository;
			
			
			
			
		//  CYBER_SECURITY FIND ALL STDUENTS METHODS
			
			@GetMapping("/getAllCyberSecurity1_1Students")
			public List<CyberSecurity1_1Info> getAllCyberSecurity1_1Students(){
				
				return cyberSecurity1_1Repository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_2Students")
			public List<CyberSecurity1_2Info> getAllCyberSecurity1_2Students(){
				
				return cyberSecurity1_2Repository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_3Students")
			public List<CyberSecurity1_3Info> getAllCyberSecurity1_3Students(){
				
				return cyberSecurity1_3Repository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_4Students")
			public List<CyberSecurity1_4Info> getAllCyberSecurity1_4Students(){
				
				return cyberSecurity1_4Repository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_5Students")
			public List<CyberSecurity1_5Info> getAllCyberSecurity1_5Students(){
				
				return cyberSecurity1_5Repository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_6Students")
			public List<CyberSecurity1_6Info> getAllCyberSecurity1_6Students(){
				
				return cyberSecurity1_6Repository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_7Students")
			public List<CyberSecurity1_7Info> getAllCyberSecurity1_7Students(){
				
				return cyberSecurity1_7Repository.findAll();
				
			}

			
			
					//  CYBER_SECURITY STDUENTS FIND A SINGLE STUDENT METHODS
			
			
			@GetMapping("/getCyberSecurity1_1Student/{student_id}")
			public CyberSecurity1_1Info getCyberSecurity1_1Student(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_1Repository.findById(student_id).get();
			}
			
			@GetMapping("/getCyberSecurity1_2Student/{student_id}")
			public CyberSecurity1_2Info getCyberSecurity1_2Student(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_2Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getCyberSecurity1_3Student/{student_id}")
			public CyberSecurity1_3Info getCyberSecurity1_3Student(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_3Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getCyberSecurity1_4Student/{student_id}")
			public CyberSecurity1_4Info getCyberSecurity1_4Student(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_4Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getCyberSecurity1_5Student/{student_id}")
			public CyberSecurity1_5Info getCyberSecurity1_5Student(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_5Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getCyberSecurity1_6Student/{student_id}")
			public CyberSecurity1_6Info getCyberSecurity1_6Student(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_6Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getCyberSecurity1_7Student/{student_id}")
			public CyberSecurity1_7Info getCyberSecurity1_7Student(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_7Repository.findById(student_id).get();
			}
			
			
			
			
			
			//  CYBER_SECURITY STUDENTS CREATE METHODS
			
			
			
			@PostMapping("/createCyberSecurity1_1Student")
			public CyberSecurity1_1Info createCyberSecurity1_1Student(@RequestBody CyberSecurity1_1Info cyberSecurity1_1Info) {
				
				return cyberSecurity1_1Repository.save(cyberSecurity1_1Info);
			}
			
			@PostMapping("/createCyberSecurity1_2Student")
			public CyberSecurity1_2Info createCyberSecurity1_2Student(@RequestBody CyberSecurity1_2Info cyberSecurity1_2Info) {
				
				return cyberSecurity1_2Repository.save(cyberSecurity1_2Info);
			}
			
			@PostMapping("/createCyberSecurity1_3Student")
			public CyberSecurity1_3Info creatCyberSecurity1_3Student(@RequestBody CyberSecurity1_3Info cyberSecurity1_3Info) {
				
				return cyberSecurity1_3Repository.save(cyberSecurity1_3Info);
			}
			
			@PostMapping("/createCyberSecurity1_4Student")
			public CyberSecurity1_4Info createCyberSecurity1_4Student(@RequestBody CyberSecurity1_4Info cyberSecurity1_4Info) {
				
				return cyberSecurity1_4Repository.save(cyberSecurity1_4Info);
			}
			
			@PostMapping("/createCyberSecurity1_5Student")
			public CyberSecurity1_5Info createCyberSecurity1_5Student(@RequestBody CyberSecurity1_5Info cyberSecurity1_5Info) {
				
				return cyberSecurity1_5Repository.save(cyberSecurity1_5Info);
			}
			
			@PostMapping("/createCyberSecurity1_6Student")
			public CyberSecurity1_6Info createCyberSecurity1_6Student(@RequestBody CyberSecurity1_6Info cyberSecurity1_6Info) {
				
				return cyberSecurity1_6Repository.save(cyberSecurity1_6Info);
			}
			
			@PostMapping("/createCyberSecurity1_7Student")
			public CyberSecurity1_7Info createCyberSecurity1_7Student(@RequestBody CyberSecurity1_7Info cyberSecurity1_7Info) {
				
				return cyberSecurity1_7Repository.save(cyberSecurity1_7Info);
			}
			
			
			
			
			
			
			
						//  CYBER_SECURITY STUDENTS UPDATE METHODS
			
			
			@PutMapping("/updateCyberSecurity1_1Student")
			public CyberSecurity1_1Info updateCyberSecurity1_1Student(@RequestBody CyberSecurity1_1Info cyberSecurity1_1Info) {
				
				return cyberSecurity1_1Repository.save(cyberSecurity1_1Info);
			}
			
			@PutMapping("/updateCyberSecurity1_2Student")
			public CyberSecurity1_2Info updateCyberSecurity1_2Student(@RequestBody CyberSecurity1_2Info cyberSecurity1_2Info) {
				
				return cyberSecurity1_2Repository.save(cyberSecurity1_2Info);
			}
			
			@PutMapping("/updateCyberSecurity1_3Student")
			public CyberSecurity1_3Info updateCyberSecurity1_3Student(@RequestBody CyberSecurity1_3Info cyberSecurity1_3Info) {
				
				return cyberSecurity1_3Repository.save(cyberSecurity1_3Info);
			}
			
			@PutMapping("/updateCyberSecurity1_4Student")
			public CyberSecurity1_4Info updateCyberSecurity1_4Student(@RequestBody CyberSecurity1_4Info cyberSecurity1_4Info) {
				
				return cyberSecurity1_4Repository.save(cyberSecurity1_4Info);
			}
			
			@PutMapping("/updateCyberSecurity1_5Student")
			public CyberSecurity1_5Info updateCyberSecurity1_5Student(@RequestBody CyberSecurity1_5Info cyberSecurity1_5Info) {
				
				return cyberSecurity1_5Repository.save(cyberSecurity1_5Info);
			}
			
			@PutMapping("/updateCyberSecurity1_6Student")
			public CyberSecurity1_6Info updateCyberSecurity1_6Student(@RequestBody CyberSecurity1_6Info cyberSecurity1_6Info) {
				
				return cyberSecurity1_6Repository.save(cyberSecurity1_6Info);
			}
			
			@PutMapping("/updateCyberSecurity1_7Student")
			public CyberSecurity1_7Info updateCyberSecurity1_7Student(@RequestBody CyberSecurity1_7Info cyberSecurity1_7Info) {
				
				return cyberSecurity1_7Repository.save(cyberSecurity1_7Info);
			}
			
			
			
			
			
			
			
			
			
			
					//  CYBER_SECURITY STUDENTS DELETE METHODS
			
			
			@DeleteMapping("/deleteCyberSecurity1_1Student/{student_id}")
			public void deleteCyberSecurity1_1Student(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_1Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_2Student/{student_id}")
			public void deleteCyberSecurity1_2Student(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_2Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_3Student/{student_id}")
			public void deleteCyberSecurity1_3Student(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_3Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_4Student/{student_id}")
			public void deleteCyberSecurity1_4Student(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_4Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_5Student/{student_id}")
			public void deleteCyberSecurity1_5Student(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_5Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_6Student/{student_id}")
			public void deleteCyberSecurity1_6Student(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_6Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_7Student/{student_id}")
			public void deleteCyberSecurity1_7Student(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_7Repository.deleteById(student_id);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
							// CYBER_SECURITY GET ALL STUDENTS RESULTS MEHTODS
			
			
			
			@GetMapping("/getAllCyberSecurity1_1StudentResults")
			public List<CyberSecurity1_1Results> getAllCyberSecurity1_1StudentResults(){
				
				return cyberSecurity1_1ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_2StudentResults")
			public List<CyberSecurity1_2Results> getAllCyberSecurity1_2StudentResults(){
				
				return cyberSecurity1_2ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_3StudentResults")
			public List<CyberSecurity1_3Results> getAllCyberSecurity1_3StudentResults(){
				
				return cyberSecurity1_3ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_4StudentResults")
			public List<CyberSecurity1_4Results> getAllCyberSecurity1_4StudentResults(){
				
				return cyberSecurity1_4ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_5StudentResults")
			public List<CyberSecurity1_5Results> getAllCyberSecurity1_5StudentResults(){
				
				return cyberSecurity1_5ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_6StudentResults")
			public List<CyberSecurity1_6Results> getAllCyberSecurity1_6StudentResults(){
				
				return cyberSecurity1_6ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllCyberSecurity1_7StudentResults")
			public List<CyberSecurity1_7Results> getAllCyberSecurity1_7StudentResults(){
				
				return cyberSecurity1_7ResultsRepository.findAll();
				
			}

			
			
			
			
			
			
			
			
			// CYBER_SECURITY GET A SINGLE STUDENT RESULTS MEHTODS
			
			
			@GetMapping("/getCyberSecurity1_1StudentResult/{student_id}")
			public CyberSecurity1_1Results getCyberSecurity1_1StudentResult(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_1ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getCyberSecurity1_2StudentResult/{student_id}")
			public CyberSecurity1_2Results getCyberSecurity1_2StudentResult(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_2ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getCyberSecurity1_3StudentResult/{student_id}")
			public CyberSecurity1_3Results getCyberSecurity1_3StudentResult(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_3ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getCyberSecurity1_4StudentResult/{student_id}")
			public CyberSecurity1_4Results getCyberSecurity1_4StudentResult(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_4ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getCyberSecurity1_5StudentResult/{student_id}")
			public CyberSecurity1_5Results getCyberSecurity1_5StudentResult(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_5ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getCyberSecurity1_6StudentResult/{student_id}")
			public CyberSecurity1_6Results getCyberSecurity1_6StudentResult(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_6ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getCyberSecurity1_7StudentResult/{student_id}")
			public CyberSecurity1_7Results getCyberSecurity1_7StudentResult(@PathVariable("student_id") String student_id) {
				
				return cyberSecurity1_7ResultsRepository.findById(student_id).get();
			}
			
			
			
			
			
			
			
			
			
			
			// CYBER_SECURITY CREATE STUDENT RESULTS MEHTODS
			
			
			@PostMapping("/createCyberSecurity1_1StudentResult")
			public CyberSecurity1_1Results createCyberSecurity1_1StudentResult(@RequestBody CyberSecurity1_1Results cyberSecurity1_1Results) {
				
				return cyberSecurity1_1ResultsRepository.save(cyberSecurity1_1Results);
			}
			
			@PostMapping("/createCyberSecurity1_2StudentResult")
			public CyberSecurity1_2Results createCyberSecurity1_2StudentResult(@RequestBody CyberSecurity1_2Results cyberSecurity1_2Results) {
				
				return cyberSecurity1_2ResultsRepository.save(cyberSecurity1_2Results);
			}
			
			@PostMapping("/createCyberSecurity1Ccna1_3StudentResult")
			public CyberSecurity1_3Results createCyberSecurity1_3StudentResult(@RequestBody CyberSecurity1_3Results cyberSecurity1_3Results) {
				
				return cyberSecurity1_3ResultsRepository.save(cyberSecurity1_3Results);
			}
			
			@PostMapping("/createCyberSecurity1_4StudentResult")
			public CyberSecurity1_4Results createCyberSecurity1_4StudentResult(@RequestBody CyberSecurity1_4Results cyberSecurity1_4Results) {
				
				return cyberSecurity1_4ResultsRepository.save(cyberSecurity1_4Results);
			}
			
			@PostMapping("/createCyberSecurity1_5StudentResult")
			public CyberSecurity1_5Results createCyberSecurity1_5StudentResult(@RequestBody CyberSecurity1_5Results cyberSecurity1_5Results) {
				
				return cyberSecurity1_5ResultsRepository.save(cyberSecurity1_5Results);
			}
			
			@PostMapping("/createCyberSecurity1_6StudentResult")
			public CyberSecurity1_6Results createCyberSecurity1_6StudentResult(@RequestBody CyberSecurity1_6Results cyberSecurity1_6Results) {
				
				return cyberSecurity1_6ResultsRepository.save(cyberSecurity1_6Results);
			}
			
			@PostMapping("/createCyberSecurity1_7StudentResult")
			public CyberSecurity1_7Results createCyberSecurity1_7StudentResult(@RequestBody CyberSecurity1_7Results cyberSecurity1_7Results) {
				
				return cyberSecurity1_7ResultsRepository.save(cyberSecurity1_7Results);
			}
			
			
			
			
			
			
			// CYBER_SECURITY STUDENTS UPDATE RESULTS MEHTODS
			
			@PutMapping("/updateCyberSecurity1_1StudentResult")
			public CyberSecurity1_1Results updateCyberSecurity1_1StudentResult(@RequestBody CyberSecurity1_1Results cyberSecurity1_1Results) {
				
				return cyberSecurity1_1ResultsRepository.save(cyberSecurity1_1Results);
			}
			
			@PutMapping("/updateCyberSecurity1_2StudentResult")
			public CyberSecurity1_2Results updateCyberSecurity1_2StudentResult(@RequestBody CyberSecurity1_2Results cyberSecurity1_2Results) {
				
				return cyberSecurity1_2ResultsRepository.save(cyberSecurity1_2Results);
			}
			
			@PutMapping("/updateCyberSecurity1_3StudentResult")
			public CyberSecurity1_3Results updateCyberSecurity1_3StudentResult(@RequestBody CyberSecurity1_3Results cyberSecurity1_3Results) {
				
				return cyberSecurity1_3ResultsRepository.save(cyberSecurity1_3Results);
			}
			
			@PutMapping("/updateCyberSecurity1_4StudentResult")
			public CyberSecurity1_4Results updateCyberSecurity1_4StudentResult(@RequestBody CyberSecurity1_4Results cyberSecurity1_4Results) {
				
				return cyberSecurity1_4ResultsRepository.save(cyberSecurity1_4Results);
			}
			
			@PutMapping("/updateCyberSecurity1_5StudentResult")
			public CyberSecurity1_5Results updateCyberSecurity1_5StudentResult(@RequestBody CyberSecurity1_5Results cyberSecurity1_5Results) {
				
				return cyberSecurity1_5ResultsRepository.save(cyberSecurity1_5Results);
			}
			
			@PutMapping("/updateCyberSecurity1_6StudentResult")
			public CyberSecurity1_6Results updateCyberSecurity1_6StudentResult(@RequestBody CyberSecurity1_6Results cyberSecurity1_6Results) {
				
				return cyberSecurity1_6ResultsRepository.save(cyberSecurity1_6Results);
			}
			
			@PutMapping("/updateCyberSecurity1_7StudentResult")
			public CyberSecurity1_7Results updateCyberSecurity1_7StudentResult(@RequestBody CyberSecurity1_7Results cyberSecurity1_7Results) {
				
				return cyberSecurity1_7ResultsRepository.save(cyberSecurity1_7Results);
			}
			
			
			
			
			
			
			
			// CYBER_SECURITY STUDENTS DELETE RESULTS MEHTODS
			
			@DeleteMapping("/deleteCyberSecurity1_1StudentResult/{student_id}")
			public void deleteCyberSecurity1_1StudentResult(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_1ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_2StudentResult/{student_id}")
			public void deleteCyberSecurity1_2StudentResult(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_2ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_3StudentResult/{student_id}")
			public void deleteCyberSecurity1_3StudentResult(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_3ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_4StudentResult/{student_id}")
			public void deleteCyberSecurity1_4StudentResult(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_4ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_5StudentResult/{student_id}")
			public void deleteCyberSecurity1_5StudentResult(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_5ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_6StudentResult/{student_id}")
			public void deleteCyberSecurity1_6StudentResult(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_6ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteCyberSecurity1_7StudentResult/{student_id}")
			public void deleteCyberSecurity1_7StudentResult(@PathVariable("student_id") String student_id) {
				
				cyberSecurity1_7ResultsRepository.deleteById(student_id);
			}
			
	
}
