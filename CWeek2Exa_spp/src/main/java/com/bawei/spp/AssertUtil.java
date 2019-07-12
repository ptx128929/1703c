package com.bawei.spp;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	
	/**
	 * 1. 断言为真
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void isTrue(boolean exp,String message){	
		if(!exp){
			throw new CRuntimeException(message);
		}		
	}
	
	
	/**
	 * 2. 断言为假
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void isFalse(boolean exp,String message){	
		if(exp){
			throw new CRuntimeException(message);
		}		
	}
	
	/**
	 * 3. 断言对象不为空
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void isNotNull(String exp,String message){	
		if(exp == null||exp.length()==0){
			throw new CRuntimeException(message);
		}		
	}
	
	public static void isNotNull2(Object exp,String message){	
		if(exp == null){
			throw new CRuntimeException(message);
		}		
	}
	
	/**
	 * 4. 断言对象为空
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void isNull(String exp,String message){	
		if(exp.length()>0){
			throw new CRuntimeException(message);
		}		
	}
	
	public static void isNull2(Object exp,String message){	
		if(exp != null){
			throw new CRuntimeException(message);
		}		
	}
	
	/**
	 * 5. 断言 List 或 Set 集合不为空，没有元素也算空
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void collectionNotNull(Collection<?> col,String message){
		if(col == null || col.size()==0){
			throw new CRuntimeException(message);
		}
	}
	
	/**
	 * 6. 断言 Map 集合不为空，没有元素也算空
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void mapNotNull(Map<?, ?> map,String message){
		if(map == null || map.size()==0){
			throw new CRuntimeException(message);
		}
	}
	
	/**
	 * 7. 断言字符串必须有值，去掉空格后，长度必须大于 0
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void isLength(String exp,String message){	
		if(!(exp.trim().length() > 0)){
			throw new CRuntimeException(message);
		}		
	}
	
	
	/**
	 * 8. 断言值必须是正数(值大于 0)
	 * @param exp 为true或者false
	 * @param message 为错误信息
	 */
	public static void absInt(int exp,String message){	
		if(exp <= 0){
			throw new CRuntimeException(message);
		}		
	}
	
	
}
