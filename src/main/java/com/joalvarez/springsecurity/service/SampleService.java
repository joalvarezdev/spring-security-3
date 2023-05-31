package com.joalvarez.springsecurity.service;

import com.joalvarez.springsecurity.data.dao.SampleDAO;
import com.joalvarez.springsecurity.data.mapper.SampleMapper;
import com.joalvarez.springsecurity.data.dto.SampleDTO;
import com.joalvarez.springsecurity.data.domain.Sample;
import com.joalvarez.baseframework.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SampleService extends BaseService<SampleDAO, SampleMapper, SampleDTO, Sample, Integer> {

	public SampleService(SampleDAO dao, SampleMapper mapper) {
		super(dao, mapper);
	}

}