package com.imalvisc.common.util;

/**
 * 响应时间工具类
 *
 * @author chenjiaming
 * @version Id: ResponseCostUtils.java, v 0.1 2020-04-27 18:30 chenjiaming Exp $$
 */
public class ResponseCostUtils {

    /**
     * 计算响应时间
     *
     * @param mills
     * @return
     */
    public static String cost(long mills) {
        if (mills > 10000) {
            return "cost more than 10000ms";
        } else if (mills > 5000) {
            return "cost more than 5000ms";
        } else if (mills > 3000) {
            return "cost more than 3000ms";
        } else if (mills > 2000) {
            return "cost more than 2000ms";
        } else if (mills > 1000) {
            return "cost more than 1000ms";
        } else if (mills > 500) {
            return "cost more than 500ms";
        } else if (mills > 300) {
            return "cost more than 300ms";
        } else if (mills > 200) {
            return "cost more than 200ms";
        } else if (mills > 100) {
            return "cost more than 100ms";
        } else {
            return "cost less than 100ms";
        }
    }

}
