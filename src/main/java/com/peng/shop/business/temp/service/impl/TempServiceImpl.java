package com.peng.shop.business.temp.service.impl;

import com.peng.shop.business.temp.service.TempService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TempServiceImpl implements TempService {

    Logger logger = LoggerFactory.getLogger(TempServiceImpl.class);

    @Override
    @Async("taskThreadPool")
    public void test() {
        logger.info("123465");
    }
}
