package com.dailycodebuffer.cloud.gateway;

import static org.springframework.boot.SpringApplication.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayApplication
{
	public static void main(String[] args) { run(CloudGatewayApplication.class, args); }
}
