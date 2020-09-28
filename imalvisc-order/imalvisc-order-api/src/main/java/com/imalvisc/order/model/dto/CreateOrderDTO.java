package com.imalvisc.order.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 创建订单请求参数
 *
 * @author imalvisc
 * @version Id: CreateOrderDTO.java, v 0.1 2020-09-28 16:47 imalvisc Exp $$
 */
@ApiModel(description = "创建订单请求参数")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderDTO {

    @ApiModelProperty(value = "商品id", required = true)
    @NotBlank(message = "请输入商品id")
    private String goodsId;

}
