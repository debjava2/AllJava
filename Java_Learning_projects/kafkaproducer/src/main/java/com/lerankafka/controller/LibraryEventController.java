package com.lerankafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lerankafka.domain.LibraryEvent;

@RestController
public class LibraryEventController {

	@PostMapping("/v1/libraryevent")
	public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libEvent){
		return ResponseEntity.status(HttpStatus.CREATED).body(libEvent);
	}
}
