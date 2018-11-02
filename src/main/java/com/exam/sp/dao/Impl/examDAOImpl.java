package com.exam.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.sp.dao.examDAO;
import com.exam.sp.vo.Exam;
@Repository
public class examDAOImpl implements examDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Exam> getExamList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.exam.sp.EXAM.selectEXAMList");
	}

	@Override
	public Exam getExam(int spnum) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.exam.sp.EXAM.selectEXAM");
	}

	@Override
	public int insertExam(Exam t) {
		// TODO Auto-generated method stub
		return ss.insert("com.exam.sp.EXAM.insertEXAM");
	}

	@Override
	public int updateExam(Exam t) {
		// TODO Auto-generated method stub
		return ss.update("com.exam.sp.EXAM.updateEXAM");
	}

	@Override
	public int deleteExam(int spnum) {
		// TODO Auto-generated method stub
		return ss.delete("com.exam.sp.EXAM.deleteEXAM");
	}

	

}
