package com.moviecatalogservice.resources;

import com.moviecatalogservice.configuration.DbSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Properties")
@RefreshScope
public class PropertiesTesting {
//
//    @Autowired
//    DbSettings dbSettings;
//
//    @Value("${my.greeting}")
//    private String greetingValue;
//
//    @GetMapping("/db-settings")
//    public String getDbSettings() {
//        return dbSettings.toString();
//    }
//
//    @GetMapping("/greeting")
//    public String getGreeting() {
//        return greetingValue;
//    }
}
