package com.demo.service;

//import java.util.List;

import com.demo.pojo.User;
import com.github.pagehelper.PageInfo;
/**
 * User业务层接口
 * @author Administrator
 *
 */
public interface UserService {
	PageInfo<User> findAllUser();
}