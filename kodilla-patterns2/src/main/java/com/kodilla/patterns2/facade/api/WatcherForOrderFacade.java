package com.kodilla.patterns2.facade.api;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class WatcherForOrderFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherForOrderFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order,userId) && target(object)")

    public void orderLogs(OrderDto order, Long userId, Object object) {
        LOGGER.info("\n **** Logging  order test v1: " + object.getClass().getName()
                + " \n *** The Order: " + order.getItems().stream()
        .map(Object::toString)
        .collect(Collectors.joining()) + userId);
        LOGGER.info("\n ** Order created - witch Watcher. order created.");
    }

}
