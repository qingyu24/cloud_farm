package com.fngame.farm.manager;

import com.fngame.farm.userdate.PlayerInfo;
import com.fngame.farm.util.BeanTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by qingyu on 2017/12/20.
 */

@Component
public class PlayerManager extends BaseAutowired {

    public PlayerInfo getPlayer(Long userid) {

        PlayerInfo playerInfo = (PlayerInfo) BeanTools.getBean(PlayerInfo.class);

        playerInfo.setId(userid);

        return playerInfo;
    }

    @CachePut(value = "player", key = "#playerInfo.ID")
    public PlayerInfo UpdatePlayer(PlayerInfo playerInfo) {

        return playerInfo;
    }

    @CacheEvict(value = "player", key = "#playerInfo.ID")
    public void delePlayer(PlayerInfo playerInfo) {
    }
}
