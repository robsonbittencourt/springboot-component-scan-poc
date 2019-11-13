package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderService;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Aws;

@Aws
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
