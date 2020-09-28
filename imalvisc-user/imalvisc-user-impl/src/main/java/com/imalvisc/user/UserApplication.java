package com.imalvisc.user;

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
 * @version Id: UserApplication.java, v 0.1 2020-09-27 16:12 imalvisc Exp $$
 */
@SpringBootApplication(scanBasePackages = "com.imalvisc")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.imalvisc")
@EnableSwagger2
@EnableKnife4j
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }

}
