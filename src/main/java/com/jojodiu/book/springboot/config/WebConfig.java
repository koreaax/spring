package com.jojodiu.book.springboot.config;

import com.jojodiu.book.springboot.config.auth.LoginUserArgumnetResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final LoginUserArgumnetResolver loginUserArgumnetResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolverList){
        argumentResolverList.add(loginUserArgumnetResolver);
    }

}
