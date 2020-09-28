package com.imalvisc.order.feign.fallback;

import com.imalvisc.order.api.OrderInfoApi;
import com.imalvisc.order.model.dto.CreateOrderDTO;
import com.imalvisc.order.model.vo.CreateOrderVO;
import org.springframework.stereotype.Component;

/**
 * 订单信息接口服务降级类
 *
 * @author imalvisc
 * @version Id: OrderInfoFeignFallback.java, v 0.1 2020-09-28 16:42 imalvisc Exp $$
 */
@Component
public class OrderInfoFeignFallback implements OrderInfoApi {

    @Override
    public CreateOrderVO createOrder(CreateOrderDTO createOrderDTO) {
        return null;
    }

}
