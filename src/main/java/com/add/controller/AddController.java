package com.add.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.add.model.AddResponse;

@RestController
public class AddController {

	public static final Logger LOGGER = LoggerFactory.getLogger(AddController.class);

	@RequestMapping(method = RequestMethod.GET, value = "/{num}", produces = "application/json")
	public ResponseEntity<AddResponse> addTen(@PathVariable long num) throws Exception {
		AddResponse response = new AddResponse();
		String add = String.valueOf(num + 10);
		response.setSum(add);
		LOGGER.info("Repsonce is [{}]", response);
		return new ResponseEntity<AddResponse>(response, HttpStatus.OK);

	}
	@RequestMapping(method = RequestMethod.GET, value = "/{num1}/{num2}", produces = "application/json")
	public ResponseEntity<AddResponse> ParametersAdder(@PathVariable long num1, @PathVariable long num2) throws Exception{
		AddResponse response = new AddResponse();
		String add = String.valueOf(num1 + num2);
		response.setSum(add);
		LOGGER.info("Repsonce is [{}]", response);
		return new ResponseEntity<AddResponse>(response, HttpStatus.OK);
	}
}
