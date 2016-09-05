package com.hyp.msg.abfactoty;

import com.hyp.msg.send.MailSender;
import com.hyp.msg.send.Sender;

/**
 * Created by hyp on 2016/9/2.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}