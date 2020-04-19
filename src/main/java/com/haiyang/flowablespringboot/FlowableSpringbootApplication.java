package com.haiyang.flowablespringboot;

import com.haiyang.flowablespringboot.config.AppDispatcherServletConfiguration;
import com.haiyang.flowablespringboot.config.ApplicationConfiguration;
import com.haiyang.flowablespringboot.config.DatabaseAutoConfiguration;
import com.haiyang.flowablespringboot.config.FlowableStencilSetResource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


/**
 * FlowableSpringbootApplication
 *
 * @author puhaiyang
 * @date 2018/12/19
 */
@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class,
        DatabaseAutoConfiguration.class
})
// 移除 Security 自动配置
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FlowableSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableSpringbootApplication.class, args);
    }

}
