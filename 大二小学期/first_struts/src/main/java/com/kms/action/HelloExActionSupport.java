package com.kms.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zfl on 2017/7/6.
 */
public class HelloExActionSupport extends ActionSupport{
    @Override
    public String execute() throws Exception {
        /**
         * LOG程度
        * debug
        * info
        * warn
        * error
        * fatal
        *
        * */
        LOG.info("-------------ActionDebug-----------------");
        return SUCCESS;
    }
}

