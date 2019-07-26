/**
 * 
 */
package com.ptx.cms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ptx.cms.dao.UserMapper;
import com.ptx.cms.domain.User;
import com.ptx.cms.service.UserService;

/**
 * 说明:用户服务
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2019年3月27日 下午1:10:12
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	protected UserMapper userMapper;
	
	/* (non-Javadoc)
	 * @see com.bawei.cms.service.impl.UserService#get(int)
	 */
	@Override
	public User get(int id){
		return userMapper.selectById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.bawei.cms.service.impl.UserService#get(java.lang.String)
	 */
	@Override
	public User get(String username){
		return userMapper.selectByUsername(username);
	}

	@Override
	public int count(User conditions) {
		return userMapper.count(conditions);
	}

	@Override
	public void updateByid(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByid(user);
	}

	@Override
	public User selectById(Integer id) {
		return userMapper.selectById(id);

	}

	@Override
	public void updateAvater(User user) {
		// TODO Auto-generated method stub
		userMapper.updateAvater(user);
	}

	
}
