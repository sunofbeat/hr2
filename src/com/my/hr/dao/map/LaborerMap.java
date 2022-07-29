package com.my.hr.dao.map;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.my.hr.domain.Laborer;

public interface LaborerMap {
	List<Laborer> selectLaborers();
	Laborer selectLaborer(int laborerId);
	int insertLaborer(@Param("laborerName")String laborerName,
					@Param("regDate") LocalDate regDate);
	int updateLaborer(Laborer laborer);
	int deleteLaborer(int laborerId);
}
