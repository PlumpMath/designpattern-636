package com.hyp;

/**
 * Created by hyp on 2016/9/5.
 */
public class MinusExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        String in = context.getIn();
        int v = Integer.parseInt(in);
        context.setOut(--v);
    }

}
