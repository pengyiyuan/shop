package com.peng.shop.base.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

@Configuration
@EnableAsync
public class ThreadPoolConfigure {

    @Bean(name = "taskThreadPool")
    public ThreadPoolExecutorFactoryBean taskThreadPool(){
        ThreadPoolExecutorFactoryBean threadPoolExecutorFactoryBean = new ThreadPoolExecutorFactoryBean();
        return threadPoolExecutorFactoryBean;
    }

}
