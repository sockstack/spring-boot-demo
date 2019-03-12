package com.example.demo.handler;

import com.example.demo.enums.StatusCode;
import com.example.demo.exceptions.ApiException;
import com.example.demo.exceptions.Exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entity.apiInfo;

@ControllerAdvice
public class ErrorHandler {
    private final static String DEFAULT_TEMPLATE_NAME = "404";

    /**
     * web统一错误处理
     * @param e Exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView webException(Exception e) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("message", e.getMessage());
        modelAndView.setViewName(DEFAULT_TEMPLATE_NAME);

        return modelAndView;
    }

    /**
     * api统一异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = ApiException.class)
    @ResponseBody
    public apiInfo<String> apiException(ApiException e) {
        apiInfo<String> info = new apiInfo<>();

        info.setCode(StatusCode.FAIL.getCode());
        info.setData(StatusCode.FAIL.getValue());
        info.setMsg(e.getMessage());

        return info;
    }
}
