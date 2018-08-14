package com.testfan.mybatis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.testng.annotations.DataProvider;

import com.testfan.testng.TestBean;

public class DataProviderTest3 {
	
	
	@DataProvider(name = "db")
    public Iterator<Object[]> data1() {
    	List<Object[]> dataProvider = new ArrayList<Object[]>();
    	for(int i=0;i<10;i++){
    		TestBean bean = new TestBean();
    		bean.setName("testname");
    		bean.setMsg("--"+i);
    		dataProvider.add(new Object[] { bean});
    	}
        return dataProvider.iterator();
    }
	 
	 
    @DataProvider(name = "excel")
    public Object[][] data2() {
        return new Object[][]{
                   {Vector.class, new String[] {"java.util.AbstractList","java.util.AbstractCollection"}},
                   {String.class, new String[] {"1", "2"}},
                   {Integer.class, new String[] {"1", "2"}}
                  };
    }
	 

}
