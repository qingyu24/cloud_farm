package com.fngame.farm.mapper;

import com.fngame.farm.model.FriendInfo;
import com.fngame.farm.model.FriendInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendInfoMapper {

    FriendInfo selectOwnerInfo(long id);

    List<FriendInfo> selectByUserid(long id);

}