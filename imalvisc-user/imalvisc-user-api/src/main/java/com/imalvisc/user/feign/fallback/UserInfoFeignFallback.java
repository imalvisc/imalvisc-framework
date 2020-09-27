package com.imalvisc.user.feign.fallback;

import com.alibaba.fastjson.JSONObject;
import com.imalvisc.user.api.UserInfoApi;
import org.springframework.stereotype.Component;

/**
 * 用户信息接口服务降级类
 *
 * @author imalvisc
 * @version Id: UserInfoFeignFallback.java, v 0.1 2020-09-27 15:23 imalvisc Exp $$
 */
@Component
public class UserInfoFeignFallback implements UserInfoApi {

    public JSONObject create() {
        return null;
    }

}
