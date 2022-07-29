package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.config.Configuration;
import com.my.hr.dao.map.LaborerMap;
import com.my.hr.domain.Laborer;

public class LaborerDaoImpl implements LaborerDao{
	private LaborerMap laborerMap;
		
	public LaborerDaoImpl() {
		this.laborerMap = Configuration.getMapper(LaborerMap.class);
	}
	
	@Override
	public List<Laborer> selectLaborers(){
		return laborerMap.selectLaborers();
	}
	
	@Override
	public Laborer selectLaborer(int laborerId) {
		return laborerMap.selectLaborer(laborerId);
	}
	
	@Override
	public int insertLaborer(String laborerName, LocalDate regDate) {
		return laborerMap.insertLaborer(laborerName, regDate);
	}
	
	@Override
	public int updateLaborer(Laborer laborer) {		
		return laborerMap.updateLaborer(laborer);
	}
	
	@Override
	public int deleteLaborer(int laborerId) {
		return laborerMap.deleteLaborer(laborerId);
	}
}
