package uncc.api.uncc.api.Service;

import org.springframework.stereotype.Service;
import uncc.api.uncc.api.Entity.User;
import uncc.api.uncc.api.Repository.UserRepository;

/**
 * Created by sivalingam on 2/10/2018.
 */
@Service
public class UserService implements UserInterface {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public User validUser(User user) {

        // retrive user based on uId and compare both objects retrived one and the one passed as parameter
        User u = userRepository.findByuser_id(user.getuId());
        if(u.equals(user)){
            return u;
        }
        else{
            throw new RuntimeException();
        }

    }

    @Override
    public void userSignUp(User user) {
        userRepository.save(user);

    }
}
