package com.sd.friend.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sd.friend.pojo.SysRegister;
import com.sd.friend.pojo.SysRegisterExample;

public interface SysRegisterMapper {
    int countByExample(SysRegisterExample example);

    int deleteByExample(SysRegisterExample example);

    int insert(SysRegister record);

    int insertSelective(SysRegister record);

    List<SysRegister> selectByExample(SysRegisterExample example);

    int updateByExampleSelective(@Param("record") SysRegister record, @Param("example") SysRegisterExample example);

    int updateByExample(@Param("record") SysRegister record, @Param("example") SysRegisterExample example);
}