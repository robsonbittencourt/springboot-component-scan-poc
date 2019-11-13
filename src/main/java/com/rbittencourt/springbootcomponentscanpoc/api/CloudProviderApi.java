package com.rbittencourt.springbootcomponentscanpoc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudProviderApi {

    @Autowired
    private CloudProviderService cloudProviderService;

    @GetMapping("/name")
    public String name() {
        return cloudProviderService.getServiceName();
    }

    @GetMapping("/company")
    public String company() {
        return cloudProviderService.company();
    }

}
