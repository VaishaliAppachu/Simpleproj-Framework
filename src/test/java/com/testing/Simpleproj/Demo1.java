package com.testing.Simpleproj;

import org.testng.annotations.Test;

public class Demo1 
{
//conflict
//by person1
@Test
public void demo1()
{
    String b = System.getProperty("hi");
	System.out.println(b);
}
}
