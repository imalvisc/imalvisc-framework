package com.imalvisc.order.rest;

import com.imalvisc.order.api.OrderInfoApi;
import com.imalvisc.order.model.dto.CreateOrderDTO;
import com.imalvisc.order.model.vo.CreateOrderVO;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单信息api接口
 *
 * @author imalvisc
 * @version Id: OrderInfoRest.java, v 0.1 2020-09-28 16:55 imalvisc Exp $$
 */
@RestController
public class OrderInfoRest implements OrderInfoApi {

    @Override
    public CreateOrderVO createOrder(CreateOrderDTO createOrderDTO) {
        return CreateOrderVO.builder()
                .orderNo("IM123456")
                .build();
    }

}
