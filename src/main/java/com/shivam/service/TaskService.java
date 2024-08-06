package com.shivam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TaskService {

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

    @Async("asyncTaskExecutor")
    public void assignVendorService() throws InterruptedException {
        log.info("assignVendorService() called");
        Thread.sleep(10000);
    }

    @Async("asyncTaskExecutor")
    public void packagingService() throws InterruptedException {
        log.info("packagingService() called");
        Thread.sleep(10000);
    }

    @Async("asyncTaskExecutor")
    public void deliveryService() throws InterruptedException {
        log.info("deliveryService() called");
        Thread.sleep(10000);
    }

}
