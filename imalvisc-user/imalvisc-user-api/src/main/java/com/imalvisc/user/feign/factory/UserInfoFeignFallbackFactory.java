package com.imalvisc.user.feign.factory;

import com.imalvisc.user.feign.fallback.UserInfoFeignFallback;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户信息接口服务降级类工厂
 *
 * @author imalvisc
 * @version Id: UserInfoFeignFallbackFactory.java, v 0.1 2020-09-27 15:27 imalvisc Exp $$
 */
@Component
@Slf4j
public class UserInfoFeignFallbackFactory implements FallbackFactory<UserInfoFeignFallback> {

    @Autowired
    private UserInfoFeignFallback userInfoFeignFallback;

    public UserInfoFeignFallback create(Throwable throwable) {
        log.error("调用用户信息接口异常，异常信息：", throwable);
        return userInfoFeignFallback;
    }

}
