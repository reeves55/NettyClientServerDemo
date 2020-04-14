package com.xiaolee.netty.im.client.config;

public interface ClientPropertySource {
    /**
     * 服务器连接地址列表
     * @return
     */
    String[] serverUrls();

    /**
     * 连接超时时间(ms)
     * @return
     */
    long connectTimeout();

    /**
     * 心跳间隙时间(ms)
     * @return
     */
    long heartbeatInterval();

    /**
     * 使用线程数
     * @return
     */
    int threads();
}
