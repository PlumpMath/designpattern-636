package com.hyp.msg.abfactoty;

import com.hyp.msg.send.Sender;
import com.hyp.msg.send.SmsSender;

/**
 * Created by hyp on 2016/9/2.
 */
public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}