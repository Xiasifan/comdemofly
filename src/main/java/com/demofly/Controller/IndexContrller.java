package com.demofly.Controller;

import com.demofly.mapper.TUserMapper;
import com.demofly.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class IndexContrller {

    @Autowired
    TUserMapper userMapper;

    @RequestMapping(value = {"index","/"})
    public String index(Model model){
        model.addAttribute("name","index");
        return "index";
    }

    @RequestMapping("login")
    @ResponseBody
    public TUser login(TUser user){
        return user;
    }
    @RequestMapping("getbyid")
    @ResponseBody
    public TUser login(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}

