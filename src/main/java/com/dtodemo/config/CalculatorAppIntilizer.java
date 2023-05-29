package com.dtodemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class CalculatorAppIntilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // Registering the Spring config file
    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class aClass[] = { CalculatorAppConfig.class };
        return aClass;
    }

    // Add mapping url
    @Override
    protected String[] getServletMappings() {
        String arr[] = { "/demo_project/*" };
        return arr;
    }
}
