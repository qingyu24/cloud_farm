package com.fngame.farm.model;

/**
 * @Author:Tian
 * @Description：
 * @Date:Created in 14:43 2018/1/11
 * @Modified By:
 */
public class MessageUser extends Message{
    private String username;
    private Integer sex;
    private Integer icon;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }
}
