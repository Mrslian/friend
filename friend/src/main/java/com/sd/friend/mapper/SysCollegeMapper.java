package com.sd.friend.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sd.friend.pojo.SysCollege;
import com.sd.friend.pojo.SysCollegeExample;

public interface SysCollegeMapper {
    int countByExample(SysCollegeExample example);

    int deleteByExample(SysCollegeExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(SysCollege record);

    int insertSelective(SysCollege record);

    List<SysCollege> selectByExample(SysCollegeExample example);

    SysCollege selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") SysCollege record, @Param("example") SysCollegeExample example);

    int updateByExample(@Param("record") SysCollege record, @Param("example") SysCollegeExample example);

    int updateByPrimaryKeySelective(SysCollege record);

    int updateByPrimaryKey(SysCollege record);
}