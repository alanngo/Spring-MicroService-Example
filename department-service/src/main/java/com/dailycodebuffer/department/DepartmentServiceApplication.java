package com.dailycodebuffer.department;

import static org.springframework.boot.SpringApplication.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceApplication
{
	public static void main(String[] args) { run(DepartmentServiceApplication.class, args); }
}
