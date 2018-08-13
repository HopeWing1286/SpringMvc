package com.testfan.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.testfan.dao.TUser2Mapper;
import com.testfan.dao.TUserMapper;
import com.testfan.pojo.TUser;
import com.testfan.pojo.TUser2;
import com.testfan.pojo.TUser2Example;
import com.testfan.pojo.TUser2Example.Criteria;

public class MybatisTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring/spring-mybatis.xml");
//		TUserMapper userDao=context.getBean(TUserMapper.class);
//		TUser user = userDao.selectByPrimaryKey(123);
//		System.out.println(user);
		
//		TUser2Example example= new TUser2Example();
//		Criteria ci= example.createCriteria();
//		ci.andAgeBetween(10, 20);
//		TUser2Mapper user2Dao=context.getBean(TUser2Mapper.class);
//		long count = user2Dao.countByExample(example);
//		System.out.println(count);
//		List<TUser2> list = user2Dao.selectByExample(example);
		
		TUser2Example example=new TUser2Example();  
		Criteria cri1 = example.createCriteria();  
		cri1.andAgeBetween(10, 20);
		cri1.andUserNameEqualTo("zhangsan");
		
		TUser2Mapper user2Dao=context.getBean(TUser2Mapper.class);
		Criteria cri2 = example.createCriteria();  
		cri2.andAgeBetween(10, 20);
		cri2.andUserNameEqualTo("zhangsan0");
		example.or(cri2); 
		
		List<TUser2> list = user2Dao.selectByExample(example);
		for (TUser2 tUser2 : list) {
			System.out.println(tUser2.toString());
		}
	}

}
