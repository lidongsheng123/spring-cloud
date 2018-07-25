package com.bmsoft.cloud.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ConfigurableApplicationContext;


@SpringCloudApplication
@EnableHystrixDashboard
public class MonitorApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MonitorApplication.class, args);
    }

}
