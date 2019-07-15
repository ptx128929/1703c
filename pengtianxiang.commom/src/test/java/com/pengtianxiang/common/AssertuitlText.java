package com.pengtianxiang.common;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.junit.Test;

import com.pengtianxiang.common.utils.Assertutil;
import com.pengtianxiang.common.utils.CRuntimeException;

public class AssertuitlText {
	
	@Test
	public void fun1test(){
		try {
			//Assertutil.isTrue(true, "这是提示错误信息");
			Assertutil.isTrue(false, "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun2test(){
		try {
			Assertutil.isFalse(true, "这是提示错误信息");
			//Assertutil.isFalse(false, "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3test(){
		try {
			//Assertutil.notNull(null, "这是提示错误信息");
			Assertutil.notNull("emp", "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
	@Test
	public void fun4test(){
		try {
			Assertutil.isNull(null, "这是提示错误信息");
			//Assertutil.isNull("emp", "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
	@Test
	public void fun5test(){
		try {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			arr.add(5);arr.add(5);arr.add(5);arr.add(5);
			Assertutil.notEmpty(arr, "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	

	@Test
	public void fun6test(){
		try {
			HashMap<String, Object> map=new HashMap<String, Object>();
		 // map.put("123", 5);
			Assertutil.notEmpty2(map, "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun7test(){
		try {
			//Assertutil.hasText("", "这是提示错误信息");
			Assertutil.hasText("dsd", "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun8test(){
		try {
			Assertutil.greaterThanZero(5, "这是提示错误信息");
			//Assertutil.greaterThanZero(-5, "这是提示错误信息");
		} catch (CRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
