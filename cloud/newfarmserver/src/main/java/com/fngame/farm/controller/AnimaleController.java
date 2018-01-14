package com.fngame.farm.controller;

import com.fngame.farm.controller.base.BaseContorllerInterface;
import com.fngame.farm.controller.base.BaseController;
import com.fngame.farm.model.Animal;
import com.fngame.farm.model.Building;
import com.fngame.farm.model.Props;
import com.fngame.farm.service.AnimaleService;
import com.fngame.farm.userdate.RequserOrder;
import com.fngame.farm.userdate.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animle")
public class AnimaleController extends BaseController implements BaseContorllerInterface<Animal> {

    @Autowired
    AnimaleService animaleService;

    @RequestMapping("add")
    public ResultInfo add(RequserOrder order, Animal animal) {
       ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);
        boolean b = false;
        try {
           b=animaleService.add(resultInfo, animal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(resultInfo.toString());
        if (b) {
            resultInfo.setSucess(true);
        }
        return resultInfo;

    }

    @RequestMapping("modify")
    public ResultInfo modify(RequserOrder order, Animal animal) {
       ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);

        return resultInfo;
    }

    @RequestMapping("remove")
    public ResultInfo remove(RequserOrder order, Animal animal) {
       ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);

        return resultInfo;
    }

    @Override
    public ResultInfo get(RequserOrder order, Animal animal) {
        return null;
    }
    // /

    @RequestMapping("feed")
    public ResultInfo feed(RequserOrder order, Animal animal, Props props) {
       ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);
        animaleService.feed(resultInfo,animal,props);

        return resultInfo;
    }


    /**
     *@Author:Tian
     *@Description:  添加动物
     *@Date: 17:16 2018/1/13
     */
    @GetMapping("addAnimal")
    public ResultInfo addAnimal(RequserOrder order,
                                @RequestParam("userid") Long userid,//用户id
                                @RequestParam("animalid") Integer animalid,//动物id
                                @RequestParam("number") Integer number,//添加数量
                                @RequestParam("buildingid") Integer buildingid//添加到哪个建筑物id
    ){
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setOrder(order);
        boolean result = animaleService.addAnimal(resultInfo,userid,animalid,number,buildingid);
        if (result) {
            resultInfo.setSucess(true);
        }
        return resultInfo;
    }
}
