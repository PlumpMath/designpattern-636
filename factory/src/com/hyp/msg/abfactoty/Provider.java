package com.hyp.msg.abfactoty;


/**
 * Created by hyp on 2016/9/2.
 */

import com.hyp.msg.send.Sender;

/**
 * 抽象工厂
 */
public interface Provider {
    public Sender produce();
}