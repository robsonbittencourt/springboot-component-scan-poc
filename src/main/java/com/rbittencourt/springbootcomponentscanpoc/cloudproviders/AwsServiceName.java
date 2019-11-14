package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderServiceName;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Aws;

@Aws
public class AwsServiceName implements CloudProviderServiceName {

    @Override
    public String getServiceName() {
        return "Amazon Web Services";
    }

}
