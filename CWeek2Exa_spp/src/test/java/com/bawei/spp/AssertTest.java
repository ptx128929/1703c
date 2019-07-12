package com.bawei.spp;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void fun1Test(){
		try {
			AssertUtil.isTrue(false, "这不是一个true");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2Test(){
		try {
			AssertUtil.isFalse(true, "这不是一个false");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		try {
			AssertUtil.isNotNull(" ", "这不是一个字符串");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4Test(){
		try {
			AssertUtil.isNull("", "这是一个字符串");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun5Test(){
		try {
			
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(55);
			AssertUtil.collectionNotNull(arrayList, "这不是一个集合或者集合为空");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun6Test(){
		try {
			HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
			hashMap.put(44, "1703C");
			
			AssertUtil.mapNotNull(hashMap, "这不是一个map集合或者map集合为空");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun7Test(){
		try {
			AssertUtil.isLength("sdfsd sdfc sdfc", "这不是一个字符串");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun8Test(){
		try {
			AssertUtil.absInt(-56, "这不是一个整数");
		} catch (CRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
}
