
package f.project.dao;

import f.project.dto.UserDto;

/**
 *
 * @author jvaldez
 */
public class UserDao {

    public boolean findUser(UserDto obj) {
        String userBD = "uni";
        String userPWS = "fiis";
        boolean flag = false;

        if ((obj.getUsername().equals(userBD)) && (obj.getPassword().equals(userPWS))) {
            flag = true;
        }
        return flag;
    }
}
