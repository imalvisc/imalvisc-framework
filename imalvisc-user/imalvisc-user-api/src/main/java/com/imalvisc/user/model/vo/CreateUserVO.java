package com.imalvisc.user.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建用户响应参数
 *
 * @author imalvisc
 * @version Id: CreateUserVO.java, v 0.1 2020-09-28 10:50 imalvisc Exp $$
 */
@ApiModel(description = "创建用户响应参数")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserVO {

    @ApiModelProperty(value = "用户id", required = true)
    private String userId;

}
