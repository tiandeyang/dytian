package com.dubbo.dytian.api.entity;

import java.io.Serializable;

public class WxUser implements Serializable {

    private static final long serialVersionUID = 1L;


    private String openid ;

    private String xv_id;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getXv_id() {
        return xv_id;
    }

    public void setXv_id(String xv_id) {
        System.out.println("the xv_id ="+xv_id);
        this.xv_id = xv_id;
    }
}
