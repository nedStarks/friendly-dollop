package com.example.demo.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * @author zwh
 * @create 2023/02/12
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  public void addResourceHandlers(ResourceHandlerRegistry registry){
    //所有项目基础路径 + /swagger-ui/** 的url访问
    //都将从classpath:/META-INF/resources/webjars/springfox-swagger-ui/目录下获取静态资源
    registry.addResourceHandler("/swagger-ui/**")
            .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/")
            .resourceChain(false);
  }
}
