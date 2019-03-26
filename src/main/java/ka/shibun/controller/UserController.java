package ka.shibun.controller;

import ka.shibun.domain.User;
import ka.shibun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(){
        return userService.selectAll();
    }
}