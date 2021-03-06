package com.qf.market.entity;

/**
*用户类
 * @version 1.0
 * @auth sx
 * @date 2020/4/7
 */
public class Tuser {
    /**
    *用户编号
    */
    private int uid;
    /**
     *用户性别
     */
    private int usex;
    /**
     *用户年龄
     */
    private int uage;
    /**
     *用户账号
     */
    private String uaccount;
    /**
     *密码
     */
    private String upassword;
    /**
     *用户名
     */
    private String uname;
    /**
     *用户电话
     */
    private String utel;
    /**
     *用户类型
     */
    private String utype;

    @Override
    public String toString() {
        return "Tuser{" +
                "uid=" + uid +
                ", usex=" + usex +
                ", uage=" + uage +
                ", uaccount='" + uaccount + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uname='" + uname + '\'' +
                ", utel='" + utel + '\'' +
                ", utype='" + utype + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUsex() {
        return usex;
    }

    public void setUsex(int usex) {
        this.usex = usex;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
}
