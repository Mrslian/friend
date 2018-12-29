package com.sd.friend.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sd.friend.pojo.SysAttestation;
import com.sd.friend.pojo.SysAttestationExample;

public interface SysAttestationMapper {
    int countByExample(SysAttestationExample example);

    int deleteByExample(SysAttestationExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(SysAttestation record);

    int insertSelective(SysAttestation record);

    List<SysAttestation> selectByExample(SysAttestationExample example);

    SysAttestation selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") SysAttestation record, @Param("example") SysAttestationExample example);

    int updateByExample(@Param("record") SysAttestation record, @Param("example") SysAttestationExample example);

    int updateByPrimaryKeySelective(SysAttestation record);

    int updateByPrimaryKey(SysAttestation record);
}