package com.fngame.farm.controller;

import com.fngame.farm.manager.PlayerManager;
import com.fngame.farm.model.Props;
import com.fngame.farm.userdate.PlayerInfo;
import com.fngame.farm.userdate.RequserOrder;
import com.fngame.farm.userdate.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("warhouses")
public class WareHouseController {
    @Autowired
    PlayerManager playerManager;



    @RequestMapping("get")
    public ResultInfo getHouser(RequserOrder order, long userid) {

     ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);
        PlayerInfo player = playerManager.getPlayer(userid);

        List<Props> propss = player.getPropss();
        HashMap<String, Object> data = resultInfo.getData();
        data.put("props", propss);
        resultInfo.setSucess(true);
        return resultInfo;
    }


}
