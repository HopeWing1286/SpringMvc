package com.testfan.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UseLog4j {

	
	private static final Logger LOG = LoggerFactory.getLogger(UseLog4j.class); 
	    //程序入口——主函数
	    public static void main(String[]args) {
	        //读取使用Java的特性文件编写的配置文件
	        //DOMConfigurator.configure( "D:\\workspace_test\\hello-log4j\\log4j.xml" );
	        //输出日志信息，测试日志级别的作用（配置在配置文件中），仅仅输出大于等于目前有效级别的日志信息
	    	
	    	LOG.debug("[1]-my level is DEBUG 天");
    		LOG.info("[2]-my level is INFO");
    		LOG.warn("[3]-my level is WARN");
    		LOG.error("[4]-my level is ERROR");
    		
//	    	for (int i = 0; i < 100000; i++) {
//	    		try {
//					Thread.sleep(30*1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//	    		LOG.debug("[1]-my level is DEBUG 天");
//	    		LOG.info("[2]-my level is INFO");
//	    		LOG.warn("[3]-my level is WARN");
//	    		LOG.error("[4]-my level is ERROR");
//			}
	      
	    }
}
