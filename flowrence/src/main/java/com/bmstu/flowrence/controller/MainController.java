package com.bmstu.flowrence.controller;

import com.bmstu.flowrence.dto.SimpleDto;
import com.bmstu.flowrence.dto.SimpleRequest;
import com.bmstu.flowrence.dto.SimpleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<SimpleDto> handleRequest(SimpleRequest request) {
        SimpleDto response = new SimpleResponse("Hello, ", request.getName());
        response.printMessage();
        return ResponseEntity.ok(response);
    }

}
