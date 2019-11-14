package com.rbittencourt.springbootcomponentscanpoc.cloudproviders;

import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderCompany;
import com.rbittencourt.springbootcomponentscanpoc.api.CloudProviderServiceName;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Aws;

@Aws
public class AwsCompany implements CloudProviderCompany {

    @Override
    public String company() {
        return "Amazon";
    }

}
