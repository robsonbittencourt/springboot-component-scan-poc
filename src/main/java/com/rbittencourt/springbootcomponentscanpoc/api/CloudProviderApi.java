package com.rbittencourt.springbootcomponentscanpoc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudProviderApi {

    @Autowired
    private CloudProviderServiceName cloudProviderServiceName;

    @Autowired
    private CloudProviderCompany cloudProviderCompany;

    @GetMapping("/name")
    public String name() {
        return cloudProviderServiceName.getServiceName();
    }

    @GetMapping("/company")
    public String company() {
        return cloudProviderCompany.company();
    }

}
