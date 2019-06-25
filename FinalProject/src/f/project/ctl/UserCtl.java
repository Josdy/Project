
package f.project.ctl;

import f.project.dto.UserDto;
import f.project.dao.UserDao;

public class UserCtl {

    public boolean validateLogin(UserDto  obj) {
        UserDao userModel=new UserDao();
        return userModel.findUser(obj);
    }

}
