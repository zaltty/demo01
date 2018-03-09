package com.baidu.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.baidu.dao.UserDao;
import com.baidu.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findById(Integer id) {
          
        return getHibernateTemplate().get(User.class, id);
    }

}
  
