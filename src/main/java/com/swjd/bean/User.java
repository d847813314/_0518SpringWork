package com.swjd.bean;

public class User {
    private int uid;
    private String uName;
    private String realName;
    private String passWord;
    private String flag;

    public User() {
    }

    public User(int uid, String uName, String realName, String passWord, String flag) {
        this.uid = uid;
        this.uName = uName;
        this.realName = realName;
        this.passWord = passWord;
        this.flag = flag;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uName='" + uName + '\'' +
                ", realName='" + realName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
