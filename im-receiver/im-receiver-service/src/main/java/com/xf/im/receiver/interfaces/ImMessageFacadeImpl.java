package com.xf.im.receiver.interfaces;

import com.xf.im.module.Response;
import com.xf.im.receiver.api.ImMessageFacade;
import com.xf.im.receiver.api.request.MessageSendRequest;
import com.xf.im.receiver.api.response.MessageSendResponse;
import com.xf.im.receiver.domain.MessageSendDomainService;
import com.xf.im.receiver.domain.MessageSendResp;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: xiaofeng
 * @Date: 2021/12/12 20:35
 * @Description:
 */
public class ImMessageFacadeImpl implements ImMessageFacade {

    @Autowired
    private MessageSendDomainService messageSendDomainService;

    @Override
    public Response<MessageSendResponse> send(MessageSendRequest request, Integer accountType, String accountId) {

        MessageSendResp messageSendResp = messageSendDomainService.send();

        return null;
    }
}
