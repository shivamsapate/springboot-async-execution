package com.shivam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncService {
    public ResponseEntity<String> asyncExecution() throws InterruptedException {
      log.info("asyncExecution() called");
      purchaseOrderService();
      inventoryService();
      paymentService();
      notificationService();

      //make this api async
        //asynchroni
      packagingService();
      assignVendorService();
      deliveryService();
      log.info("asyncExecution() end with all method execution");
      return ResponseEntity.status(HttpStatus.OK).body("done with execution..");
    }

    public void purchaseOrderService() throws InterruptedException {
        log.info("purchaseOrderService() called");
        Thread.sleep(1000);
    }

    public void inventoryService() throws InterruptedException {
        log.info("inventoryService() called");
        Thread.sleep(1000);
    }

    public void paymentService() throws InterruptedException {
        log.info("paymentService() called");
        Thread.sleep(1000);
    }

    public void notificationService() throws InterruptedException {
        log.info("notificationService() called");
        Thread.sleep(1000);
    }

    public void assignVendorService() throws InterruptedException {
        log.info("assignVendorService() called");
        Thread.sleep(5000);
    }

    public void packagingService() throws InterruptedException {
        log.info("packagingService() called");
        Thread.sleep(2000);
    }
    public void deliveryService() throws InterruptedException {
        log.info("deliveryService() called");
        Thread.sleep(2000);
    }



}
