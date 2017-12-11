package com.xhhy.bean;

public class UserBean implements Runnable {

    private int usrrId;


    public int getUsrrId() {
        return usrrId;
    }

    public void setUsrrId(int usrrId) {
        this.usrrId = usrrId;
    }

    @Override
    public void run() {
    }
}
