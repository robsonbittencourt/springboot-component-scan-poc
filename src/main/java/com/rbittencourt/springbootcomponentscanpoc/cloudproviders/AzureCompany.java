package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderCompany;
import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderServiceName;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Azure;

@Azure
public class AzureCompany implements CloudProviderCompany {

    @Override
    public String company() {
        return "Microsoft";
    }

}
