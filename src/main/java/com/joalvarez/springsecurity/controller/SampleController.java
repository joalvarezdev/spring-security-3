package com.joalvarez.springsecurity.controller;

import com.joalvarez.springsecurity.service.SampleService;
import com.joalvarez.springsecurity.data.dao.SampleDAO;
import com.joalvarez.springsecurity.data.mapper.SampleMapper;
import com.joalvarez.springsecurity.data.dto.SampleDTO;
import com.joalvarez.springsecurity.data.domain.Sample;
import com.joalvarez.baseframework.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("sample")
public class SampleController extends BaseController<SampleService, SampleDAO, SampleMapper, SampleDTO, Sample, Integer> {

	public SampleController (SampleService service) {
		super(service);
	}

	@GetMapping("unsecured")
	public String unsecured() {
		return "Hello World unsecured";
	}
}