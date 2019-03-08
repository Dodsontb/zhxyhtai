package com.zhxy.config;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class WebMvcMyConfig extends WebMvcConfigurationSupport {
	

	@Override
	protected void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		//本工程
		registry.addResourceHandler("*").addResourceLocations("classpath:/static/");
		//工程以外的静态资源
		//registry.addResourceHandler("/ytang/**")
		//.addResourceLocations("file:d:/xx/");
	}
	

	@Bean
	public StringHttpMessageConverter stringMessageConverter() {
		StringHttpMessageConverter msg = new StringHttpMessageConverter(StandardCharsets.UTF_8);
		return msg;
	}
	
	
	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(stringMessageConverter());
		converters.add(fastJsonHttpMessageConverter());
		super.configureMessageConverters(converters);
	}
	
	@Bean
	public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter=new FastJsonHttpMessageConverter();
		fastJsonHttpMessageConverter.setFeatures(SerializerFeature.DisableCircularReferenceDetect);
		return fastJsonHttpMessageConverter;
	}
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
	}	
}
