package com.peng.shop.business.temp.service.impl;

import com.peng.shop.business.temp.service.TempService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

@Service
public class TempServiceImpl implements TempService , ApplicationContextAware {

    Logger logger = LoggerFactory.getLogger(TempServiceImpl.class);

    ApplicationContext context;

    @Override
    @Async("taskThreadPool")
    public void test() {
        ThreadPoolExecutor taskThreadPool = context.getBean("taskThreadPool", ThreadPoolExecutor.class);
        logger.info("123465");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
