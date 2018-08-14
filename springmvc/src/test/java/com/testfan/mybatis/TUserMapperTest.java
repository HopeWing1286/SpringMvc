package com.testfan.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testfan.dao.TUserMapper;
import com.testfan.pojo.TUser;
import com.testfan.testng.TestBean;


public class TUserMapperTest extends BaseTest {
	
	@Autowired
	TUserMapper tUserMapper;
	
  @Test(dataProvider="db", dataProviderClass=DataProviderTest3.class)
  public void add(TestBean bean) {
		TUser user = tUserMapper.selectByPrimaryKey(123);
		System.out.println(user);
		Assert.assertNotNull(user);
		System.out.println("deleteByPrimaryKey--------");
  }

//  @Test(dataProvider="excel", dataProviderClass=DataProviderTest3.class, dependsOnMethods= {"deleteByPrimaryKey"})
//  public void insert(Class clzz, String[] number) {
//	  System.out.println("insert----");
//	  
//   // throw new RuntimeException("Test not implement)ed";
//  }
//
//  @Test
//  public void insertSelective() {
//    throw new RuntimeException("Test not implemented");
//  }
//
//  @Test
//  public void selectByPrimaryKey() {
//    throw new RuntimeException("Test not implemented");
//  }
//
//  @Test
//  public void updateByPrimaryKey() {
//    throw new RuntimeException("Test not implemented");
//  }
//
//  @Test
//  public void updateByPrimaryKeySelective() {
//    throw new RuntimeException("Test not implemented");
//  }
}
