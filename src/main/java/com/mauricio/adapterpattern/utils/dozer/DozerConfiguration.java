package com.mauricio.adapterpattern.utils.dozer;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DozerConfiguration {

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozerBeanMapper() {
        List<String> mappingFiles = Arrays.asList("dozer-configuration.xml");
        DozerBeanMapper dozerBean = new DozerBeanMapper();
        dozerBean.setMappingFiles(mappingFiles);

        return dozerBean;
    }
}
