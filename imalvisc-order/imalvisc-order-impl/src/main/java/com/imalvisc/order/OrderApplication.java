package com.imalvisc.order;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 程序启动类
 *
 * @author imalvisc
 * @version Id: com.imalvisc.order.OrderApplication.java, v 0.1 2020-09-25 14:57 imalvisc Exp $$
 */
@SpringBootApplication(scanBasePackages = "com.imalvisc")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.imalvisc")
@EnableSwagger2
@EnableKnife4j
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
