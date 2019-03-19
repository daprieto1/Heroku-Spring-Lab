package edu.eci.controllers;

import edu.eci.models.User;
import edu.eci.services.contracts.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserServices userServices;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public User getUser(User user){
        return userServices.create(user);
    }
}
