package com.xf.im.receiver.domain.impl;

import com.xf.im.module.MessageDTO;
import com.xf.im.receiver.domain.MessageSendDomainService;
import com.xf.im.receiver.domain.MessageSendResp;
import org.springframework.beans.factory.annotation.Autowired;
import com.xf.im.core.infra.jms.MqSender;
/**
 * @Auther: xiaofeng
 * @Date: 2021/12/12 21:05
 * @Description:
 */
public class MessageSendDomainServiceImpl implements MessageSendDomainService {

    @Autowired
    private MqSender mqSender;

    @Override
    public MessageSendResp send() {


        MessageDTO messageDTO = null;

        mqSender.send("", messageDTO);

        return null;
    }
}
