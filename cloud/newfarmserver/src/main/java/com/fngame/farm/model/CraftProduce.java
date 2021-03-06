package com.fngame.farm.model;

import com.fngame.farm.configer.Craft;
import com.fngame.farm.manager.ConfigManager;
import com.fngame.farm.util.BeanTools;

import java.io.Serializable;
import java.util.Date;

public class CraftProduce implements Serializable  {
    private Long id;

    private Long userid;

    private Integer type;

    private Long buildingid;

    private Integer productbaseid;

    private Date begintime;

    private Integer inproduce;

    private Integer size;

    private Long lefttime;

    public Long getLefttime() {
        try {

            ConfigManager bean = (ConfigManager) BeanTools.getBean(ConfigManager.class);
            Craft craftById = bean.getCraftById(this.getProductbaseid());
            if (craftById == null) return 0L;
            return Math.max(0, begintime.getTime() + craftById.CraftTime * 1000 - System.currentTimeMillis());
        } catch (Exception e) {

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Long buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getProductbaseid() {
        return productbaseid;
    }

    public void setProductbaseid(Integer productbaseid) {
        this.productbaseid = productbaseid;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Integer getInproduce() {
        return inproduce;
    }

    public void setInproduce(Integer inproduce) {
        this.inproduce = inproduce;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}