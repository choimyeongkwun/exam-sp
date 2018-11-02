package com.exam.sp.dao;

import java.util.List;

import com.exam.sp.vo.Exam;

public interface examDAO {

	public List<Exam> getExamList();
	public Exam getExam(int spnum);
	public int insertExam(Exam t);	
	public int updateExam(Exam t);
	public int deleteExam(int spnum);
}
