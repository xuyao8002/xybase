package com.xuyao.service;

import java.util.Collection;

/**
 * Created by xuyao on 2017/4/12.
 */
public interface BaseService {
    void printInfo();

    String sayHello();
    
    String sayHello(int num);

    void put(String key, Object value, int timeToIdleSeconds, int timeToLiveSeconds);

    <T> T get(String key);

    boolean remove(String key);

    void removeAll(Collection<?> keys);

    void removeAll();
}
