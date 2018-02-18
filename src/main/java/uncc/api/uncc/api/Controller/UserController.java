package uncc.api.uncc.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uncc.api.uncc.api.Entity.User;
import uncc.api.uncc.api.Service.UserInterface;

/**
 * Created by sivalingam on 2/10/2018.
 */
@Controller
@ResponseBody
@RequestMapping(value = "/users")
public class UserController {

    private UserInterface userService;

    @Autowired
    public UserController(UserInterface userService){
        this.userService=userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User login(@RequestBody User user){
        return userService.validUser(user);
    }

    @RequestMapping(value = "/signup", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    public void addUser(@RequestBody  User user){

        userService.userSignUp(user);

    }
}
