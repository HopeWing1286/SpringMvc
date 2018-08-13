package com.testfan.testng;

import java.util.Vector;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 {
	
	
	@Test(dataProvider = "testdb")
    public void parameterIntTest(Class clzz, String[] number) {
       System.out.println("Parameterized Number is : " + number[0]);
       System.out.println("Parameterized Number is : " + number[1]);
    }

    //This function will provide the patameter data
    @DataProvider(name = "testdb")
    public Object[][] parameterIntTestProvider() {
        return new Object[][]{
                   {Vector.class, new String[] {"java.util.AbstractList","java.util.AbstractCollection"}},
                   {String.class, new String[] {"1", "2"}},
                   {Integer.class, new String[] {"1", "2"}}
                  };
    }

}
