package com.qfedu.entity;

import java.util.Date;

public class User {
   private Integer userid;
   private String name;
   private String passowrd;
   private String email;
   private String family;
   private String intro;
   private Date time;

    public User() {
    }

    public User(Integer userid, String name, String passowrd, String email, String family, String intro, Date time) {
        this.userid = userid;
        this.name = name;
        this.passowrd = passowrd;
        this.email = email;
        this.family = family;
        this.intro = intro;
        this.time = time;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", passowrd='" + passowrd + '\'' +
                ", email='" + email + '\'' +
                ", family='" + family + '\'' +
                ", intro='" + intro + '\'' +
                ", time=" + time +
                '}';
    }
}
