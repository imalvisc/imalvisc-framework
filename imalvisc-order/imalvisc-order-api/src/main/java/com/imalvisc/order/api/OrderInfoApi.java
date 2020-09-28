package com.imalvisc.order.api;

import com.imalvisc.common.feign.FeignConfiguration;
import com.imalvisc.order.feign.factory.OrderInfoFeignFallbackFactory;
import com.imalvisc.order.model.dto.CreateOrderDTO;
import com.imalvisc.order.model.vo.CreateOrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 订单信息api接口
 *
 * @author imalvisc
 * @version Id: OrderInfoApi.java, v 0.1 2020-09-28 16:40 imalvisc Exp $$
 */
@Api(tags = "订单信息接口")
@FeignClient(value = "imalvisc-order", fallbackFactory = OrderInfoFeignFallbackFactory.class, configuration = FeignConfiguration.class)
public interface OrderInfoApi {

    /**
     * api路径前缀
     */
    String API_PREFIX = "/orderInfo";

    @ApiOperation(value = "创建订单")
    @PostMapping(value = API_PREFIX + "/createOrder")
    CreateOrderVO createOrder(@RequestBody @Validated CreateOrderDTO createOrderDTO);

}
