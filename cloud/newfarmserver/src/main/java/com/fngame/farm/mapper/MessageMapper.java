package com.fngame.farm.mapper;

import com.fngame.farm.model.Message;
import com.fngame.farm.model.MessageExample;
import java.util.List;

import com.fngame.farm.model.MessageUser;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Long msgid);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExampleWithBLOBs(MessageExample example);
    List<MessageUser> selectWithBLOBs (Long userid);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Long msgid);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExampleWithBLOBs(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKeyWithBLOBs(Message record);

    int updateByPrimaryKey(Message record);
}