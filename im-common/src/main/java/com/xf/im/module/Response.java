package com.xf.im.module;

import java.io.Serializable;

/**
 * @Auther: xiaofeng
 * @Date: 2021/12/12 20:01
 * @Description:
 */
public class Response<Module> implements Serializable {
    private static final long serialVersionUID = -4791537331325305745L;

    private Module module;

    private boolean success;
}
