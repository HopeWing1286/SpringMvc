package com.testfan.mybatis;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/spring-mybatis.xml" })
public class BaseTest extends AbstractTestNGSpringContextTests{

}
