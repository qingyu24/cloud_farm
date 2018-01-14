package com.fngame.farm.manager;

import com.fngame.farm.mapper.UserMapper;
import com.fngame.farm.model.User;
import com.fngame.farm.model.UserExample;
import com.fngame.farm.util.BeanTools;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by qingyu on 2018/1/12 /10:11
 */
@Component
public class PointLoader {

    @Cacheable(value = "pointloader")
    public List<playerpoint> getAllPoint() {

        return getAllPlayerPoint();
    }

    @CachePut(value = "pointloader")
    public List<playerpoint> updatePoint(User user) {

        List<playerpoint> allPoint = getAllPoint();
        for (playerpoint playerpoint : allPoint) {
            if (playerpoint.id == user.getUserid()) {
                playerpoint.xpoint = user.getXpoint();
                playerpoint.ypoint = user.getYpoint();
            }
        }

        return allPoint;
    }


    public List<playerpoint> getAllPlayerPoint() {
        UserMapper bean = (UserMapper) BeanTools.getBean(UserMapper.class);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseridIsNotNull();
        List<User> users = bean.selectByExample(userExample);
        pointList pointList = new pointList();
        users.forEach(pointList);
        return pointList.getList();
    }


    class playerpoint implements Serializable {
        private Long id;
        private Double xpoint;
        private Double ypoint;

        public playerpoint(User user) {
            id = user.getUserid();
            xpoint = user.getXpoint();
            ypoint = user.getYpoint();
        }
    }

    class pointList implements Consumer<User> {

        private List<playerpoint> list;

        public List<playerpoint> getList() {
            return list;
        }

        public void setList(List<playerpoint> list) {
            this.list = list;
        }

        @Override
        public void accept(User user) {
            if (list == null) {
                list = new LinkedList<playerpoint>();
            }
            list.add(new playerpoint(user));
        }
    }

}
