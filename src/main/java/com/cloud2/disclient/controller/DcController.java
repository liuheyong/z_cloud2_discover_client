package com.cloud2.disclient.controller;

import com.cloud2.commons.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    public static final Logger logger = LoggerFactory.getLogger(DcController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping(Constants.CLOUD2 + "/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        logger.info(services);
        return services;
    }

}
