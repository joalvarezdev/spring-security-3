package com.joalvarez.springsecurity.data.repository;

import com.joalvarez.springsecurity.data.domain.Sample;
import com.joalvarez.baseframework.data.repository.GenericRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SampleRepository extends GenericRepository<Sample, Integer> {

}