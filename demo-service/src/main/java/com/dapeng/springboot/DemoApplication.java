package com.dapeng.springboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhongwm
 */
@SpringBootApplication
public class DemoApplication {

    /**
     * web应用启动
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
     **/

    public static void main(String[] args) {
        //非web应用启动
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(DemoApplication.class)
                // .REACTIVE, .SERVLET
                .web(WebApplicationType.NONE)
                //.bannerMode(Banner.Mode.OFF)
                .run(args);
    }

}
