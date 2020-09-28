package com.imalvisc.order.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建订单响应参数
 *
 * @author CreateOrderVO
 * @version Id: CreateOrderDTO.java, v 0.1 2020-09-28 16:47 imalvisc Exp $$
 */
@ApiModel(description = "创建订单响应参数")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderVO {

    @ApiModelProperty(value = "订单号", required = true)
    private String orderNo;

}
