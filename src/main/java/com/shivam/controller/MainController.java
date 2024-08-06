package com.shivam.controller;

import com.shivam.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/async")
    public ResponseEntity<String> asyncExecution() throws InterruptedException {
        log.info("asyncExecution() called");
        return asyncService.asyncExecution();
    }
}
