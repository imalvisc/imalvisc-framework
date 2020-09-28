package com.imalvisc.user.api;

import com.imalvisc.common.feign.FeignConfiguration;
import com.imalvisc.user.feign.factory.UserInfoFeignFallbackFactory;
import com.imalvisc.user.model.dto.CreateUserDTO;
import com.imalvisc.user.model.vo.CreateUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用户信息api接口
 *
 * @author imalvisc
 * @version Id: UserInfoApi.java, v 0.1 2020-09-27 15:18 imalvisc Exp $$
 */
@Api(tags = "用户信息接口")
@FeignClient(value = "imalvisc-user", fallbackFactory = UserInfoFeignFallbackFactory.class, configuration = FeignConfiguration.class)
public interface UserInfoApi {

    /**
     * api路径前缀
     */
    String API_PREFIX = "/userInfo";

    /**
     * 创建用户
     *
     * @return
     */
    @ApiOperation(value = "创建用户")
    @PostMapping(value = API_PREFIX + "/create")
    CreateUserVO create(@RequestBody @Validated CreateUserDTO createUserDTO);

}
