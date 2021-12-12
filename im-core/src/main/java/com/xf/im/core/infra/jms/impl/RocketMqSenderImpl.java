package com.xf.im.core.infra.jms.impl;

import com.xf.im.core.infra.jms.MqSender;
import com.xf.im.core.infra.jms.SendResult;

import java.io.Serializable;

/**
 * @Auther: xiaofeng
 * @Date: 2021/12/12 20:52
 * @Description:
 */
public class RocketMqSenderImpl implements MqSender {
    @Override
    public SendResult send(String topic, Serializable msgContent) {
        return null;
    }

    @Override
    public SendResult sendOrderly(String topic, Serializable msgContent, String orderId) {
        return null;
    }
}
