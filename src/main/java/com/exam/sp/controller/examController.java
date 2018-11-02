package com.exam.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.sp.service.examService;
import com.exam.sp.vo.Exam;


@Controller
public class examController {
	
	@Autowired
	private examService es;
	
	@GetMapping(value="/exams")
	public @ResponseBody List<Exam> getExamList(){
		return es.getExamList(); 
	}

	@GetMapping(value="/exams/{spnum}")
	public @ResponseBody Exam getExam(@PathVariable int spnum) {
		return es.getExam(spnum);
	}
	@PostMapping(value="/exams/{spnum}")
	public @ResponseBody int insertExam(@RequestBody Exam t) {
		return es.insertExam(t);
	}
	@PutMapping(value="/exams/{spnum}")
	public @ResponseBody int updateExam(@RequestBody Exam t) {
		return es.updateExam(t);
	}
	@DeleteMapping(value="/exams/{spnum}")
	public @ResponseBody int deleteExam(@PathVariable int spnum) {
		return es.deleteExam(spnum);
	}
}

