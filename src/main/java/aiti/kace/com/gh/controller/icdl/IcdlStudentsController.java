package aiti.kace.com.gh.controller.icdl;

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

import aiti.kace.com.gh.entities.Icdl1_1Info;
import aiti.kace.com.gh.entities.Icdl1_1Results;
import aiti.kace.com.gh.entities.Icdl1_2Info;
import aiti.kace.com.gh.entities.Icdl1_2Results;
import aiti.kace.com.gh.entities.Icdl1_3Info;
import aiti.kace.com.gh.entities.Icdl1_3Results;
import aiti.kace.com.gh.entities.Icdl1_4Info;
import aiti.kace.com.gh.entities.Icdl1_4Results;
import aiti.kace.com.gh.entities.Icdl1_5Info;
import aiti.kace.com.gh.entities.Icdl1_5Results;
import aiti.kace.com.gh.entities.Icdl1_6Info;
import aiti.kace.com.gh.entities.Icdl1_6Results;
import aiti.kace.com.gh.entities.Icdl1_7Info;
import aiti.kace.com.gh.entities.Icdl1_7Results;
import aiti.kace.com.gh.repositories.Icdl1_1Repository;
import aiti.kace.com.gh.repositories.Icdl1_1ResultsRepository;
import aiti.kace.com.gh.repositories.Icdl1_2Repository;
import aiti.kace.com.gh.repositories.Icdl1_2ResultsRepository;
import aiti.kace.com.gh.repositories.Icdl1_3Repository;
import aiti.kace.com.gh.repositories.Icdl1_3ResultsRepository;
import aiti.kace.com.gh.repositories.Icdl1_4Repository;
import aiti.kace.com.gh.repositories.Icdl1_4ResultsRepository;
import aiti.kace.com.gh.repositories.Icdl1_5Repository;
import aiti.kace.com.gh.repositories.Icdl1_5ResultsRepository;
import aiti.kace.com.gh.repositories.Icdl1_6Repository;
import aiti.kace.com.gh.repositories.Icdl1_6ResultsRepository;
import aiti.kace.com.gh.repositories.Icdl1_7Repository;
import aiti.kace.com.gh.repositories.Icdl1_7ResultsRepository;

@RestController
@RequestMapping("/aitiIcdlStudentsAPI")
public class IcdlStudentsController {
	
	
	
	
	
	
			//ICDL1.1
			@Autowired
			Icdl1_1Repository icdl1_1Repository;
			
			@Autowired
			Icdl1_1ResultsRepository icdl1_1ResultsRepository;
			
			//ICDL1.2
			@Autowired
			Icdl1_2ResultsRepository icdl1_2ResultsRepository;
			
			@Autowired
			Icdl1_2Repository icdl1_2Repository;
			
			//ICDL1.3
			@Autowired
			Icdl1_3ResultsRepository icdl1_3ResultsRepository;
			
			@Autowired
			Icdl1_3Repository icdl1_3Repository;
			
			//ICDL1.4
			@Autowired
			Icdl1_4ResultsRepository icdl1_4ResultsRepository;
			
			@Autowired
			Icdl1_4Repository icdl1_4Repository;
			
			//ICDL1.5
			@Autowired
			Icdl1_5ResultsRepository icdl1_5ResultsRepository;
			
			@Autowired
			Icdl1_5Repository icdl1_5Repository;
			
			//ICDL1.6
			@Autowired
			Icdl1_6ResultsRepository icdl1_6ResultsRepository;
			
			@Autowired
			Icdl1_6Repository icdl1_6Repository;
			
			//ICDL1.7
			@Autowired
			Icdl1_7ResultsRepository icdl1_7ResultsRepository;
			
			@Autowired
			Icdl1_7Repository icdl1_7Repository;
			
			
			
			
		//  ICDL FIND ALL STDUENTS METHODS
			
			@GetMapping("/getAllIcdl1_1Students")
			public List<Icdl1_1Info> getAllIcdl1_1Students(){
				
				return icdl1_1Repository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_2Students")
			public List<Icdl1_2Info> getAllIcdl1_2Students(){
				
				return icdl1_2Repository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_3Students")
			public List<Icdl1_3Info> getAllIcdl1_3Students(){
				
				return icdl1_3Repository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_4Students")
			public List<Icdl1_4Info> getAllIcdl1_4Students(){
				
				return icdl1_4Repository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_5Students")
			public List<Icdl1_5Info> getAllIcdl1_5Students(){
				
				return icdl1_5Repository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_6Students")
			public List<Icdl1_6Info> Icdl1(){
				
				return icdl1_6Repository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_7Students")
			public List<Icdl1_7Info> getAllIcdl1_7Students(){
				
				return icdl1_7Repository.findAll();
				
			}

			
			
					//  ICDL STDUENTS FIND A SINGLE STUDENT METHODS
			
			
			@GetMapping("/getIcdl1_1Student/{student_id}")
			public Icdl1_1Info getIcdl1_1Student(@PathVariable("student_id") String student_id) {
				
				return icdl1_1Repository.findById(student_id).get();
			}
			
			@GetMapping("/getIcdl1_2Student/{student_id}")
			public Icdl1_2Info getIcdl1_2Student(@PathVariable("student_id") String student_id) {
				
				return icdl1_2Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getIcdl1_3Student/{student_id}")
			public Icdl1_3Info getIcdl1_3Student(@PathVariable("student_id") String student_id) {
				
				return icdl1_3Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getIcdl1_4Student/{student_id}")
			public Icdl1_4Info getIcdl1_4Student(@PathVariable("student_id") String student_id) {
				
				return icdl1_4Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getIcdl1_5Student/{student_id}")
			public Icdl1_5Info getIcdl1_5Student(@PathVariable("student_id") String student_id) {
				
				return icdl1_5Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getIcdl1_6Student/{student_id}")
			public Icdl1_6Info getIcdl1_6Student(@PathVariable("student_id") String student_id) {
				
				return icdl1_6Repository.findById(student_id).get();
			}
			
			
			@GetMapping("/getIcdl1_7Student/{student_id}")
			public Icdl1_7Info getIcdl1_7Student(@PathVariable("student_id") String student_id) {
				
				return icdl1_7Repository.findById(student_id).get();
			}
			
			
			
			
			
			//  CCNA STUDENTS CREATE METHODS
			
			
			
			@PostMapping("/createIcdl1_1Student")
			public Icdl1_1Info createIcdl1_1Student(@RequestBody Icdl1_1Info icdl1_1Info) {
				
				return icdl1_1Repository.save(icdl1_1Info);
			}
			
			@PostMapping("/createIcdl1_2Student")
			public Icdl1_2Info createIcdl1_2Student(@RequestBody Icdl1_2Info icdl1_2Info) {
				
				return icdl1_2Repository.save(icdl1_2Info);
			}
			
			@PostMapping("/createIcdl1_3Student")
			public Icdl1_3Info creatIcdl1_3Student(@RequestBody Icdl1_3Info icdl1_3Info) {
				
				return icdl1_3Repository.save(icdl1_3Info);
			}
			
			@PostMapping("/createIcdl1_4Student")
			public Icdl1_4Info createIcdl1_4Student(@RequestBody Icdl1_4Info icdl1_4Info) {
				
				return icdl1_4Repository.save(icdl1_4Info);
			}
			
			@PostMapping("/createIcdl1_5Student")
			public Icdl1_5Info createIcdl1_5Student(@RequestBody Icdl1_5Info icdl1_5Info) {
				
				return icdl1_5Repository.save(icdl1_5Info);
			}
			
			@PostMapping("/createIcdl1_6Student")
			public Icdl1_6Info createIcdl1_6Student(@RequestBody Icdl1_6Info icdl1_6Info) {
				
				return icdl1_6Repository.save(icdl1_6Info);
			}
			
			@PostMapping("/createIcdl1_7Student")
			public Icdl1_7Info createIcdl1_7Student(@RequestBody Icdl1_7Info icdl1_7Info) {
				
				return icdl1_7Repository.save(icdl1_7Info);
			}
			
			
			
			
			
			
			
						//  CSD STUDENTS UPDATE METHODS
			
			
			@PutMapping("/updateIcdl1_1Student")
			public Icdl1_1Info updateIcdl1_1Student(@RequestBody Icdl1_1Info icdl1_1Info) {
				
				return icdl1_1Repository.save(icdl1_1Info);
			}
			
			@PutMapping("/updateIcdl1_2Student")
			public Icdl1_2Info updateIcdl1_2Student(@RequestBody Icdl1_2Info icdl1_2Info) {
				
				return icdl1_2Repository.save(icdl1_2Info);
			}
			
			@PutMapping("/updateIcdl1_3Student")
			public Icdl1_3Info updateIcdl1_3Student(@RequestBody Icdl1_3Info icdl1_3Info) {
				
				return icdl1_3Repository.save(icdl1_3Info);
			}
			
			@PutMapping("/updateIcdl1_4Student")
			public Icdl1_4Info updateIcdl1_4Student(@RequestBody Icdl1_4Info icdl1_4Info) {
				
				return icdl1_4Repository.save(icdl1_4Info);
			}
			
			@PutMapping("/updateIcdl1_5Student")
			public Icdl1_5Info updateIcdl1_5Student(@RequestBody Icdl1_5Info icdl1_5Info) {
				
				return icdl1_5Repository.save(icdl1_5Info);
			}
			
			@PutMapping("/updateIcdl1_6Student")
			public Icdl1_6Info updateIcdl1_6Student(@RequestBody Icdl1_6Info icdl1_6Info) {
				
				return icdl1_6Repository.save(icdl1_6Info);
			}
			
			@PutMapping("/updateIcdl1_7Student")
			public Icdl1_7Info updateIcdl1_7Student(@RequestBody Icdl1_7Info icdl1_7Info) {
				
				return icdl1_7Repository.save(icdl1_7Info);
			}
			
			
			
			
			
			
			
			
			
			
					//  ICDL STUDENTS DELETE METHODS
			
			
			@DeleteMapping("/deleteIcdl1_1Student/{student_id}")
			public void deleteIcdl1_1Student(@PathVariable("student_id") String student_id) {
				
				icdl1_1Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_2Student/{student_id}")
			public void deleteIcdl1_2Student(@PathVariable("student_id") String student_id) {
				
				icdl1_2Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_3Student/{student_id}")
			public void deleteIcdl1_3Student(@PathVariable("student_id") String student_id) {
				
				icdl1_3Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_4Student/{student_id}")
			public void deleteIcdl1_4Student(@PathVariable("student_id") String student_id) {
				
				icdl1_4Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_5Student/{student_id}")
			public void deleteIcdl1_5Student(@PathVariable("student_id") String student_id) {
				
				icdl1_5Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_6Student/{student_id}")
			public void deleteIcdl1_6Student(@PathVariable("student_id") String student_id) {
				
				icdl1_6Repository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_7Student/{student_id}")
			public void deleteIcdl1_7Student(@PathVariable("student_id") String student_id) {
				
				icdl1_7Repository.deleteById(student_id);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
							// ICDL GET ALL STUDENTS RESULTS MEHTODS
			
			
			
			@GetMapping("/getAllIcdl1_1StudentResults")
			public List<Icdl1_1Results> getAllIcdl1_1StudentResults(){
				
				return icdl1_1ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_2StudentResults")
			public List<Icdl1_2Results> getAllIcdl1_2StudentResults(){
				
				return icdl1_2ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_3StudentResults")
			public List<Icdl1_3Results> getAllIcdl1_3StudentResults(){
				
				return icdl1_3ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_4StudentResults")
			public List<Icdl1_4Results> getAllIcdl1_4StudentResults(){
				
				return icdl1_4ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_5StudentResults")
			public List<Icdl1_5Results> getAllIcdl1_5StudentResults(){
				
				return icdl1_5ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_6StudentResults")
			public List<Icdl1_6Results> getAllIcdl1_6StudentResults(){
				
				return icdl1_6ResultsRepository.findAll();
				
			}
			
			@GetMapping("/getAllIcdl1_7StudentResults")
			public List<Icdl1_7Results> getAllIcdl1_7StudentResults(){
				
				return icdl1_7ResultsRepository.findAll();
				
			}

			
			
			
			
			
			
			
			
			// ICDL GET A SINGLE STUDENT RESULTS MEHTODS
			
			
			@GetMapping("/getIcdl1_1StudentResult/{student_id}")
			public Icdl1_1Results getIcdl1_1StudentResult(@PathVariable("student_id") String student_id) {
				
				return icdl1_1ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getIcdl1_2StudentResult/{student_id}")
			public Icdl1_2Results getIcdl1_2StudentResult(@PathVariable("student_id") String student_id) {
				
				return icdl1_2ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getIcdl1_3StudentResult/{student_id}")
			public Icdl1_3Results getIcdl1_3StudentResult(@PathVariable("student_id") String student_id) {
				
				return icdl1_3ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getIcdl1_4StudentResult/{student_id}")
			public Icdl1_4Results getIcdl1_4StudentResult(@PathVariable("student_id") String student_id) {
				
				return icdl1_4ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getIcdl1_5StudentResult/{student_id}")
			public Icdl1_5Results getIcdl1_5StudentResult(@PathVariable("student_id") String student_id) {
				
				return icdl1_5ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getIcdl1_6StudentResult/{student_id}")
			public Icdl1_6Results getIcdl1_6StudentResult(@PathVariable("student_id") String student_id) {
				
				return icdl1_6ResultsRepository.findById(student_id).get();
			}
			
			@GetMapping("/getIcdl1_7StudentResult/{student_id}")
			public Icdl1_7Results getIcdl1_7StudentResult(@PathVariable("student_id") String student_id) {
				
				return icdl1_7ResultsRepository.findById(student_id).get();
			}
			
			
			
			
			
			
			
			
			
			
			// ICDL CREATE STUDENT RESULTS MEHTODS
			
			
			@PostMapping("/createIcdl1_1StudentResult")
			public Icdl1_1Results createIcdl1_1StudentResult(@RequestBody Icdl1_1Results icdl1_1Results) {
				
				return icdl1_1ResultsRepository.save(icdl1_1Results);
			}
			
			@PostMapping("/createIcdl1_2StudentResult")
			public Icdl1_2Results createIcdl1_2StudentResult(@RequestBody Icdl1_2Results icdl1_2Results) {
				
				return icdl1_2ResultsRepository.save(icdl1_2Results);
			}
			
			@PostMapping("/createIcdl1_3StudentResult")
			public Icdl1_3Results createIcdl1_3StudentResult(@RequestBody Icdl1_3Results icdl1_3Results) {
				
				return icdl1_3ResultsRepository.save(icdl1_3Results);
			}
			
			@PostMapping("/createIcdl1_4StudentResult")
			public Icdl1_4Results createIcdl1_4StudentResult(@RequestBody Icdl1_4Results icdl1_4Results) {
				
				return icdl1_4ResultsRepository.save(icdl1_4Results);
			}
			
			@PostMapping("/createIcdl1_5StudentResult")
			public Icdl1_5Results createIcdl1_5StudentResult(@RequestBody Icdl1_5Results icdl1_5Results) {
				
				return icdl1_5ResultsRepository.save(icdl1_5Results);
			}
			
			@PostMapping("/createIcdl1_6StudentResult")
			public Icdl1_6Results createIcdl1_6StudentResult(@RequestBody Icdl1_6Results icdl1_6Results) {
				
				return icdl1_6ResultsRepository.save(icdl1_6Results);
			}
			
			@PostMapping("/createIcdl1_7StudentResult")
			public Icdl1_7Results createIcdl1_7StudentResult(@RequestBody Icdl1_7Results icdl1_7Results) {
				
				return icdl1_7ResultsRepository.save(icdl1_7Results);
			}
			
			
			
			
			
			
			// ICDL STUDENTS UPDATE RESULTS MEHTODS
			
			@PutMapping("/updateIcdl1_1StudentResult")
			public Icdl1_1Results updateIcdl1_1StudentResult(@RequestBody Icdl1_1Results icdl1_1Results) {
				
				return icdl1_1ResultsRepository.save(icdl1_1Results);
			}
			
			@PutMapping("/updateIcdl1_2StudentResult")
			public Icdl1_2Results updateIcdl1_2StudentResult(@RequestBody Icdl1_2Results icdl1_2Results) {
				
				return icdl1_2ResultsRepository.save(icdl1_2Results);
			}
			
			@PutMapping("/updateIcdl1_3StudentResult")
			public Icdl1_3Results updateIcdl1_3StudentResult(@RequestBody Icdl1_3Results icdl1_3Results) {
				
				return icdl1_3ResultsRepository.save(icdl1_3Results);
			}
			
			@PutMapping("/updateIcdl1_4StudentResult")
			public Icdl1_4Results updateIcdl1_4StudentResult(@RequestBody Icdl1_4Results icdl1_4Results) {
				
				return icdl1_4ResultsRepository.save(icdl1_4Results);
			}
			
			@PutMapping("/updateIcdl1_5StudentResult")
			public Icdl1_5Results updateIcdl1_5StudentResult(@RequestBody Icdl1_5Results icdl1_5Results) {
				
				return icdl1_5ResultsRepository.save(icdl1_5Results);
			}
			
			@PutMapping("/updateIcdl1_6StudentResult")
			public Icdl1_6Results updateIcdl1_6StudentResult(@RequestBody Icdl1_6Results icdl1_6Results) {
				
				return icdl1_6ResultsRepository.save(icdl1_6Results);
			}
			
			@PutMapping("/updateIcdl1_7StudentResult")
			public Icdl1_7Results updateIcdl1_7StudentResult(@RequestBody Icdl1_7Results icdl1_7Results) {
				
				return icdl1_7ResultsRepository.save(icdl1_7Results);
			}
			
			
			
			
			
			
			
			// ICDL STUDENTS DELETE RESULTS MEHTODS
			
			@DeleteMapping("/deleteIcdl1_1StudentResult/{student_id}")
			public void deleteIcdl1_1StudentResult(@PathVariable("student_id") String student_id) {
				
				icdl1_1ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_2StudentResult/{student_id}")
			public void deleteIcdl1_2StudentResult(@PathVariable("student_id") String student_id) {
				
				icdl1_2ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_3StudentResult/{student_id}")
			public void deleteIcdl1_3StudentResult(@PathVariable("student_id") String student_id) {
				
				icdl1_3ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_4StudentResult/{student_id}")
			public void deleteIcdl1_4StudentResult(@PathVariable("student_id") String student_id) {
				
				icdl1_4ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_5StudentResult/{student_id}")
			public void deleteIcdl1_5StudentResult(@PathVariable("student_id") String student_id) {
				
				icdl1_5ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_6StudentResult/{student_id}")
			public void deleteIcdl1_6StudentResult(@PathVariable("student_id") String student_id) {
				
				icdl1_6ResultsRepository.deleteById(student_id);
			}
			
			@DeleteMapping("/deleteIcdl1_7StudentResult/{student_id}")
			public void deleteIcdl1_7StudentResult(@PathVariable("student_id") String student_id) {
				
				icdl1_7ResultsRepository.deleteById(student_id);
			}
	
	
	
	
	
}
