package com.imalvisc.order.feign.factory;

import com.imalvisc.order.feign.fallback.OrderInfoFeignFallback;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 订单信息接口服务降级类
 *
 * @author imalvisc
 * @version Id: OrderInfoFeignFallbackFactory.java, v 0.1 2020-09-28 16:44 imalvisc Exp $$
 */
@Slf4j
@Component
public class OrderInfoFeignFallbackFactory implements FallbackFactory<OrderInfoFeignFallback> {
    @Autowired
    private OrderInfoFeignFallback orderInfoFeignFallback;

    @Override
    public OrderInfoFeignFallback create(Throwable throwable) {
        log.error("调用订单信息接口异常，异常信息：", throwable);
        return orderInfoFeignFallback;
    }
}
