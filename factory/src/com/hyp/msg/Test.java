package com.hyp.msg;

import com.hyp.msg.abfactoty.Provider;
import com.hyp.msg.abfactoty.SendMailFactory;
import com.hyp.msg.send.Sender;

/**
 * Created by hyp on 2016/9/2.
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}