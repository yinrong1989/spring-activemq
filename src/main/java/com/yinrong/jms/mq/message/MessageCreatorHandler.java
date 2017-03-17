package com.yinrong.jms.mq.message;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

/**
 * @author yinrong
 * @className TextMessageCreator
 * @description ${description}
 * @date 2017/3/16
 */
public class MessageCreatorHandler<T> {
    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        T t=c.newInstance();
        return t;
    }

}
