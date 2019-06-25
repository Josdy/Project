/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f.project.ctl;

import f.project.dto.UserDto;
import f.project.dao.UserDao;

/**
 *
 * @author jvaldez
 */
public class UserCtl {

    /*
    
     */
    public boolean validateLogin(UserDto  obj) {
        UserDao userModel=new UserDao();
        return userModel.findUser(obj);
    }

}
