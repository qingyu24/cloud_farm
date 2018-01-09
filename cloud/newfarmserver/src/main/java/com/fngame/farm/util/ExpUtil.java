package com.fngame.farm.util;

import com.fngame.farm.manager.ConfigManager;
import com.fngame.farm.manager.PlayerManager;
import com.fngame.farm.model.User;

/**
 * Created by qingyu on 2018/1/4 /18:02
 */
public class ExpUtil {

    public static void updateLevel(User user, boolean first) {

        Integer level = user.getLevel();
        Integer exp = user.getExp();
        Integer needexp = ConfigManager.getInstance().getLevelConfig(level + 1);
        boolean changed=false;
        if (needexp > 0 && exp > needexp) {
            changed=true;
            user.setLevel(level + 1);
            user.setExp(exp - needexp);
            ExpUtil.updateLevel(user, false);
        }
        //如果第一次走这个方法并且值有所改变 更新数据库
        if (first&&changed) {
            PlayerManager manager = (PlayerManager) BeanTools.getBean(PlayerManager.class);
            manager.getPlayer(user.getUserid()).updateUser(user);
        }


    }

}
