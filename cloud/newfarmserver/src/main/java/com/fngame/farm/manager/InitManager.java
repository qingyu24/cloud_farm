package com.fngame.farm.manager;

import com.fngame.farm.configer.Barrier;
import com.fngame.farm.mapper.BuildingInirMapper;
import com.fngame.farm.mapper.BuildingMapper;
import com.fngame.farm.model.Building;
import com.fngame.farm.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by qingyu on 2018/1/13 /17:09
 */
@Component
public class InitManager {
    static InitManager Instance;

    @Bean
    public static InitManager getInstance() {
        if (Instance == null) Instance = new InitManager();
        return Instance;
    }

    @Autowired
    BuildingMapper buildingMapper;

    @Autowired
    BuildingInirMapper buildingInirMapper;

    public void initBuilding() {


        List<Barrier> barriers = ConfigManager.getInstance().getBarrier();
        buildingInirMapper.clear();
        int i=0;
        for (Barrier barrier : barriers) {

            Building building = new Building();
            String[] split = barrier.Location.split("_");
            if (split.length == 2) {
                i++;
                building.setXpos(Integer.valueOf(split[0]));
                building.setYpos(Integer.valueOf(split[1]));
                building.setBaseid(barrier.ID);
                buildingInirMapper.insertSelective(building);

            }

        }
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("成功添加 "+i+"个初始建筑");
    }


    @Transactional
    public void initPlayer(User user) {
        buildingInirMapper.updateUserid(user.getUserid());
        buildingInirMapper.copyBuilding();
    }
}
