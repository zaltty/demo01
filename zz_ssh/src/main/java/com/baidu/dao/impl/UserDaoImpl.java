package com.baidu.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.baidu.dao.UserDao;
import com.baidu.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:56:21 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findById(Integer id) {
          
        return getHibernateTemplate().get(User.class, id);
    }

}
  
