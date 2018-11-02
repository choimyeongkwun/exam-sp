package com.exam.sp.service;

import java.util.List;

import com.exam.sp.vo.Exam;

public interface examService {

	public List<Exam> getExamList();
	public Exam getExam(int spnum);
	public int insertExam(Exam t);	
	public int updateExam(Exam t);
	public int deleteExam(int spnum);
}
