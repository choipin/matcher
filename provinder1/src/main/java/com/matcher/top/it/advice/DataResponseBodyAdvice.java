package com.matcher.top.it.advice;

import com.alibaba.fastjson.JSON;
import com.matcher.top.it.model.ResponseTemple;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/9
 * @author: Wenxin
 * @version: 1.0
 */
@ControllerAdvice
public class DataResponseBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
       if (body instanceof ResponseTemple){
           return body;
       }
        ResponseTemple<Object> objectResponseTemple = new ResponseTemple<>();
        objectResponseTemple.setData(body);
       if (body instanceof String){
           return JSON.toJSONString(body);
       }
        return objectResponseTemple;
    }
}
