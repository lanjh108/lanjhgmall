package gmall.atguigu.com.user.controller;


import gmall.atguigu.com.user.beans.UmsMember;
import gmall.atguigu.com.user.beans.UmsMemberReceiveAddress;
import gmall.atguigu.com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("getAddressList")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAllUsers(String memberId) {
        List<UmsMemberReceiveAddress> addressList = userService.getUmsMemberReceiveAddressByMemberId(memberId);
        return addressList;
    }


    @RequestMapping("getAllUsers")
    @ResponseBody

    public List<UmsMember> getAllUsers() {
        return userService.getAllUsers();
    }


    @RequestMapping("index")
    @ResponseBody
    public String hello() {
        return "hello gmall by springboot";
    }
}
