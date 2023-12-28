package com.hendisantika.loggingfilter.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-logging-filter
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/28/23
 * Time: 07:52
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Component
public class LoggingFilter extends OncePerRequestFilter {
    private String getStringValue(byte[] contentAsByteArray, String characterEncoding) {
        try {
            return new String(contentAsByteArray, characterEncoding);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
