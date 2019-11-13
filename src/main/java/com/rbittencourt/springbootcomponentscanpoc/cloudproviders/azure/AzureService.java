package com.rbittencourt.springbootcomponentscanpoc.cloudproviders.azure;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderService;

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
