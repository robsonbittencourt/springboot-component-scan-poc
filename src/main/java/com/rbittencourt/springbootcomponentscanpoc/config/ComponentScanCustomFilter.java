package com.rbittencourt.springbootcomponentscanpoc.config;

import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Aws;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.Azure;
import com.rbittencourt.springbootcomponentscanpoc.cloudproviders.annotation.GoogleCloud;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.lang.annotation.Annotation;

public class ComponentScanCustomFilter implements TypeFilter {

    private static final String AWS = "AWS";
    private static final String AZURE = "AZURE";
    private static final String GOOGLE = "GOOGLE";
    private static final String CLOUD_PROVIDER_ENV_VAR = "CLOUD_PROVIDER";

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
        try {
            ClassMetadata classMetadata = metadataReader.getClassMetadata();
            String className = classMetadata.getClassName();
            Class<?> clazz = Class.forName(className);
            Class<? extends Annotation> cloudProvider = getCloudProviderFromEnv();

            return clazz.isAnnotationPresent(cloudProvider);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cloud Provider is invalid");
        }
    }

    private Class<? extends Annotation> getCloudProviderFromEnv() {
        String cloudProvider = System.getenv(CLOUD_PROVIDER_ENV_VAR);

        switch (cloudProvider) {
            case AWS:
                return Aws.class;

            case AZURE:
                return Azure.class;

            case GOOGLE:
                return GoogleCloud.class;

            default:
                throw new IllegalStateException("Cloud Provider is invalid");
        }
    }

}