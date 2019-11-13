package com.rbittencourt.springbootcomponentscanpoc.cloudproviders.aws;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderService;

public class AwsService implements CloudProviderService {

    @Override
    public String getServiceName() {
        return "Amazon Web Services";
    }

    @Override
    public String company() {
        return "Amazon";
    }

}
