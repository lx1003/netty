package com.liuxin.netty.client;

public interface NettyClientService {
    void ackSyncMsg(String msg);
    String sendSyncMsg(String text, String dataId, String serviceId);
    boolean sendMsg(String text, String dataId, String serviceId);
}
