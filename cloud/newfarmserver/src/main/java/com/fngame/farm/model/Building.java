package com.fngame.farm.model;

import com.fngame.farm.configer.Entity;
import com.fngame.farm.manager.ConfigManager;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class Building implements Serializable {
    private Long id;

    private Long userid;

    private Integer baseid;

    private Integer dir;

    private Date beginTime;

    private Integer xpos;

    private Integer ypos;

    private Long ownerid;

    private Long lefttime;

    public Long getLefttime() {
        Entity buildingConfig = ConfigManager.getInstance().getBuildingConfig(this);
        try {


            if (buildingConfig != null) {
                return Math.max(0, beginTime.getTime() + buildingConfig.BuildTime * 1000 - System.currentTimeMillis());
            }
        } catch (Exception e) {
            LoggerFactory.getLogger(this.getClass()).error("时间换算有误");
        }
        return 0l;
    }

    public void setLefttime(Long lefttime) {
        this.lefttime = lefttime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getBaseid() {
        return baseid;
    }

    public void setBaseid(Integer baseid) {
        this.baseid = baseid;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public Date getBeginTime() {

        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getXpos() {
        return xpos;
    }

    public void setXpos(Integer xpos) {
        this.xpos = xpos;
    }

    public Integer getYpos() {
        return ypos;
    }

    public void setYpos(Integer ypos) {
        this.ypos = ypos;
    }

    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }
}