package com.baidu.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.baidu.dao.UserDao;
import com.baidu.domain.User;
import com.baidu.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:57:27 <br/>       
 */
@Transactional
public class UserServiceImpl implements UserService {

    
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

}
  
