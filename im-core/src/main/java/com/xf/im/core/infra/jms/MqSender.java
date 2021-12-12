package com.xf.im.core.infra.jms;

import java.io.Serializable;

/**
 * @Auther: xiaofeng
 * @Date: 2021/12/12 20:51
 * @Description:
 */
public interface MqSender {

    SendResult send(String topic, Serializable msgContent);

    SendResult sendOrderly(String topic, Serializable msgContent, String orderId);

}
