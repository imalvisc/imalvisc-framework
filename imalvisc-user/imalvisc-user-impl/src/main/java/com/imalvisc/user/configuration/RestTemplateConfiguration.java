package com.imalvisc.user.configuration;

import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.lang.NonNull;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * rest客户端配置类
 *
 * @author imalvisc
 * @version Id: RestTemplateConfiguration.java, v 0.1 2020-09-27 17:02 imalvisc Exp $$
 */
@Configuration
public class RestTemplateConfiguration {

    @Autowired
    private OkHttpClient okHttpClient;

    /**
     * 创建RestTemplate
     *
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate(new OkHttp3ClientHttpRequestFactory(okHttpClient));
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        for (HttpMessageConverter<?> converter : messageConverters) {
            if (converter instanceof StringHttpMessageConverter) {
                StringHttpMessageConverter stringConverter = (StringHttpMessageConverter) converter;
                stringConverter.setWriteAcceptCharset(false);
                stringConverter.setDefaultCharset(StandardCharsets.UTF_8);
                break;
            }
        }
        restTemplate.setErrorHandler(new ResponseErrorHandler() {
            @Override
            public boolean hasError(@NonNull ClientHttpResponse response) throws IOException {
                return false;
            }

            @Override
            public void handleError(@NonNull ClientHttpResponse response) throws IOException {

            }
        });
        return restTemplate;
    }

}
