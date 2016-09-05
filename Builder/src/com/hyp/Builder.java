package com.hyp;

import com.hyp.msg.send.MailSender;
import com.hyp.msg.send.Sender;
import com.hyp.msg.send.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyp on 2016/9/2.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}