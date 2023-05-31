package com.joalvarez.springsecurity.exception;

import com.joalvarez.baseframework.utils.HasLogger;
import com.joalvarez.baseframework.data.dto.ResponseDTO;

import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler implements HasLogger{


	@ExceptionHandler(PersistenceException.class)
	public ResponseEntity<ResponseDTO> handler(PersistenceException ex) {
		final ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setCode(InternalCode.ENTITY_NOT_FOUND.code());
		responseDTO.setMessage(InternalCode.ENTITY_NOT_FOUND.message());
		responseDTO.setDetails(List.of(ex.getMessage()));
		return new ResponseEntity<>(responseDTO, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ResponseDTO> handler(EntityNotFoundException ex) {
		final ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setCode(InternalCode.ENTITY_NOT_FOUND.code());
		responseDTO.setMessage(InternalCode.ENTITY_NOT_FOUND.message());
		responseDTO.setDetails(List.of(ex.getMessage()));
		return new ResponseEntity<>(responseDTO, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(GenericException.class)
	public ResponseEntity<ResponseDTO> handler(GenericException ex) {
		StringBuilder message = new StringBuilder("Error: ");
		message
			.append(ex.getHttpStatus().toString())
			.append(": ").append(ex.getInternalCode().message())
			.append(": ").append(ex.getMessage());
		final ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setCode(ex.getInternalCode().code());
		responseDTO.setMessage(ex.getInternalCode().message());
		responseDTO.setDetails(List.of(ex.getMessage()));

		return new ResponseEntity<>(responseDTO, ex.getHttpStatus());
	}
}