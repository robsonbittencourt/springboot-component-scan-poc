package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderServiceName;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Azure;

@Azure
public class AzureServiceName implements CloudProviderServiceName {

    @Override
    public String getServiceName() {
        return "Azure";
    }

}
