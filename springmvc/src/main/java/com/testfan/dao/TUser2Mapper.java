package com.testfan.dao;

import com.testfan.pojo.TUser2;
import com.testfan.pojo.TUser2Example;
import java.util.List;
//import org.apache.ibatis.annotations.Param;

public interface TUser2Mapper {
    long countByExample(TUser2Example example);

    int deleteByExample(TUser2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser2 record);

    int insertSelective(TUser2 record);

    List<TUser2> selectByExample(TUser2Example example);

    TUser2 selectByPrimaryKey(Integer id);

//    int updateByExampleSelective(@Param("record") TUser2 record, @Param("example") TUser2Example example);
//
//    int updateByExample(@Param("record") TUser2 record, @Param("example") TUser2Example example);

    int updateByPrimaryKeySelective(TUser2 record);

    int updateByPrimaryKey(TUser2 record);
}