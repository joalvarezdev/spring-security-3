package com.joalvarez.springsecurity.data.dao;

import com.joalvarez.springsecurity.data.domain.Sample;
import com.joalvarez.springsecurity.data.repository.SampleRepository;
import com.joalvarez.baseframework.data.dao.BaseJPADAO;
import org.springframework.stereotype.Component;

@Component
public class SampleDAO extends BaseJPADAO<SampleRepository, Sample, Integer> {

	public SampleDAO(SampleRepository repository) {
		super(repository);
	}
}