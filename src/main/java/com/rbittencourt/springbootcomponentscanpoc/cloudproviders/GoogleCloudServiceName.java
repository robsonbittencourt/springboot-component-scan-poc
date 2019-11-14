package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderServiceName;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.GoogleCloud;

@GoogleCloud
public class GoogleCloudServiceName implements CloudProviderServiceName {

    @Override
    public String getServiceName() {
        return "Google Cloud Platform";
    }

}
