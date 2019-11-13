package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderService;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Azure;

@Azure
public class AzureService implements CloudProviderService {

    @Override
    public String getServiceName() {
        return "Microsoft Azure";
    }

    @Override
    public String company() {
        return "Microsoft";
    }

}
