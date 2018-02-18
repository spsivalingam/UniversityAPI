package uncc.api.uncc.api.Service;

import uncc.api.uncc.api.Entity.User;

/**
 * Created by sivalingam on 2/10/2018.
 */
public interface UserInterface {

    User validUser(User user);
    void userSignUp(User user);
}
