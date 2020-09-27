package com.imalvisc.order.api;

import com.alibaba.fastjson.JSONObject;
import com.imalvisc.order.model.bo.AlipayConfigBO;
import com.imalvisc.user.api.UserInfoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单api
 *
 * @author imalvisc
 * @version Id: OrderApi.java, v 0.1 2020-09-25 16:13 imalvisc Exp $$
 */
@Slf4j
@RefreshScope
@RestController
@RequestMapping(value = "/order")
public class OrderApi {

    @Value("${alipay.appId}")
    private String alipayAppid;
    @Autowired
    private AlipayConfigBO alipayConfig;
    @Autowired
    private UserInfoApi userInfoApi;

    @PostMapping(value = "/create")
    public JSONObject create() {
        JSONObject user = userInfoApi.create();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("configuration", alipayAppid);
        jsonObject.put("alipayConfig", alipayConfig);
        return jsonObject;
    }

}
