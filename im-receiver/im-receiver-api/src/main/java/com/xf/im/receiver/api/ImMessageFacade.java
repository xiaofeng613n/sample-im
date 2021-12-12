package com.xf.im.receiver.api;

import com.xf.im.module.Response;
import com.xf.im.receiver.api.request.MessageSendRequest;
import com.xf.im.receiver.api.response.MessageSendResponse;

/**
 * @Auther: xiaofeng
 * @Date: 2021/12/12 20:00
 * @Description:
 */
public interface ImMessageFacade {

    Response<MessageSendResponse> send(MessageSendRequest request, Integer accountType, String accountId);
}
