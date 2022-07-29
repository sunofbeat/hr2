package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public interface LaborerDao {
	List<Laborer> selectLaborers();
	Laborer selectLaborer(int laborerId);
	int insertLaborer(String laborerName, LocalDate regDate);
	int updateLaborer(Laborer laborer);
	int deleteLaborer(int laborerId);	
}
