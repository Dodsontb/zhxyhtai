package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Grade;
import com.zhxy.domain.People;

public interface GradeService {

	List<Grade> grade(People people);
}
