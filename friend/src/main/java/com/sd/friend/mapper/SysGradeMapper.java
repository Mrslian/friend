package com.sd.friend.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sd.friend.pojo.SysGrade;
import com.sd.friend.pojo.SysGradeExample;

public interface SysGradeMapper {
    int countByExample(SysGradeExample example);

    int deleteByExample(SysGradeExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(SysGrade record);

    int insertSelective(SysGrade record);

    List<SysGrade> selectByExample(SysGradeExample example);

    SysGrade selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") SysGrade record, @Param("example") SysGradeExample example);

    int updateByExample(@Param("record") SysGrade record, @Param("example") SysGradeExample example);

    int updateByPrimaryKeySelective(SysGrade record);

    int updateByPrimaryKey(SysGrade record);
}