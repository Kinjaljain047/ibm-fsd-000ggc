package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("customer-service")
public interface CustomerClient {

}
