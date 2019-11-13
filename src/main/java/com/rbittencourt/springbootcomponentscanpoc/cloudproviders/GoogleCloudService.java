package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderService;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.GoogleCloud;

@GoogleCloud
public class GoogleCloudService implements CloudProviderService {

    @Override
    public String getServiceName() {
        return "Google Cloud Platform";
    }

    @Override
    public String company() {
        return "Google";
    }

}
