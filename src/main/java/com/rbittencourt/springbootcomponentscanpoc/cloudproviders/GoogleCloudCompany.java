package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderCompany;
import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderServiceName;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.GoogleCloud;

@GoogleCloud
public class GoogleCloudCompany implements CloudProviderCompany {

    @Override
    public String company() {
        return "Google";
    }

}
