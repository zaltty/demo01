package com.baidu.dao;

import com.baidu.domain.User;

/**  
 * ClassName:UserDao <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:55:53 <br/>       
 */
public interface UserDao {

    User findById(Integer id);

}
  
