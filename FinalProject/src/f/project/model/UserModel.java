
package uni.taller.model;

import uni.taller.dto.UserDto;

/**
 *
 * @author jvaldez
 */
public class UserModel {

    public boolean findUser(UserDto obj) {
        String userBD = "uni";
        String userPWS = "fiis";
        boolean swt = false;

        if ((obj.getUsername().equals(userBD)) && (obj.getPassword().equals(userPWS))) {
            swt = true;
        }
        return swt;
    }
}
