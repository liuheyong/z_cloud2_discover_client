package com.cloud2.disclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZCloud2DiscoverClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZCloud2DiscoverClientApplication.class).web(true).run(args);
    }

}
