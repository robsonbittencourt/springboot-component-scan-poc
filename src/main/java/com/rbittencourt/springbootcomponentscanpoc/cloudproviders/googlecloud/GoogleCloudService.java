package com.rbittencourt.springbootcomponentscanpoc.cloudproviders.googlecloud;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderService;

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
