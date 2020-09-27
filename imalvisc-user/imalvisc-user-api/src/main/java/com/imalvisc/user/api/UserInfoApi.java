package com.imalvisc.user.api;

import com.alibaba.fastjson.JSONObject;
import com.imalvisc.common.feign.FeignConfiguration;
import com.imalvisc.user.feign.factory.UserInfoFeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 用户信息api接口
 *
 * @author imalvisc
 * @version Id: UserInfoApi.java, v 0.1 2020-09-27 15:18 imalvisc Exp $$
 */
@FeignClient(value = "imalvisc-user", fallbackFactory = UserInfoFeignFallbackFactory.class, configuration = FeignConfiguration.class)
public interface UserInfoApi {

    /**
     * api路径前缀
     */
    String API_PREFIX = "/userInfo";

    /**
     * 创建用户
     *
     * @return
     */
    @PostMapping(value = API_PREFIX + "/create")
    JSONObject create();

}
