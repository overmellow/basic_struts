package com.wv.mfaraji.mystruts.basic_struts.action;

import com.wv.mfaraji.mystruts.basic_struts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}