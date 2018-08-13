package com.testfan.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.testfan.dao.TUser2Mapper;

public class TUser2MapperTest extends BaseTest{
	
	@Autowired
	TUser2Mapper tUser2Mapper;

  @Test
  public void countByExample() {
	  tUser2Mapper.selectByPrimaryKey(123);
  }
}
