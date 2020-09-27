package com.imalvisc.common.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign配置类
 *
 * @author imalvisc
 * @version Id: FeignConfig.java, v 0.1 2020-09-27 15:39 imalvisc Exp $$
 */
@Configuration
public class FeignConfiguration {

    /**
     * 配置feign日志等级
     *
     * @return
     */
    @Bean
    public Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 配置feign日志类
     *
     * @return
     */
    @Bean
    public Logger feignLogger() {
        return new FeignLogger();
    }

}
