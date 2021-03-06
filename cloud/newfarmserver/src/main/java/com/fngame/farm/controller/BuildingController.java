package com.fngame.farm.controller;

import com.fngame.farm.configer.Entity;
import com.fngame.farm.controller.base.BaseContorllerInterface;
import com.fngame.farm.controller.base.BaseController;
import com.fngame.farm.etypes.EBuildingType;
import com.fngame.farm.etypes.EItemType;
import com.fngame.farm.manager.ConfigManager;
import com.fngame.farm.manager.PlayerManager;
import com.fngame.farm.model.Building;
import com.fngame.farm.service.BuildingService;
import com.fngame.farm.userdate.PlayerInfo;
import com.fngame.farm.userdate.RequserOrder;
import com.fngame.farm.userdate.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/building")
public class BuildingController implements BaseContorllerInterface<Building> {


    @Autowired
    BuildingService BuildingService;

    @Autowired
    PlayerManager PlayerManager;

    @RequestMapping("add")
    public ResultInfo add(RequserOrder order, Building building) {

       ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);
        boolean b = false;
        try {
            b = BuildingService.add(resultInfo, building);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(resultInfo.toString());
        if (b) {
            resultInfo.setSucess(true);
 /*           resultInfo.getData().put("buildinfo", building);*/
            //如果是果树建筑的话，需要在Craft里面添加果实的数据

            Long userId = building.getUserid();//所属用户的id;
            PlayerInfo playerInfo = PlayerManager.getPlayer(userId);
            if (null == playerInfo){
                //返回玩家不存在的错误;
             resultInfo.setResp_code("300001");
                return resultInfo;
            }
       /*     Building build = playerInfo.getBuildingByID(building.getId());
            if (null == build) {
                //没有对应的目标建筑物;
                resultInfo.setResp_code("200004");
                return resultInfo;
            }*/
            Entity entity = ConfigManager.getInstance().getBuildingById(building.getBaseid());
            if (entity.Type == EBuildingType.TREE.ID()){
                playerInfo.insertCraft(EItemType.TREE.ID(), building.getId(), building.getBaseid() );
            }
        }

        return resultInfo;
    }



    @RequestMapping("modify")
    public ResultInfo modify(RequserOrder order, Building building) {
       ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);
        Boolean modify = BuildingService.modify(resultInfo, building);
        if (modify) resultInfo.setSucess(true);
        else {
            resultInfo.setResult("111", "建筑物移动失败");
        }

        return resultInfo;
    }

    @RequestMapping("remove")
    public ResultInfo remove(RequserOrder order, Building building) {
       ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);
        Boolean remove = BuildingService.remove(resultInfo, building);
        if (remove) resultInfo.setSucess(true);
        else {
            resultInfo.setResult("111", "删除建筑物失败");
        }

        return resultInfo;
    }

    /**
     * 获取建筑物的列表
     * @param order
     * @param building
     * @return
     */
    @Override
    public ResultInfo get(RequserOrder order, Building building) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setOrder(order);
        Long userId = building.getUserid();
        PlayerInfo playerInfo = PlayerManager.getPlayer(userId);
        if (null == playerInfo){
            //返回玩家不存在的错误;
            resultInfo.setResp_code("300001");
            return resultInfo;
        }
        resultInfo.setResp_code("000000");
        List<Building> buildings =  playerInfo.getBuildings();
        resultInfo.getData().put("list", buildings);
        return resultInfo;
    }

}
