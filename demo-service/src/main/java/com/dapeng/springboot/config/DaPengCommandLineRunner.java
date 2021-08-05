package com.dapeng.springboot.config;

import com.dapeng.springboot.DemoApplication;
import com.github.dapeng.api.ContainerFactory;
import com.github.dapeng.impl.container.DapengContainer;
import com.github.dapeng.impl.context.DapengApplicationContext;
import com.github.dapeng.impl.plugins.SpringBootLoader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 大鹏服务启动器，SpringBoot启动之后再开始启动服务
 * @author zhongwm
 */
@Component
public class DaPengCommandLineRunner implements CommandLineRunner {

    @Resource
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("startup fist runner........");
        //设置springboot应用启动
        System.setProperty("soa.run.mode", "springboot");

        List<ClassLoader> appCls = new ArrayList<>(1);
        ClassLoader classLoader = DemoApplication.class.getClassLoader();
        appCls.add(classLoader);

        ContainerFactory.createContainer(appCls, classLoader);
        DapengContainer container = (DapengContainer) ContainerFactory.getContainer();
        DapengApplicationContext dapengApplicationContext = new DapengApplicationContext(applicationContext);
        SpringBootLoader springBootLoader = new SpringBootLoader(container, dapengApplicationContext);
        container.registerPlugin(2, springBootLoader);
        container.startup();

        /**
         * 反射机制
         Thread.currentThread().setContextClassLoader(classLoader);
         Class<?> containerFactoryClz = classLoader.loadClass("com.github.dapeng.api.ContainerFactory");
        Method createContainerMethod = containerFactoryClz.getMethod("createContainer", List.class, ClassLoader.class);
        createContainerMethod.invoke(containerFactoryClz, appCls, classLoader);

        Method getContainerMethod = containerFactoryClz.getMethod("getContainer");
        Object container = getContainerMethod.invoke(containerFactoryClz);

        Method mainMethod = container.getClass().getMethod("startup");
        mainMethod.invoke(container);
        **/
    }
}
