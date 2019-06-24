/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.taller.ctl;

import uni.taller.dto.UserDto;
import uni.taller.model.UserModel;

/**
 *
 * @author jvaldez
 */
public class UserCtl {

    /*
    
     */
    public boolean validateLogin(UserDto  obj) {
        UserModel userModel=new UserModel();
        return userModel.findUser(obj);
    }

}
