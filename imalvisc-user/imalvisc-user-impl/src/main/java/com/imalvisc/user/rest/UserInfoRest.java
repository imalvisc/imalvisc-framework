package com.imalvisc.user.rest;

import com.alibaba.fastjson.JSONObject;
import com.imalvisc.user.api.UserInfoApi;
import com.imalvisc.user.model.dto.CreateUserDTO;
import com.imalvisc.user.model.vo.CreateUserVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息api接口
 *
 * @author imalvisc
 * @version Id: UserInfoRest.java, v 0.1 2020-09-27 16:07 imalvisc Exp $$
 */
@RestController
public class UserInfoRest implements UserInfoApi {

    @Override
    public CreateUserVO create(CreateUserDTO createUserDTO) {
        return CreateUserVO.builder()
                .userId("123456")
                .build();
    }

}
