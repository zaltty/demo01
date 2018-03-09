package com.baidu.web;

import com.baidu.domain.User;
import com.baidu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:58:14 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User model;
    @Override
    public User getModel() {
          if (model==null) {
            model= new User();
        }
        return model;
    }
    
    private Integer id;
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    private UserService userService;
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public String  findById(){
        System.out.println("Action ...findById..."+model.getId());
        model = userService.findById(model.getId());
        return SUCCESS;
    }

}
  
