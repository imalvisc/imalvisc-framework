package com.imalvisc.common.feign;

import com.imalvisc.common.util.ResponseCostUtils;
import feign.Logger;
import feign.Request;
import feign.Response;
import feign.Util;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

/**
 * feign日志类
 *
 * @author imalvisc
 * @version Id: FeignLogger.java, v 0.1 2020-09-27 15:33 imalvisc Exp $$
 */
@Slf4j
public class FeignLogger extends Logger {

    /**
     * 线程域的日志元数据
     */
    private ThreadLocal<LogMeta> logMetas = new ThreadLocal<>();

    @Override
    protected void log(String s, String s1, Object... objects) {

    }

    @Override
    protected void logRequest(String configKey, Level logLevel, Request request) {
        String requestParams = "";
        byte[] body = request.body();
        if (!ObjectUtils.isEmpty(body)) {
            requestParams = new String(body, Util.UTF_8);
        }
        LogMeta logMeta = LogMeta.builder()
                .url(request.url())
                .startMills(System.currentTimeMillis())
                .requestParams(requestParams)
                .build();
        logMetas.set(logMeta);
    }

    @Override
    protected Response logAndRebufferResponse(String configKey, Level logLevel, Response response, long elapsedTime) throws IOException {
        LogMeta logMeta = logMetas.get();
        logMeta.setEndMills(System.currentTimeMillis());
        String reponseParams = "";
        if (response.body() != null) {
            byte[] bodyData = Util.toByteArray(response.body().asInputStream());
            int bodyLength = bodyData.length;
            if (bodyLength > 0) {
                reponseParams = Util.decodeOrDefault(bodyData, Util.UTF_8, "Binary data");
            }
            response = response.toBuilder().body(bodyData).build();
        }
        logMeta.setResponseParams(reponseParams);
        this.print(logMeta);
        return response;
    }

    /**
     * 日志打印
     *
     * @param logMeta
     */
    private void print(LogMeta logMeta) {
        long costMills = logMeta.getEndMills() - logMeta.getStartMills();
        log.info("执行feign请求，请求地址：[{}]，请求参数：[{}]，响应结果：[{}]，请求耗时：[{}]毫秒，{}",
                logMeta.getUrl(), logMeta.getRequestParams(), logMeta.getResponseParams(), costMills, ResponseCostUtils.cost(costMills));
    }

    /**
     * 日志元数据类
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class LogMeta {
        /**
         * 请求url
         */
        private String url;
        /**
         * 请求开始时间
         */
        private long startMills;
        /**
         * 请求结束时间
         */
        private long endMills;
        /**
         * 请求参数
         */
        private String requestParams;
        /**
         * 响应参数
         */
        private String responseParams;
    }
}
