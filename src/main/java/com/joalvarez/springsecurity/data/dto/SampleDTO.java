package com.joalvarez.springsecurity.data.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.joalvarez.baseframework.data.dto.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SampleDTO implements BaseDTO {

}