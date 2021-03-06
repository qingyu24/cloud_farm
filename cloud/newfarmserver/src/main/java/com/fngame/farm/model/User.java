package com.fngame.farm.model;

import java.io.Serializable;
import java.util.Date;
import java.util.function.Consumer;

public class User  implements Serializable {
    private Long userid;

    private String openid;

    private String tel;

    private String username;

    private String password;

    private String nickname;

    private Integer level;

    private Integer exp;

    private Integer score;

    private Integer money;

    private Integer icon;

    private Integer beans;

    private Integer ingot;

    private Integer sex;

    private String headurl;

    private String dest;

    private Date regtime;

    private Date logintime;

    private Integer granaryLevel;

    private Integer propsLevel;

    private Integer marketCapacity;

    private String ip;

    private String ipadress;

    private Double xpoint;

    private Double ypoint;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public Integer getBeans() {
        return beans;
    }

    public void setBeans(Integer beans) {
        this.beans = beans;
    }

    public Integer getIngot() {
        return ingot;
    }

    public void setIngot(Integer ingot) {
        this.ingot = ingot;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Integer getGranaryLevel() {
        return granaryLevel;
    }

    public void setGranaryLevel(Integer granaryLevel) {
        this.granaryLevel = granaryLevel;
    }

    public Integer getPropsLevel() {
        return propsLevel;
    }

    public void setPropsLevel(Integer propsLevel) {
        this.propsLevel = propsLevel;
    }

    public Integer getMarketCapacity() {
        return marketCapacity;
    }

    public void setMarketCapacity(Integer marketCapacity) {
        this.marketCapacity = marketCapacity;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getIpadress() {
        return ipadress;
    }

    public void setIpadress(String ipadress) {
        this.ipadress = ipadress == null ? null : ipadress.trim();
    }

    public Double getXpoint() {
        return xpoint;
    }

    public void setXpoint(Double xpoint) {
        this.xpoint = xpoint;
    }

    public Double getYpoint() {
        return ypoint;
    }

    public void setYpoint(Double ypoint) {
        this.ypoint = ypoint;
    }
}