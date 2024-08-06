package com.shivam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncService {

    @Autowired
    TaskService taskService;

    public ResponseEntity<String> asyncExecution() throws InterruptedException {


        log.info("asyncExecution() called");
        taskService.purchaseOrderService();
        taskService.inventoryService();
        taskService.paymentService();
        taskService.notificationService();

        //asynchroni
        taskService.packagingService();
        taskService.assignVendorService();
        taskService.deliveryService();
        log.info("asyncExecution() end with all method execution");
        return ResponseEntity.status(HttpStatus.OK).body("done with execution..");
    }


}
