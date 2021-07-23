package com.assignment6.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {

    //from property file
    @Value("${driverClassName}")
    private String className;
    @Value("${dbUrl}")
    private String url;
    @Value("${Username}")
    private String Username;
    @Value("${password}")
    private String password;
    @Override
    public String toString() {
        return "PropertyService [className=" + className + ", url=" + url + ", username=" + Username + ", password="
                + password + "]";
    }
    public String getClassName() {
        return className;
    }
    public String getUrl() {
        return url;
    }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return password;
    }





}