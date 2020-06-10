package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("bean1")
public class TestBean {

    private Logger logger = LoggerFactory.getLogger(TestBean.class);
    private String message;

    @PostConstruct
    private void init() {
        logger.info("Init method after properties are set : " + this.message);
    }

    @PreDestroy
    private void cleanup() {
        logger.info("Spring container is destory!");
    }

}
