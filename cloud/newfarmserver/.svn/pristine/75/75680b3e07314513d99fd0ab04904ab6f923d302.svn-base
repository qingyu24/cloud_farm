package com.fngame.farm.mapper;

import com.fngame.farm.model.Building;
import com.fngame.farm.model.User;
import org.springframework.stereotype.Component;

@Component
public interface BuildingInirMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    void updateUserid(Long userid);

    void copyBuilding();

    void clear();
}