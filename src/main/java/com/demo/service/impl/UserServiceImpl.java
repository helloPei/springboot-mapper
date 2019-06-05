package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import com.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * User接口实现类
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public PageInfo<User> findAllUser() {
		//return userMapper.findAllUser();
		//return userMapper.selectAll();
		//分页查询,显示第一页,每页十条,按id降序
        PageHelper.startPage(1,10,"id desc");
        List<User> userList = userMapper.selectAll();
        //使用的时候Pagehelper会自动填充PageInfo,你只需将查到的信息填充就好
        return new PageInfo<User>(userList);
	}
	
}