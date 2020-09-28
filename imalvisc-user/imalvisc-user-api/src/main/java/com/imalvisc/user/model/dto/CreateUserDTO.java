package com.imalvisc.user.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 创建用户请求参数
 *
 * @author imalvisc
 * @version Id: CreateUserDTO.java, v 0.1 2020-09-28 10:50 imalvisc Exp $$
 */
@ApiModel(description = "创建用户请求参数")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserDTO {

    @ApiModelProperty(value = "手机号", required = true)
    @NotBlank(message = "请输入手机号")
    private String telephone;

}
