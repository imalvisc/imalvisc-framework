package com.imalvisc.order.model.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author imalvisc
 * @version Id: AlipayConfigBO.java, v 0.1 2020-09-25 16:24 imalvisc Exp $$
 */
@Component
@ConfigurationProperties(prefix = "alipay")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlipayConfigBO {

    private String appId;

    private String secret;

}
