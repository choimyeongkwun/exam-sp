package com.exam.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.sp.dao.examDAO;
import com.exam.sp.service.examService;
import com.exam.sp.vo.Exam;
@Service
public class examServiceImpl implements examService {

	@Autowired
	private examDAO edao;

	@Override
	public List<Exam> getExamList() {
		// TODO Auto-generated method stub
		return edao.getExamList();
	}

	@Override
	public Exam getExam(int spnum) {
		// TODO Auto-generated method stub
		return edao.getExam(spnum);
	}

	@Override
	public int insertExam(Exam t) {
		// TODO Auto-generated method stub
		return edao.insertExam(t);
	}

	@Override
	public int updateExam(Exam t) {
		// TODO Auto-generated method stub
		return edao.updateExam(t);
	}

	@Override
	public int deleteExam(int spnum) {
		// TODO Auto-generated method stub
		return edao.deleteExam(spnum);
	}
	
	
}
