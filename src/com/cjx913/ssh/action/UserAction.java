package com.cjx913.ssh.action;

import com.cjx913.ssh.entity.User;
import com.cjx913.ssh.service.UserService;
import com.cjx913.ssh.utils.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private static final long serialVersionUID = 1010206991688047850L;
    private User user = new User();
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public User getModel() {
        return user;
    }



    public String login(){
       user.setPassword(StringUtils.getMD5Value(user.getPassword()));
       user = userService.findUserByNameAndPassword(user);
        if(user==null){
            return ERROR;
        }
        return "login";
    }

    public String register(){
        User user = new User();
        user.setUsername(this.user.getUsername());
       user.setPassword(StringUtils.getMD5Value(this.user.getPassword()));
        userService.saveUser(user);
        return "register";
    }
}
